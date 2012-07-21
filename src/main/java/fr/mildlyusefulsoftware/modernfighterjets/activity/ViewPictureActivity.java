package fr.mildlyusefulsoftware.modernfighterjets.activity;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.util.Log;
import fr.mildlyusefulsoftware.imageviewer.service.DatabaseHelper;
import fr.mildlyusefulsoftware.imageviewer.service.Picture;

public class ViewPictureActivity extends fr.mildlyusefulsoftware.imageviewer.activity.ViewPictureActivity {

	@Override
	protected String getAdMobId() {
		return "a1500152aed36d9";
	}

	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	//	putNewPictures();
	}
	
	private void putNewPictures(){
		String[] url =new String[]{
		"http://www.lankaweb.com/news/items07/AIR_MiG-29_lg.jpg",
		"http://topnews.in/files/jf-17.jpg",
		"http://media.defenseindustrydaily.com/images/AIR_F-35_Left_Wingover_Rear_View_lg.jpg",
		"http://www.willisms.com/archives/tomcat.jpg",
		"http://library.thinkquest.org/4027/stealth.GIF",
		"http://www.japanfocus.org/data/F22.jpg",
		"http://3.bp.blogspot.com/_2istSpJf6tk/TCc6Io_vwUI/AAAAAAAAAaQ/t-t6xtgkF_c/s1600/Sukhoi-30%25201.jpg",
		"http://www.vasc.org/images/harv.jpg",
		"http://www.therightcontext.com/wp-content/uploads/2012/01/F-15_Eagle.jpg",
		"http://media.defenseindustrydaily.com/images/AIR_F-35A_AA-1_Flight_Top_lg.jpg",
		"http://www.rohama.org/files/en/news/2009/12/15/2678_290.jpg",
		"http://www.aviationnews.eu/blog/wp-content/uploads/2009/11/SU-35S_prototype.jpg",
		"http://www.hightech-edge.com/wp-content/uploads/f117-stealth-fighter.jpg",
		"http://www.richard-seaman.com/Aircraft/AirShows/Edwards2006/Highlights/F117Banking2006.jpg",
		"http://www.f15model.com/wp-content/uploads/2010/08/royal-saudi-airforce-operation-desert-shield.jpg",
		"http://cooltop10.com/wp-content/uploads/2010/05/military-aviation.jpg",
		"http://web.deu.edu.tr/atiksu/ana47/f-22-31.jpg",
		"http://www.richard-seaman.com/Aircraft/AirShows/Maks2005/Highlights/FourSwiftsStacked.jpg",
		"http://www.rcaf-arc.forces.gc.ca/v2/equip/resrc/images/hst/l-g/arch45.jpg",
		"http://www.hyebiz.com/wp-content/uploads/2012/06/future_russian_fighters.jpg",
		"http://www.vostokstation.com.au/aircraft/images/Su-30Mk.jpg",
		"http://i.ytimg.com/vi/MH_BiUTuuGg/0.jpg",
		"http://www.milavia.net/news/images/fa-18e.jpg",
		"http://4.bp.blogspot.com/_umR5TziNRUA/S7A-fBaRaKI/AAAAAAAAA1I/R0NA7yzxV7g/s1600/Sweden_JAS+39+Gripen_flight_montage_opt600x400_aereo.jor.br.jpg",
		"http://wiki-images.enotes.com/thumb/4/46/Lockheed_Martin_F-22A_Raptor_JSOH.jpg/300px-Lockheed_Martin_F-22A_Raptor_JSOH.jpg",
		"http://4.bp.blogspot.com/-4EIAdZupYzc/ToRrKQVPAnI/AAAAAAAACSM/VUR8yyIqeQI/s1600/f22_Raptor_Crash-topshot.jpg",
		"http://img.ehowcdn.com/article-new/ehow/images/a05/ak/bu/first-jet-plane-made-usa_-800x800.jpg",
		"http://www.yeovilpeople.co.uk/images/localpeople/ugc-images/275706/Article/images/12767273/2946062.png",
		"http://updatedtrends.com/wp-content/uploads/2011/03/Sukhoi-T-50-PAK-FA.jpg",
		"http://clatl.com/binary/dd01/f22_6.jpg",
		"http://2.bp.blogspot.com/-4i8oKQk3dM8/ToRqU4SLOZI/AAAAAAAACSE/aU2zyZSQvgk/s1600/f-16c-19990601-f-0073c-005.jpg",
		"http://www.spectrum.ieee.org/images/nov05/images/flyf3.jpg",
		"http://www.aerospaceweb.org/aircraft/fighter/f18ef/f18e_10.jpg",
		"http://con9a.files.wordpress.com/2009/03/f-22-1.jpg",
		"https://lh6.googleusercontent.com/-_i0Bk04-YI8/TIL1KEsLb8I/AAAAAAAAXx0/SOSvwttvWQY/blue-angels-oceana-2008.jpg",
		"http://wallpaper.searchrealm.com/Jets/jet-F-22Raptor.jpg",
		"http://www.examiner.com/images/blog/wysiwyg/image/fighter(3).JPG",
		"http://3.bp.blogspot.com/-tr6jGootnj8/ToRqmyGK1yI/AAAAAAAACSI/F8rwx8lXgDE/s1600/F-15C-Eagle.jpg",
		"http://www.jet-fighter-rides.com/aaa/2011/05/su-27-2.jpg",
		"http://s3.amazonaws.com/readers/2009/11/17/f22climbingwithafterburner1_1.jpg",
		"http://www.flymigsokol.com/files/photos/mig/31/mig21.jpg",
		"http://www.jetride.com.au/wp-content/uploads/2009/08/l39-in-flight-22.jpg",
		"http://www.amazingpaperairplanes.com/Eagle_F-15/F-15_Eagle_USAF_Photo.jpg"
		
		
		};
		int i=40;
		List<Picture> pictures=new ArrayList<Picture>();
		for (int j=0;j<url.length;j++){
			try {
				Log.i("modernfighterjets",url[j]);
				Picture p = new Picture(j+i, url[j],Picture.getPictureThumbnail(url[j]));
				pictures.add(p);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		DatabaseHelper.connect(this).putPictures(pictures);
	}


}
