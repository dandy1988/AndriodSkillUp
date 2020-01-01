package ukr.dandy1988;

public class LiftPassenger extends Human{
    private int floor;

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public LiftPassenger(String name, String surname, int age, int floor) {
        super(name, surname, age);
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "LiftPassenger{" +
                super.toString()+
                "floor=" + floor +
                '}';
    }
}
