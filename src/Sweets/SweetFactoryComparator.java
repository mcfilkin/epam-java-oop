package Sweets;

import java.util.Comparator;

public class SweetFactoryComparator implements Comparator<Sweet> {

	@Override
	public int compare(Sweet o1, Sweet o2) {
		return o1.factory.compareTo(o2.factory);
	}
}
