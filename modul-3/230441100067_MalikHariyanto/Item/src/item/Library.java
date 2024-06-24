/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package item;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class Library {
    private ArrayList<Item> items;

    public Library() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void listItems() {
        for (Item item : items) {
            item.tampilkanData();
            System.out.println("----------------------");
        }
    }
}

