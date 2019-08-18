package week1.day9.assignment3;

import java.util.ArrayList;
import java.util.List;

public class TVMain {

	public static void main(String[] args) {
		tvShelf shelf = new tvShelf();
		
		shelf.addTv(new HDTV(32, "Sony"));
		shelf.addTv(new HDTV(42, "Sony"));
		shelf.addTv(new HDTV(51, "Panasonic"));
		shelf.addTv(new HDTV(60, "Panasonic"));
		shelf.addTv(new HDTV(54, "Samsung"));
		
		List<HDTV> tvList = shelf.getTvs();
		
		System.out.println(tvList);
		
		tvList.sort(new TvCompare());
		
		System.out.println(tvList);
	}
}
