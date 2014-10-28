//pre-conditions:
//	Item, Produce, Beverage, and Package are needed in package

package simpleClassHierarchy;

public class ShoppingCart{

	// Declarations
	private int maxSize;
	private static int currentSize;
	private static Item [] Cart;

	// Create ShoppingCart object
	ShoppingCart () {
		maxSize = 4;  // initial maximum
		currentSize = 0;
		Cart = new Item[maxSize];
	}// ShoppingCart Method

	// Method to add an item to ShoppingCart
	public void addItem (Item item) {
		// check if room in array, and double array size if needed
		if (currentSize == maxSize) {
			maxSize = 2*maxSize; 
			Item [] temp = new Item[maxSize];
			for (int i = 0; i < currentSize; i++)
				temp[i] = Cart[i];
			Cart = temp;  // update entryArray to the new, larger array
		}
		// add item to array
		int i = currentSize;
		Cart[i] = item;
		currentSize++;
	}

	// Method to print contents of ShoppingCart
	public void printCart () {
		System.out.println ("Shopping Cart Contents");
		for (int i = 0; i < currentSize; i++)
			// iterate through itemArray printing the objects
			System.out.print(Cart[i]);
		System.out.println ("End of Listing");
	}

	// Method to calculate and return total price of everything in the shopping cart
	public static int totalCost (ShoppingCart cart) {
		int totalCost = 0;
		for (int i = 0; i < currentSize; i++)
			totalCost = (int) (totalCost + Cart[i].cost);
		return totalCost;
	}

	// Method to find how many of the same Item are in ShoppingCart
	public static int numberInCart (String groceryName, ShoppingCart cart) {
		int numberInCart = 0;
		int test = -1;
		for (int i = 0; i < currentSize; i++){
			test = groceryName.compareTo(Cart[i].name); // Compare all items in cart to find multiples 
			if (test == 0)
				numberInCart++;
		}
		// I was able to implement this function using the compareTo function.
		// I did not have to augment my Item class because of this method.
		// I chose this approach because it the one that made most sense to me, I have 
		// experience using compareTo, and it was the easiest.
		return numberInCart;
	}


	// Main to demonstrate/test functionality of all programs
	public static void main (String [] argv) {
		// test of various methods

		// constructors
		ShoppingCart cart = new ShoppingCart();

		Package pack1 = new Package("Creme Cakes", 1, 1.2, 10, 6, 16);
		Package pack2 = new Package("12-Pack of Coke", 5, 8, 16, 8, 100);
		Package pack3 = new Package ("Text Books", 250, 12, 16, 12, 1000);

		Beverage bev1 = new Beverage ("Milk", 1, 8, .5);
		Beverage bev2 = new Beverage ("Beer", 4, 40, .5);
		Beverage bev3 = new Beverage ("Water", 3, 32, 1);

		Produce pro1 = new Produce("Apple", 1, .3, "Fruit");
		Produce pro2 = new Produce("Corn", 1, .5, "Vegetable");
		Produce pro3 = new Produce ("Clementine", 5, 1, "Fruit");

		// add entries to directory

		// Adding 2 packs of Creme Cakes for testing numberInCart
		cart.addItem(pack1);
		cart.addItem(pack1);

		cart.addItem(pack2);
		cart.addItem(pack3);

		cart.addItem(bev1);
		cart.addItem(bev2);
		cart.addItem(bev3);

		// Adding three Apples for testing
		cart.addItem(pro1);
		cart.addItem(pro1);
		cart.addItem(pro1);

		cart.addItem(pro2); 
		cart.addItem(pro3);


		// print directory
		cart.printCart();

		System.out.println("\nTotal cost of items in cart: " + (totalCost(cart)) + "$");

		System.out.println("\nTotal Number of Apples in Cart: "+ (numberInCart("Apple", cart)));
		System.out.println("\nTotal Number of Creme Cakes in Cart: "+ (numberInCart("Creme Cakes", cart)));

	}

}// Class ShoppingCart

// Post-Conditions
	// A cart is initialized with 12 items
	// The 12 items are printed
	// The total cost of items is calculated and displayed
	// The multiples of Apples and Creme Cakes are printed


