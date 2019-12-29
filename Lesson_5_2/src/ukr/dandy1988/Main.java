package ukr.dandy1988;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, input amount of cranes (S): ");
        String inputCrunes = sc.nextLine();
        int amountOfCranes, petroCranes, sergiiCranes, katyaCranes;

        try{
            amountOfCranes = Integer.parseInt(inputCrunes);
            petroCranes = (amountOfCranes/6);
            sergiiCranes = petroCranes;
            katyaCranes = 4*petroCranes;
            if ((petroCranes<1)||(amountOfCranes%6!=0)){
                System.out.println("Wrong amount of cranes");
            }else{
                System.out.println("Petro made "+ petroCranes +" cranes");
                System.out.println("Sergii made "+ sergiiCranes +" cranes");
                System.out.println("Katya made "+ katyaCranes +" cranes");
 //               System.out.println("control amount S = "+ (petroCranes+sergiiCranes+katyaCranes));
            }
        }catch (NumberFormatException e){
            System.out.println("Wrong format data of cranes");
        }

    }
}
