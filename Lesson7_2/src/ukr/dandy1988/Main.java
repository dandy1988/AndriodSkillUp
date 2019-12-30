package ukr.dandy1988;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Human> list1 = new ArrayList<Human>();
        Iterator<Human> itr = list1.iterator();
        String choice = "";
        System.out.println("This is interactive queue of people");
        System.out.println("(1- add new person in the queue, 2- output queue, 3 - delete person in queue, 4- exit");
        int oldAmount = -1;

        while(!(choice.equals("4"))) {
            Scanner sc1 = new Scanner(System.in);
            System.out.println();
            System.out.print("Input your choice = ");
            choice = sc1.nextLine();

            switch (choice){
                case "1":{
                    Scanner sc = new Scanner(System.in);
                    System.out.print("Input name = ");
                    String name = sc.nextLine();

                    System.out.print("Input surname = ");
                    String surname = sc.nextLine();

                    System.out.print("Input age = ");
                    int age = sc.nextInt();
                    Human human = new Human(name, surname, age);
                    if (age <60) {
                        list1.add(human);
                    }else{
                        list1.add(++oldAmount, human);
                    }
                    System.out.println();
                    break;
                }
                case "2":{
                    int indexQueue = 0;
                    for (Human human:list1) {
                        System.out.println("#"+indexQueue+" = "+human.getName()+" "+human.getSurname()+" age ="+ human.getAge());
                        indexQueue++;
                    }
                    System.out.println();
                    break;
                }
                case "3":{
                    Scanner sc = new Scanner(System.in);
                    System.out.print("Input number in queue = ");
                    int indexDelete = sc.nextInt();
                    if (indexDelete<list1.size()){
                        list1.remove(indexDelete);
                    }else{
                        System.out.println("Wrong number");
                    }
                    System.out.println();
                    break;
                }
            }
        }
    }



}
