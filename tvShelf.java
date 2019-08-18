package week1.day9.assignment3;

import java.util.ArrayList;
import java.util.List;

public class tvShelf {
	private List<HDTV> tvs;
	
	public void addTv (HDTV addition) {
		tvs.add(addition);
	}

	public tvShelf() {
		this.tvs = new ArrayList<HDTV>();
	}
	
	public List<HDTV> getTvs () {
		return tvs;
	}
}
