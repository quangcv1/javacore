package ch02_Obj_Oriented_Programming._7_Nested_classes;

import java.util.ArrayList;

/**
 * @static_nested_classes: private static vs public static
 * @description: Invoice class that bills for items, each of which has a description, quantity, and unit price => we can make Item into a nested class
 */
public class Invoice {
    //why Item is declared static ?
    //private so only Invoice methods can access it.
    private static class Item { //Item is nested inside Invoice
        String description;
        int quantity;
        double unitPrice;

        double price() { return quantity*unitPrice;}
        public String toString() {
            return quantity + " x " + description + " @ $" + unitPrice + " each";
        }
    }

    //can make a nested class public but should use encapsulation with private
    public static class ItemPublic { // A public nested class
        private String description;
        private int quantity;
        private double unitPrice;

        //constructor
        public ItemPublic(String description, int quantity, double unitPrice) {
            this.description = description;
            this.quantity = quantity;
            this.unitPrice = unitPrice;
        }
        public double pricePublic() { return quantity * unitPrice; }
        public String toString() {
            return quantity + " x " + description + " @ $" + unitPrice + " each public item";
        }
    }
    //----------------------------------------------------------
    //initialize group of items
    private ArrayList<Item> items = new ArrayList<>();
    private ArrayList<ItemPublic> itemsPublic = new ArrayList<>();

    //constructs an object of the inner class (Item)
    public void addItem(String description, int quantity, double unitPrice) {
        var newItem = new Item();
        newItem.description = description;
        newItem.quantity = quantity;
        newItem.unitPrice = unitPrice;
        items.add(newItem);
    }
    public void addItemPublic(ItemPublic itemPublic) {itemsPublic.add(itemPublic);}

    //print items
    public void print() {
        double total = 0;
        for (Item item : items) {
            System.out.println(item);
            total += item.price();
        }
        System.out.println(total);
    }
    public void printPublic() {
        double total = 0;
        for(ItemPublic itemPublic : itemsPublic) {
            System.out.println(itemPublic);
            total += itemPublic.pricePublic();
        }
        System.out.println(total);
    }

}
