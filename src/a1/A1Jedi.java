package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		// Collaborated with classmate Fayyaz Sulman


		//copied code from Adept
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




				for (int n=0; n<storeItems; n++) {
					if (nameOfCurrFood.equals(itemName[n])) {
						howManyCustomers[n] = n + 1;
						howManyItems[n] = n + numberOfFood;





					}
				}





			}

			// second nested for loop to calculate total price of that unique item

			// for (int l = 0; l < storeItems; l++) {
			//	if(nameOfCurrFood.equals(itemName[l])) {
			//		priceOfCart[j] += numberOfFood * itemPrice[l];

			for (int m=0; m<storeItems; m++) {
				if (howManyItems[m] < 1) {
					System.out.println("No customers bought " + itemName[m]);
					
				} else {
					
					System.out.println(howManyCustomers[m] + " customers bought " + howManyItems[m] + " " + itemName[m]);

				}
			}

		}
	}
	// end second nested for loop
};
// end first nested for loop
