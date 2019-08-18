package Sweets;

import java.util.Comparator;

public class SweetEnergyValueComparator implements Comparator<Sweet>{

	@Override
	public int compare(Sweet o1, Sweet o2) {
		if (o1.energyValue-o2.energyValue < 0) {
			return -1;
		} else if (o1.energyValue-o2.energyValue > 0) {
			return 1;
		} else {
			return 0;
		}
	}

}

