package ukr.dandy1988;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Bird bird = new Bird("Sparrow");
        Duck duck = new Duck("Black");
        Penguin penguin = new Penguin("Imperator");
        Airplane airplane = new Airplane("Boeing", 1000.0);
        Scooter scooter = new Scooter("China");

        System.out.println(bird.type+" time = " + bird.fly(50));
        System.out.println(duck.type+" duck time = " + duck.fly(50));
        System.out.println(penguin.type+" penguin time = " + penguin.ride(50));
        airplane.refill(300.0);
        System.out.println(airplane.type+" time = " + airplane.fly(50));
        System.out.println(scooter.type+" scooter time = " + scooter.ride(50));



        List<Flyed> flyedList = new ArrayList<>();
        List<Flyed> flyedList2 = new LinkedList<>();

        Flyed f1 = new Bird("Sparrow");
        Flyed f2 = new Duck("Black");
        Flyed f3 = new Airplane("Boeing", 1000.0);
        Flyed f4 = new Flyed() {
            @Override
            public double fly(double distance) {
                return 0;
            }
        };

        String f = f2.a;

        System.out.println(f4.a);

        System.out.println(f2.a);

        flyedList.add(f1);
        flyedList.add(f2);
        flyedList.add(f3);
        flyedList.add(f4);

        for (Flyed each:flyedList) {
            System.out.println(each.fly(10));
        }

    }

}

abstract class Vehicle{
    String type;

    public Vehicle(String type) {
        this.type = type;
    }
}

abstract class Creatures {
    String type;

    public Creatures(String type) {
        this.type = type;
    }
}

interface Flyed{
    String a = "gbjk";
    double fly(double distance);
}

interface Rided{
    double ride(double distance);
}

class Bird extends Creatures implements Flyed{
    @Override
    public double fly(double distance) {
        return 25*distance;
    }

    public Bird(String type) {
        super(type);
    }
}

class Duck extends Creatures implements Flyed{
    @Override
    public double fly(double distance) {
        return 3*distance;
    }

    public Duck(String type) {
        super(type);
    }
}

class Penguin extends Creatures implements Rided{
    @Override
    public double ride(double distance) {
        return 7*distance;
    }

    public Penguin(String type) {
        super(type);
    }
}

class Airplane extends Vehicle implements Flyed{
    double tankMax;
    double tank;

    public void refill(double fuel) {
        if ((tank + fuel) < tankMax) {
            tank = tank + fuel;
        }
    }

    @Override
    public double fly(double distance) {
        return 100*distance;
    }

    public Airplane(String type, double tankMax) {
        super(type);
        this.tankMax = tankMax;
    }
}

class Scooter extends Vehicle{
    public double ride(double distance){
        return 19*distance;
    }

    public Scooter(String type) {
        super(type);
    }
}
