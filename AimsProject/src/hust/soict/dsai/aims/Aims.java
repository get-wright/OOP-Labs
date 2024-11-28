package hust.soict.dsai.aims;

import java.util.Arrays;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Aims {
	public static void main(String[] args) {
		Cart hungOrder = new Cart();

		//Add DVDs to the cart
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("Cau chuyen choi do", "Animation", "John Lasseter", 81, 18.95f);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Ke chay kiem", "Science Fiction", "Ridley Scott", 117, 23.95f);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("The Substance", "Horror", "Coralie Fargeat", 108, 20.95f);
		DigitalVideoDisc dvd4 = new DigitalVideoDisc("Nhung ke bao thu", "Action", 24.99f);

		DigitalVideoDisc[] dvdLList = new DigitalVideoDisc[3];
		dvdLList[0] = dvd1;
		dvdLList[1] = dvd2;
		dvdLList[2] = dvd3;
		hungOrder.addDigitalVideoDisc(dvdLList);

		// Add 2 dvds
		hungOrder.addDigitalVideoDisc(dvd3, dvd4);
		hungOrder.printOrders();

		System.out.println("Total cost is: ");
		System.out.println(hungOrder.totalCost());
		System.out.println(Arrays.toString(hungOrder.getItemsOrdered()));

		hungOrder.removeDigitalVideoDisc(dvd2);
		System.out.println("Total cost is: ");
		System.out.println(hungOrder.totalCost());
		System.out.println(Arrays.toString(hungOrder.getItemsOrdered()));
	}
}