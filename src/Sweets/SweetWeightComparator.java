package Sweets;

import java.util.Comparator;

public class SweetWeightComparator implements Comparator<Sweet>{

	@Override
	public int compare(Sweet o1, Sweet o2) {
		if (o1.weight-o2.weight < 0) {
			return -1;
		} else if (o1.weight-o2.weight > 0) {
			return 1;
		} else {
			return 0;
		}
	}

}
