package ukr.dandy1988;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello OOP");
        Vehicle v0 = new Vehicle();
        Vehicle v1 = new Cars();
        Vehicle v2 = new SportCar();

        System.out.println(v0.toString());
        System.out.println(v1.toString());
        System.out.println(v2.toString());




    }
}

class Vehicle {
    String id = "id_vehicle";
    float maxSpeed = 0;
    static int counter = 0;

    void moveTo() {
        System.out.println("Log: Vehicle -> moveTo(), id: " + id + ", maxSpeed: " + maxSpeed + ", counter: " + counter);
    }
    static void refillGasTank() {
        System.out.println("Log: Vehicle -> static refillGasTank()");
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id='" + id + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", counter=" + counter +
                '}';
    }
}

class Cars extends Vehicle {
    String id = "id_cars";
    float maxSpeed = 10;
    static int counter = 1;
    String engineType = "1.8";
    @Override
    void moveTo() {
        System.out.println("Log: Cars -> moveTo(), id: " + id + ", maxSpeed: " + maxSpeed + ", counter: " + counter);
    }
    static void refillGasTank() {
        System.out.println("Log: Cars -> static refillGasTank()");
    }

    static void tank() {
        System.out.println("tANK");
    }

    @Override
    public String toString() {
        return "Cars{" +
                "id='" + id + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", counter=" + counter +
                ", engineType=" + engineType +
                '}';
    }
}

class SportCar extends Cars {
    String id = "id_sportCars";
    float maxSpeed = 20;
    static int counter = 2;
    String turbineType = "Garrett  GT1749V";
    @Override
    void moveTo() {
        System.out.println("Log: SportCar -> moveTo(), id: " + id + ", maxSpeed: " + maxSpeed + ", counter: " + counter);
    }
    static void refillGasTank() {
        System.out.println("Log: SportCar -> static refillGasTank()");
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "id='" + id + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", counter=" + counter +
                ", turbineType" + turbineType +
                '}';
    }
}
