package Sweets;

import java.util.Comparator;

public class SweetNameComparator implements Comparator<Sweet> {

	@Override
	public int compare(Sweet o1, Sweet o2) {
		return o1.name.compareTo(o2.name);
	}
}
