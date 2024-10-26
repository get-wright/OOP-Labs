import java.util.Arrays;

public class Aims {
	public static void main(String[] args) {
		Cart minhOrder = new Cart();

		// Create new DVD objects and add them to the cart
		DigitalVideoDisc alt1 = new DigitalVideoDisc("Toy Story",
        "Animation", "John Lasseter", 81, 18.95f);

		DigitalVideoDisc alt2 = new DigitalVideoDisc("Blade Runner",
				"Science Fiction", "Ridley Scott", 117, 23.95f);

		DigitalVideoDisc alt3 = new DigitalVideoDisc("Zootopia",
				"Animation", "Byron Howard", 108, 20.95f);

		DigitalVideoDisc alt4 = new DigitalVideoDisc("The Avengers",
				"Action", 24.99f);

		minhOrder.addDigitalVideoDisc(alt1);
		minhOrder.addDigitalVideoDisc(alt2);
		minhOrder.addDigitalVideoDisc(alt3);
		minhOrder.addDigitalVideoDisc(alt4);

		System.out.println("Total cost is: ");
		System.out.println(minhOrder.totalCost());
		System.out.println(Arrays.toString(minhOrder.getItemsOrdered()));

		minhOrder.removeDigitalVideoDisc(alt2);
		System.out.println("Total cost is: ");
		System.out.println(minhOrder.totalCost());

		System.out.println(Arrays.toString(minhOrder.getItemsOrdered()));
	}
}
