//pre-conditions:
//	Item is needed as superClass

package simpleClassHierarchy;

public class Produce extends Item {

	// Produce Items have 2 special fields
	private double pounds;
	private String category;

	// Create Produce object
	public Produce (String name, double cost, double lbs, String ctg) {
		super(name,cost);
		pounds = lbs;
		category = ctg;
	}

	// toString method to yield nicely formatted output string
	public String toString () {
		return super.toString()
				+ "Weight:  " + pounds + " lbs."  
				+ "\nCategory:  " + category + "\n\n";
	}

	// Method to return the cost per unit of a produce item
	public static double costPerUnit(Produce pro){
		return pro.cost/pro.pounds;
	}

	// Main to test/show Produce item functionality 
	public static void main (String [] argv) {

		// set up and print three objects
		Produce G = new Produce ("Apple", .5, 1, "Fruit");
		Produce H = new Produce ("Corn", 1, 3, "Vegetable");		
		Produce I = new Produce ("Clementine", 5, 2, "Fruit");

		// print items using the toString feature
		System.out.print("Produce G:  " + G);
		System.out.print("Produce H:  " + H);
		System.out.print("Produce I:  " + I);

		// Show/test functionality of costPerUnit method
		System.out.print("The unit price of " + G.name + " is: " + costPerUnit(G));
		System.out.print("\nThe unit price of " + H.name + " is: " + costPerUnit(H));
		System.out.print("\nThe unit price of " + I.name + " is: " + costPerUnit(I));

	}
}

// Post-Conditions:
	// 3 Produce items are created
	// the items are printed with their name, cost, category, and weight
	// Their unit price is also printed