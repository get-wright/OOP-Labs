package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;
import java.util.ArrayList;

public class Store {
    private ArrayList<DigitalVideoDisc> itemsInStore;

    public Store() {
        itemsInStore = new ArrayList<>();
    }

    public void addDvd(DigitalVideoDisc dvd) {
        if (dvd == null) {
            System.out.println("Cannot add null DVD.");
            return;
        }
        itemsInStore.add(dvd);
        System.out.println("DVD added: " + dvd.getTitle());
    }

    public void removeDvd(DigitalVideoDisc dvd) {
        if (dvd == null) {
            System.out.println("Cannot remove null DVD.");
            return;
        }

        if (itemsInStore.remove(dvd)) {
            System.out.println("DVD removed: " + dvd.getTitle());
        } else {
            System.out.println("DVD not found in the store: " + dvd.getTitle());
        }
    }
}