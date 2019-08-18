package week1.day9.assignment3;

import java.util.Comparator;

public class TvCompare implements Comparator<HDTV> {

	@Override
	public int compare(HDTV o1, HDTV o2) {
		if (o1.getSize() > o2.getSize())
			return 1;
		else if (o1.getSize() < o2.getSize())
			return -1;
		else // Sizes equal
			return 0;
	}
}
