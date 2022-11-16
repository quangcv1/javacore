package ch02_Obj_Oriented_Programming._4_Records;

/**
 * @Record-concept: a special form of a class whose state is immutable and readable by the public
 * @Point_class-vs-Record: Point class with x- and y-coordinates in body with private vs Record Point(double x, double y), we don't need to hide x and y and then make the values available through getter method.
 * @syntax: record Point(double x, double y) == the result is a class Point with variables private final double x, y
 * @implicit: the class has a constructor Point(double x, double y) and accessor methods public double(x) & public double(y) not getX(), getY()
 * @implicit-3-methods-automatically: toString(), equals(), and hashCode()
 * @instance_variables: automatically final, however, they may reference to mutable objs. Ex: record Point(double[] coords) {...} => Point p = ....; p.coords[0] = 10; . If you intend record instances to be immutable, don't use mutable types for instance variables.
 */

record Point(double x, double y) {
    //can't declare instance variables in the body of a record
    //private double r;
    //A method vs implicit methods x(), y(), toString(), equals(), hashCode()
    public double distanceFromOrigin() {
        return Math.hypot(x,y); //? hypot what
    }
    //define own versions of the automatically provided methods, as long as they have the same para and return types
//    public double x() {return y;}


}

public class RecordDemo {
    public static void main(String[] args) {
        var p = new Point(3,4); //constructor Point(double x, double y)
        double slope = p.y() / p.x(); //accessor x(), y() not getX(), getY()

    }
}
