package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		// Collaborated with classmate Fayyaz Sulman


		//copied some code from Adept
		// create store items array
		int storeItems = scan.nextInt();
		String[] itemName = new String[storeItems];
		double[] itemPrice = new double[storeItems];
		for (int i=0; i<storeItems; i++) {
			itemName[i] = scan.next();
			itemPrice[i] = scan.nextDouble();
		}
		// end store items array


		// creates customer name and cart total array

		int numberOfCustomers = scan.nextInt();
		String[] customerName = new String[numberOfCustomers];
		double[] priceOfCart = new double[numberOfCustomers];
		int[] howManyCustomers = new int[storeItems];
		int[] howManyItems = new int[storeItems];
		int[] var1 = new int[storeItems];


		// first for loop for each individual customer

		for (int j=0; j<numberOfCustomers; j++) {
			String firstName = scan.next();
			String lastName = scan.next();
			String name = firstName + " " + lastName;
			customerName[j] = name;
			int items = scan.nextInt();

			// first nested for loop for each unique item in one customer's cart

			for (int k = 0; k < items; k ++) {
				int numberOfFood = scan.nextInt();
				String nameOfCurrFood = scan.next();
				

				// second nested for loop to test whether that unique item matches up with the same index at the store item array.
				// this is so we can test whether any customers bought that particular item

				for (int n=0; n<storeItems; n++) {
					if (nameOfCurrFood.equals(itemName[n])) {
						var1[n] += 1;
						if (var1[n] > 1) {
							howManyItems[n] += numberOfFood;
						} else {
							howManyCustomers[n] += 1;
							howManyItems[n] += numberOfFood;
						}
					}
				}
			}
			int[] var2 = new int[storeItems];
			var1 = var2;
		}

		for (int m=0; m<storeItems; m++) {
			if (howManyItems[m] < 1) {
				System.out.println("No customers bought " + itemName[m]);
			} else {
				System.out.println(howManyCustomers[m] + " customers bought " + howManyItems[m] + " " + itemName[m]);
			}
		}

	}
}
