package gift;

import java.util.Scanner;

public class Menu {

	public static void startMenu() {
		NewYearGift gift = new NewYearGift(BoxType.CARDBOARD_CASE);
		
		System.out.println("Welcome to the New Year Gift creator!");
		System.out.println("1.Add sweet\n2.Delete sweet\n3.Print gift info\n4.Exit");

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
				gift.printInfo();
				break;
			case 4:
				exit = true;
				break;
			default:
				break;
			}
		}

		scan.close();
	}

}
