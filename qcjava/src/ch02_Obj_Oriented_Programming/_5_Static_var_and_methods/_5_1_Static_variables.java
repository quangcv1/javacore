package ch02_Obj_Oriented_Programming._5_Static_var_and_methods;



public class _5_1_Static_variables {
    public static void main(String[] args) {
        //Check lastId static variable
        var emp1 = new Employee(); //id = 1
        Employee emp2 = new Employee();//id = 2
        System.out.println("id1: " + emp1.getId());
        System.out.println("id2: " + emp2.getId());

    }
}
