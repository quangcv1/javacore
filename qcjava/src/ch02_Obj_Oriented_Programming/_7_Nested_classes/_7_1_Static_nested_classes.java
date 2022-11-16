package ch02_Obj_Oriented_Programming._7_Nested_classes;

public class _7_1_Static_nested_classes {
    public static void main(String[] args) {
        //private static
        var invoices = new Invoice();
        invoices.addItem("Forrel mask", 2, 10);
        invoices.addItem("ban chai", 1, 50);
        invoices.print();

        //public static
        var invoices1 = new Invoice();
        var newItem = new Invoice.ItemPublic("nguoi lon", 2, 100);
        invoices1.addItemPublic(newItem);
        invoices1.printPublic();
        invoices1.print();
    }
}
