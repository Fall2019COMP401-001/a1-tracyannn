package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// Your code follows here.



		int numberOfCustomers = scan.nextInt();
		// this for loop takes in one customer at a time
		for (int i=0; i<numberOfCustomers; i++) {
			String customerFirstName = scan.next();
			String customerLastName = scan.next();
			char c = customerFirstName.charAt(0); 
			int numItems = scan.nextInt();
			double total = 0;

			// this for loop takes in the number of items each customer has
			for (int j=0; j<numItems; j++) {
				int eachItem = scan.nextInt();
				String itemName = scan.next();
				double cost = scan.nextDouble();
				total += eachItem*cost;


			}

			System.out.println(c + ". " + customerLastName + ": " + String.format("%.2f", total));
		}



	}
}