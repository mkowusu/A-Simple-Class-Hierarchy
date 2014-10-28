//pre-conditions:
//	no additional
//		Just run the program

package simpleClassHierarchy;

public class Item {

	// Declarations
	protected String name;
	protected double cost;

	public Item () {
		name = "";
		cost = 0;
	}

	public Item (String Name, double Cost){
		name = Name;
		cost = Cost;
	}

	// Method to return cost of an item
	public static double getCost (Item item){
		return item.cost;
	}

	// Method to return cost per unit of an item
	public static double costPerUnit (Item item){
		return item.cost;
	}

	// toString method to yield nicely formatted output string
	public String toString () {
		return  "\nName: " + name +
				"\nCost: " + 	cost + "$\n";
	}


	// Main to test and show Item Class functionality
	public static void main (String [] argv) {

		// set up three and print three objects
		Item A = new Item ("Soup", 1);
		Item B = new Item ("Beer", 2);		
		Item C = new Item ("Toilet Paper", 3);

		// print items using the toString feature
		System.out.print("Item A: " + A + "\n");
		System.out.print("Item B: " + B + "\n");
		System.out.print("Item C: " + C + "\n");

		// Show/test the getCost method
		System.out.print("The price of the soup is: " + getCost(A));
		System.out.print("\nThe price of the beer is: " + getCost(B));
		System.out.print("\nThe price of the toilet paper is: " + getCost(C));

		// Show/test the getCost method
		System.out.print("\n\nThe unit price of " + A.name + " is: " + costPerUnit(A));
		System.out.print("\nThe unit price of " + B.name + " is: " + costPerUnit(B));
		System.out.print("\nThe unit price of " + C.name + " is: " + costPerUnit(C));

	}

}

// Post-Conditions
	// 3 Items are created and printed with name and costs
	// Their costs are displayed again by getCost function
	// The unit price for each item is printed