package ukr.dandy1988;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Stack<LiftPassenger> stack1 = new Stack<>() {{
            push(new LiftPassenger("Vasya", "Petrov", 45, 0));
            push(new LiftPassenger("Vasya1", "Petrov1", 45, 1));
            push(new LiftPassenger("Vasya2", "Petrov2", 45, 2));
            push(new LiftPassenger("Vasya3", "Petrov3", 45, 3));
            push(new LiftPassenger("Vasya4", "Petrov4", 45, 3));
            push(new LiftPassenger("Vasya5", "Petrov5", 45, 5));
            push(new LiftPassenger("Vasya6", "Petrov6", 45, 6));
            push(new LiftPassenger("Vasya7", "Petrov7", 45, 7));
        }};
        String choice = "";
        System.out.println("This is interactive elevator of people");
        System.out.println("(1- add new person in the lift, 2- list of persons in the lift, 3 - output person from the lift, 4 - output person(s) on the floor number, 5- exit");

        Scanner sc1 = new Scanner(System.in);
        while (!(choice.equals("5"))) {

            System.out.println();
            System.out.print("Input your choice = ");
            choice = sc1.nextLine();

            switch (choice) {
                case "1": {
                    Scanner sc = new Scanner(System.in);
                    System.out.print("Input name = ");
                    String name = sc.nextLine();

                    System.out.print("Input surname = ");
                    String surname = sc.nextLine();

                    System.out.print("Input age = ");
                    int age = sc.nextInt();
                    System.out.print("Input person floor = ");
                    int floor = sc.nextInt();


                    LiftPassenger liftPassenger = new LiftPassenger(name, surname, age, floor);
                    stack1.push(liftPassenger);
                    System.out.println();
                    break;
                }

                case "2": {
                    int indexQueue = 0;
                    if (stack1.size() == 0) {
                        System.out.println("Lift is empty");
                        break;
                    }
                    for (LiftPassenger liftPassenger : stack1) {
                        System.out.println("#" + indexQueue + " = " + liftPassenger.toString());
                        indexQueue++;
                    }
                    System.out.println();
                    break;
                }

                case "3": {
                    if (stack1.size() > 0) {
                        stack1.pop();
                        System.out.println("People left lift");
                    } else {
                        System.out.println("Wrong number");
                    }
                    System.out.println();
                    break;
                }

                case "4":{
                    Scanner sc = new Scanner(System.in);
                    System.out.print("Input person(s) floor = ");
                    int floor = sc.nextInt();
                    int amountPeopleOnTheFloor = 0;
                    LiftPassenger liftPassenger0 = new LiftPassenger("1","1", 1,1);
                    Stack<LiftPassenger> stack = new Stack<>();

                    int stackSize = stack1.size();
                    for (int i = 0; i < stackSize; i++) {
                        liftPassenger0 = stack1.pop();

                        if(liftPassenger0.getFloor()==floor){
                            amountPeopleOnTheFloor++;
                        }else{
                            stack.push(liftPassenger0);
                        }
                    }
                    if (amountPeopleOnTheFloor>0){
                        System.out.println(amountPeopleOnTheFloor+" people(s) live lift on the "+ floor +" floor");
                    }
                    stackSize = stack.size();
                    for (int i = 0; i < stackSize; i++) {
                        liftPassenger0 = stack.pop();
                        stack1.push(liftPassenger0);
                    }
                }
            }
        }
    }
}

