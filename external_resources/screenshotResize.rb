#!/usr/bin/ruby

require 'rubygems'
require 'RMagick'
require 'FileUtils'
include Magick

formats=['gif','png']
filename=ARGV[0]
image = ImageList.new(filename)
formats.each {|f| 
	image2 = image.resize(480,800)
	image2.write(filename[/[^\.]*/]+"_480x800."+f)
	image2 = image.resize(192,320)
	image2.write(filename[/[^\.]*/]+"_192x320."+f)
}

exit
