package gift;

import java.util.Arrays;

public class NewYearGift {
	private Sweet[] gift;
	private String receiverName;
	private BoxType boxType;
	
	public NewYearGift(BoxType boxType) {
		this.gift = new Sweet[0];
		this.boxType = boxType;
	}

	public NewYearGift(Sweet[] sweets) {
		this.gift = sweets.clone();
	}

	public void addSweet(Sweet sweet) {
		Sweet[] newGift = Arrays.copyOf(gift, gift.length + 1);
		newGift[newGift.length - 1] = sweet;
		gift = newGift;
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
			System.out.println(counter + ") " + item.name);
			counter++;
		}
	}
	
	public int getSize() {
		return this.gift.length;
	}
	
	public void printTotalWeight() {
		double totalWeight = 0;
		
		for (Sweet item : this.gift) {
			totalWeight += item.weight;
		}
		
		System.out.println("Total weight of the gift: " + totalWeight + " kg");
	}
	
//	public Sweet findWithParameters() {
//		
//	}
	public void printInfo() {
		System.out.println("Items in gift:");
		printItems();
		printTotalWeight();
	}
}
