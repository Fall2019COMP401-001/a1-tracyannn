package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		// Collaborated with classmate Fayyaz Sulman
		// With help from TAs
		
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
				
				// second nested for loop to calculate total price of that unique item
				
				for (int l = 0; l < storeItems; l++) {
					if(nameOfCurrFood.equals(itemName[l])) {
						priceOfCart[j] += numberOfFood * itemPrice[l];
					}
				}
				// end second nested for loop
			}
			// end first nested for loop
		}
		// end parent for loop
		
			// line below used to test if the code works at this point

			// System.out.println(customerName[j] + ": " + "(" + String.format("%.2f",priceOfCart[j]) + ")");


			// wrong code below. 
			//			
			//			int[] eachItem = new int[items];
			//			String[] itemType = new String[items];
			//			for (int k=0; k<items; k++) {
			//				int numberofFood = scan.nextInt();
			//				String foodName = scan.next();
			//				eachItem[k] = numberofFood;
			//				itemType[k] = foodName;
			//			
			//
			//			int m = 0;
			//			for (int l=0; l<storeItems; l++) {
			//				if (itemType[m].equals(itemName[l])) {
			//					priceOfCart[j] += itemPrice[l] * eachItem[m]; 
			//					m++;
			//					// itemType[m] == itemName[l]
			//					// itemName[l] == itemType[m]
			//				} 
			//				if (m>=items) {
			//					break;
			//				}
			//
			//			}
			//			}
			//			
			//
			//			System.out.println(customerName[j] + ": " + "(" + String.format("%.2f",priceOfCart[j]) + ")");

		



		//		double totalSum = 0;
		// double average;
		//		
		//		for (int p=0; p<= numberOfCustomers; p++) {
		//			
		//			totalSum += priceOfCart[p];
		//			
		//		}
		//		
		//		average = totalSum / priceOfCart.length;
		
		
		
// calculates biggest, average, and smallest in that order

		double biggest = priceOfCart[0];
		int biggestPrice = 0;

		for (int m=0; m<numberOfCustomers; m++) {
			if (biggest <= priceOfCart[m]) {
				biggest = priceOfCart[m]; 
				biggestPrice = m;

			}
		}






		double totalSum = 0;
		double average = 0.00;

		for (int n=0; n<numberOfCustomers; n++) {
			totalSum += priceOfCart[n];
		}
		average = totalSum / numberOfCustomers;

		double lowest = priceOfCart[0];
		int lowestPrice = 0;
		for (int o=0;o<numberOfCustomers; o++) {
			if (lowest >= priceOfCart[o]) {
				lowest = priceOfCart[o];
				lowestPrice = o;
			}
		}


		System.out.println("Biggest: " + customerName[biggestPrice] + " (" + String.format("%.2f",biggest) + ")");
		System.out.println("Smallest: " + customerName[lowestPrice] + " (" + String.format("%.2f", lowest) + ")");
		System.out.println("Average: " + String.format("%.2f",average));

		
		// wrong code below
		
		
		// for (int n=0; n<numberOfCustomers; n++) {
		//	if (priceOfCart[n]>priceOfCart[n+1]) {

		//	}



		// System.out.println("Biggest: " + )
		//	}
	}
}


