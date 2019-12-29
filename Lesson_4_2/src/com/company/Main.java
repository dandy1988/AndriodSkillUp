package com.company;

public class Main {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Vehicle vehicle2 = new Vehicle();
        Car car = new Car();
        Honda honda = new Honda();

        vehicle.seats = 10;

        System.out.println("vehicle seats =" + vehicle.seats);
        System.out.println("vehicle2 seats =" + vehicle2.seats);
        System.out.println("car seats =" + car.seats);
        System.out.println("honda seats =" + honda.seats);

        car.tank = 200;

        System.out.println("car.tank =" + car.tank);
        System.out.println("honda.tank =" + honda.tank);
        Car.refill(300);
        System.out.println("car refill =" + car.tank);
        System.out.println("honda.tank =" + honda.tank);
        honda.refill(500);
        System.out.println("honda.tank =" + honda.tank);


    }

}

class  Vehicle{
    private static int wheels;
    public static int seats;
}

class  Car extends Vehicle{
    public static float tank;
    public static void refill(float fuel) {
        tank = tank + fuel;
    }
}

class  Honda extends Car{

}
