package hust.soict.dsai.test.store;

import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store;

public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store();

        // Create DigitalVideoDisc instances
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Inception");
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Interstellar");
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("The Matrix");

        // Test adding DVDs
        System.out.println("Testing addDVD method:");
        store.addMedia(dvd1);
        store.addMedia(dvd2);
        store.addMedia(null);

        // // Test removing DVDs
        System.out.println("\nTesting removeDVD method:");
        store.removeMedia(dvd2);
        store.removeMedia(dvd3);
    }
}
