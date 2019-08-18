package gift;

import java.util.Scanner;

import Sweets.SweetProperty;

public class Menu {
	
	public static void sortMenu(Scanner scan, NewYearGift gift) {
		System.out.println("Choose parameter for sort: ");
		System.out.println("1) Name");
		System.out.println("2) Weight");
		System.out.println("3) Energy value");
		System.out.println("4) Pack material");
		System.out.println("5) Factory");
		switch (scan.nextInt()) {
		case 1:
			gift.sortByParameter(SweetProperty.NAME);
			break;
		case 2:
			gift.sortByParameter(SweetProperty.WEIGHT);
			break;
		case 3:
			gift.sortByParameter(SweetProperty.ENERGY_VALUE);
			break;
		case 4:
			gift.sortByParameter(SweetProperty.PACK_MATERIAL);
			break;
		case 5:
			gift.sortByParameter(SweetProperty.FACTORY);
			break;
		default:
			break;
		}
		System.out.println("Successes sorted!");
	}

	public static void startMenu() {
		NewYearGift gift = new NewYearGift();
		
		System.out.println("Welcome to the New Year Gift creator!");
		System.out.println("1.Add sweet\n2.Delete sweet\n3.Sort\n4.Find\n5.Info\n6.Generate by default\n7.Exit");

		Scanner scan = new Scanner(System.in);

		boolean exit = false;
		while (!exit) {
			switch (scan.nextInt()) {
			case 1:
				break;
			case 2:
				System.out.print("Index of item for delete: ");
				gift.deleteSweet(scan.nextInt());
				break;
			case 3:
				sortMenu(scan, gift);
				break;
			case 4:			
				break;
			case 5:
				gift.printInfo();
				break;
			case 6:
				gift.generateDefaultContent();
				System.out.println("Default items added!");
				break;
			case 7:
				exit = true;
				System.out.println("Goodbye! Happy New Year!");
				break;
			default:
				break;
			}
		}

		scan.close();
	}

}
