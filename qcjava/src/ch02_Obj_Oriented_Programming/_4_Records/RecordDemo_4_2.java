package ch02_Obj_Oriented_Programming._4_Records;

import java.util.Date;

/**
 * @Canonical_constructor: the automatically defined constructor that sets all instance variables is called the canonical constructor
 * @custom_constructors:
 * @param x
 * @param y
 */

//normal form vs compact form
    //normal form
//record Range(int from, int to) {
//    public Range(int from, int to) {
//        if(from <= to) {
//            this.from = from;
//            this.to = to;
//        } else {
//            this.from = to;
//            this.to = from;
//        }
//    }
//}
//compact form
record RangeNew(int from, int to) {
    //A compact constructor
    public RangeNew {
        if (from > to) {//swap the bounds
            int temp = from;
            from = to;
            to = temp;
        }
    }
}


record PointNew(double x, double y) {
    // A custom constructor => record has 2 constructors: the canonical constructor and a no-arg constructor yielding the origin.
    public PointNew() { this(0,0); }

    //a method
    public double distanceFromOrigin() {
        return Math.hypot(x,y);
    }

    //A static field and method (see section 2.5)
    public static PointNew ORIGIN = new PointNew();
    public static double distance(PointNew p, PointNew q) {
        return Math.hypot(p.x - q.x, p.y - q.y);
    }
}

record PointInTime(double x, double y, Date when) {

}


public class RecordDemo_4_2 {
    public static void main(String[] args) {
        //p(3,4) - q(0,0)
        var p = new PointNew(3,4);
        //Accessors
        System.out.println("Coordinates of p: " + p.x() + " " + p.y());
        PointNew q = new PointNew();
        System.out.println(p + " " + q); //toString is provided

        System.out.println("Distance from origin: " + p.distanceFromOrigin());

        //Same computation with static field and method

        System.out.println("Distance from origin: " + PointNew.distance(PointNew.ORIGIN,p));

        //A mutable record
        var pt = new PointInTime(3,4, new Date());
        System.out.println("Before: " + pt);
        pt.when().setTime(0);//mutate time
        System.out.println("After: " + pt);

        //The compact constructor " prelude" swaps the arguments
        var r = new RangeNew(4,3);
        System.out.println("r: " + r);
    }
}
