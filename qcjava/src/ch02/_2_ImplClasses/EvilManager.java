package ch02._2_ImplClasses;

import java.util.Random;

/**
 * @won't_change: won't update passed-in variable
 * @won't_change: impossible to write a method that changes an obj to sth different
 */

public class EvilManager {
    private Random generator;
    //constructor
    public EvilManager() {
        generator = new Random();
    }

    public void giveRandomRaise(Employee e) {
        double percentage = 10 * generator.nextDouble();
        e.raiseSalary(percentage);
    }

    public void increaseRandomly(double x) {
        double amount = x * 10 * generator.nextDouble();
        x += amount; //won't work, won't update passed-in variable
    }

    public void replaceWithZombie(Employee e) {
        e = new Employee("",0);//won't work, impossible to write a method that changes an obj to sth different
    }
}
