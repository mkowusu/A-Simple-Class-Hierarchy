//pre-conditions:
//	Item is needed as super class

package simpleClassHierarchy;

public class Beverage extends Item {

	// Beverages have 2 special fields
	private int fluidOunces;
	private double containerDeposit;

	// Create Beverage object 
	public Beverage (String name, int cost, int fluidOz, double containerDpt) {
		super(name, cost);
		fluidOunces = fluidOz;
		containerDeposit = containerDpt;
	}

	// Method to return the cost per unit of a Beverage item
	public static double costPerUnit(Beverage bev){
		return bev.cost/bev.fluidOunces;
	}

	// toString method to yield nicely formatted output string
	public String toString () {
		return super.toString()
				+ "Container Deposit:  " + containerDeposit  
				+ "\nFluid Ounces:  " + fluidOunces + "\n\n";
	}

	// Method to return cost of a Beverage Item
	public static double getCost (Beverage bev){
		return bev.cost + bev.containerDeposit;
	}

	// Main to test/show Beverage item functionality 
	public static void main (String [] argv) {

		// set up and print three and print three objects

		Beverage D = new Beverage ("Coke", 1, 8, .1);
		Beverage E = new Beverage ("Beer", 4, 40, .05);		
		Beverage F = new Beverage ("Water", 3, 32, 0);


		System.out.print("Beverage D:  " + D);
		System.out.print("Beverage E:  " + E);
		System.out.print("Beverage F:  " + F);

		System.out.print("The price of the soup is: " + getCost(D) + "$");
		System.out.print("\nThe price of the beer is: " + getCost(E) + "$");
		System.out.print("\nThe price of the toilet paper is: " + getCost(F) + "$\n");

		System.out.print("\nCost per fluid ounce of " + D.name + " = " + costPerUnit(D) + "$");
		System.out.print("\nCost per fluid ounce of " + E.name + " = " + costPerUnit(E) + "$");
		System.out.print("\nCost per fluid ounce of " + F.name + " = " + costPerUnit(F) + "$");
	}
}

// Post-conditions:
	// 3 Beverage items are printed with their price, 
		// names, fluid ounces and container deposit included
	// The price is printed again to demonstrate getCost
	// Cost per unit prints cost per ounce