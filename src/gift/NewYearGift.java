package gift;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Comparator;

import Sweets.*;

public class NewYearGift {
	private Sweet[] gift;

	public NewYearGift() {
		this.gift = new Sweet[0];
	}

	public void addSweet(Sweet sweet) {
		Sweet[] newGift = Arrays.copyOf(gift, gift.length + 1);
		newGift[newGift.length - 1] = sweet;
		gift = newGift;
	}

	public void addSweet(Sweet sweet, int amount) {
		for (int i = 0; i < amount; i++) {
			addSweet(sweet);
		}
	}

	public void deleteSweet(int position) {
		Sweet[] newGift = new Sweet[gift.length - 1];
		for (int i = 0; i < position - 1; i++) {
			newGift[i] = gift[i];
		}
		for (int i = position; i < gift.length; i++) {
			newGift[i - 1] = gift[i];
		}
		gift = newGift;
	}

	public void cleanItems() {
		this.gift = new Sweet[0];
	}

	public void printItems() {
		int counter = 1;
		if (this.gift.length == 0) {
			System.out.println("No such sweets in the gift :\"c");
		}
		for (Sweet item : this.gift) {
			System.out.println(counter + ") " + item.getName());
			counter++;
		}
	}

	public int getSize() {
		return this.gift.length;
	}

	public void printTotalWeight() {
		double totalWeight = 0;

		for (Sweet item : this.gift) {
			totalWeight += item.getWeight();
		}
		DecimalFormat df = new DecimalFormat("#.###");

		System.out.println("Total weight of the gift: " + df.format(totalWeight) + " kg");
	}

	public Sweet findWithParameters() {
		Arrays. 
	}
	
	public void printInfo() {
		System.out.println("Items in gift:");
		printItems();
		printTotalWeight();
	}

	public void generateDefaultContent() {
		Candy candy1 = new Candy("Mishka na Servere", .02, 200, PackMaterial.CARDBOARD, "SIBERIA");
		Candy candy2 = new Candy("ShOkOzAvR-3000", .03, 300, PackMaterial.FOIL, "RED MOSCOW");
		Candy candy3 = new Candy("Kislinka", .04, 300, PackMaterial.NONE, "Saturn Sugar");
		Candy candy4 = new Candy("Raffaello", .08, 500, PackMaterial.PAPER, "Caramel Ocean");
		Candy candy5 = new Candy("Disco on the Mars", .001, 700, PackMaterial.POLYETHYLENE, "SVS Co.");
		addSweet(candy1, 3);
		addSweet(candy2, 2);
		addSweet(candy3, 5);
		addSweet(candy4, 2);
		addSweet(candy5, 7);
	}

	public void sortByParameter(SweetProperty sweetProperty) {
		Comparator<Sweet> comparator;
		switch (sweetProperty) {
		case WEIGHT:
			comparator = new SweetWeightComparator();
			break;
		case NAME:
			comparator = new SweetNameComparator();
			break;
		case ENERGY_VALUE:
			comparator = new SweetEnergyValueComparator();
			break;
		case FACTORY:
			comparator = new SweetFactoryComparator();
			break;
		case PACK_MATERIAL:
			comparator = new SweetPackMaterialComparator();
			break;
		default:
			return;
		}
		Arrays.sort(gift, comparator);
	}
}
