package hust.soict.dsai.test.compare;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class CompareTest {
    public static void main(String[] args) {
        Cart cart = new Cart();

		CompactDisc cd1 = new CompactDisc("Taylor Swift", "Album Red", "Pop", "Taylor Swift", 29.99f);
		CompactDisc cd2 = new CompactDisc("Blackpink");
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("Inception", "Science Fiction", "Christopher Nolan", 148, 24.95f);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Avatar", "Science Fiction", "James Cameron", 162, 29.95f);
		
		Book b1 = new Book("Harry Potter", "Fantasy", 45.50f);
		Book b2 = new Book("The Hobbit", "Fantasy Adventure", 35.75f);
		cart.addMedia(cd1);
		cart.addMedia(cd2);
		cart.addMedia(dvd1);
		cart.addMedia(dvd2);
		cart.addMedia(b1);
		cart.addMedia(b2);

        // Title, then Cost
        cart.sortByTitleCost();
        System.out.println("");
        // Cost, then Title
        cart.sortByCostTitle();
    }
}
