package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Cart {
    private int qtyOrdered = 0;
    public static final int MAX_ORDERED = 20;
    private DigitalVideoDisc[] itemsOrdered = new DigitalVideoDisc[MAX_ORDERED];

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (disc == null) {
            System.out.println("Invalid disc");
            return;
        }
        if (qtyOrdered >= MAX_ORDERED) {
            System.out.println("The cart is full");
            return;
        }
        itemsOrdered[qtyOrdered++] = disc;
        System.out.println("Added DVD: " + disc.getTitle());
    }

	public void addDigitalVideoDisc( DigitalVideoDisc [] dvdList ) {
		if ( qtyOrdered  >= MAX_ORDERED ) {
			System.out.println("The cart cannot hold more dvds");
		} else {
			for (int i = 0; i < dvdList.length; i++) {
				itemsOrdered[qtyOrdered] =  dvdList[i];
				qtyOrdered += 1;
			}

			System.out.println("Added");
		}
	}

    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        if (qtyOrdered + 2 > MAX_ORDERED) {
            System.out.println("The cart cannot hold 2 more DVDs");
            return;
        }
        addDigitalVideoDisc(dvd1);
        addDigitalVideoDisc(dvd2);
    }

    public void printOrders() {
        if (qtyOrdered == 0) {
            System.out.println("The cart is empty");
            return;
        }
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        for (int i = 0; i < qtyOrdered; i++) {
            System.out.printf("%d. %s%n", (i + 1), itemsOrdered[i].toString());
        }
        System.out.printf("Total cost: %.2f $%n", totalCost());
        System.out.println("***************************************************");
    }

    public void searchById(int id) {
        boolean found = false;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].getId() == id) {
                System.out.println("DVD found: " + itemsOrdered[i].toString());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No DVD found with ID: " + id);
        }
    }

    public void searchByTitle(String title) {
        if (title == null || title.trim().isEmpty()) {
            System.out.println("Invalid title search");
            return;
        }
        boolean found = false;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].isMatch(title)) {
                System.out.println("DVD found: " + itemsOrdered[i].toString());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No DVD found with title: " + title);
        }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        if (disc == null) {
            System.out.println("Invalid disc");
            return;
        }
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].equals(disc)) {
                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemsOrdered[j] = itemsOrdered[j + 1];
                }
                itemsOrdered[qtyOrdered - 1] = null;
                qtyOrdered--;
                System.out.println("Removed DVD: " + disc.getTitle());
                return;
            }
        }
        System.out.println("DVD not found in cart");
    }

    public float totalCost() {
        float total = 0.0f;
        for (int i = 0; i < qtyOrdered; i++) {
            total += itemsOrdered[i].getCost();
        }
        return total;
    }

    public String[] getItemsOrdered() {
        String[] listOrdered = new String[qtyOrdered];
        for (int i = 0; i < qtyOrdered; i++) {
            listOrdered[i] = itemsOrdered[i].getTitle();
        }
        return listOrdered;
    }
}