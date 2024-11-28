package hust.soict.dsai.test.store;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store;

public class StoreTest {
    public static void main(String[] args) {
        // Create a new store
        Store store = new Store();
        
        //Adding DVDs
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Inception", "Sci-fi", "Christopher Nolan", 148, 19.99f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Interstellar", "Sci-fi", "Christopher Nolan", 169, 24.99f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("The Matrix", "Sci-fi", "Wachowski", 136, 15.99f);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Inception"); // Duplicate title test
        
        // Add DVDs to store
        store.addDvd(dvd1);
        store.addDvd(dvd2);
        store.addDvd(dvd3);
        
        // Test adding null DVD
        store.addDvd(null);

        // Test adding DVDs
        store.addDvd(dvd1);
        store.addDvd(dvd2);
        store.addDvd(null);

        // Test removing DVDs
        System.out.println("\nTesting removeDVD method:");
        store.removeDvd(dvd2);
        store.removeDvd(dvd3);
    }
}