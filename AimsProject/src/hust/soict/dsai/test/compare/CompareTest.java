package hust.soict.dsai.test.compare;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class CompareTest {
    public static void main(String[] args) {
        Cart cart = new Cart();

		// create some media here
		// for example: cd, dvd, book
		CompactDisc cd1 = new CompactDisc("Son Tung MTP", "Album Special", "Classic", "Son Tung MTP", 24.55f);
		CompactDisc cd2 = new CompactDisc("Amee");

		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
				"Animation", "Roger Allers", 87, 19.95f);

		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
				"Science Fiction", "George Lucas", 87, 24.95f);

		Book b1 = new Book("1 Van Cau Hoi Vi sao", "Truyen", 80.25f);
		Book b2 = new Book("So Dua", "Truyen Co Tich", 40.5f);

//		cart.addMedia(cd1);
//		cart.addMedia(cd2);
//		cart.addMedia(dvd1);
//		cart.addMedia(dvd2);
//		cart.addMedia(b1);
//		cart.addMedia(b2);

        // Sort by Title, then Cost
        cart.sortByTitleCost();

        System.out.println("");

        // Sort by Cost, then Title
        cart.sortByCostTitle();
    }
}
