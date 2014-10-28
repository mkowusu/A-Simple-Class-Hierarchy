//pre-conditions:
//	Item is needed as super class

package simpleClassHierarchy;

public class Package extends Item {

	// Packages have 4 special fields
	private double length;
	private double width;
	private double height;
	private int ounces;

	// Create Package object
	public Package(String name, int cost, double h, double l, double w, int oz) {
		super(name, cost);
		length = l;
		width = w;
		height = h;
		ounces = oz;

	}

	// toString method to yield nicely formatted output string
	public String toString () {
		return super.toString()
				+ "Length:  " + length  
				+ "\nWidth:  " + width  
				+ "\nHeight:  " + height
				+ "\nWeight:  " + ounces + "\n\n";
	}

	//	// Main to test Package item functionality 
	public static void main (String [] argv) {

		// set up and print three and print three objects

		Package J = new Package ("Creme Cakes", 1, 1.2, 10, 6, 16);
		Package K = new Package ("12-Pack of Coke", 5, 8, 16, 8, 100);		
		Package L = new Package ("Text Books", 250, 12, 16, 12, 1000);


		System.out.print("Package J: " + J);
		System.out.print("Package K:  " + K);
		System.out.print("Package L:  " + L);
		//
	}
}

// Post-Condition:
	// 3 packages are initilized and printed