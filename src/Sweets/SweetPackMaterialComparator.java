package Sweets;

import java.util.Comparator;

public class SweetPackMaterialComparator implements Comparator<Sweet> {

	@Override
	public int compare(Sweet o1, Sweet o2) {
		return o1.packMaterial.compareTo(o2.packMaterial);
	}
}
