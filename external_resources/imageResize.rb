#!/usr/bin/ruby

require 'rubygems'
require 'RMagick'
require 'FileUtils'
include Magick

res=[32,36,48,50,64,72,114,128]
formats=['gif','png','jpg']
filename=ARGV[0]
image = ImageList.new(filename)
formats.each {|f| 
	res.each {|r|  
		image2 = image.resize(r,r)
		image2.write(filename[/[^\.]*/]+"_"+r.to_s+"."+f)
	}
}
FileUtils.mkdir "./res"
FileUtils.mkdir "./res/drawable-hdpi"
image2 = image.resize(72,72)
image2.write("./res/drawable-hdpi/icon.png")
FileUtils.mkdir "./res/drawable-mdpi"
image2 = image.resize(48,48)
image2.write("./res/drawable-mdpi/icon.png")
FileUtils.mkdir "./res/drawable-ldpi"
image2 = image.resize(36,36)
image2.write("./res/drawable-ldpi/icon.png")

exit
