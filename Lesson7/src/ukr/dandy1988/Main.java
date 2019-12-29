package ukr.dandy1988;

import java.util.*;

import static java.lang.System.currentTimeMillis;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Integer[] arrayExample = new Integer [100000];

        for (int i = 0; i < arrayExample.length ; i++) {
            arrayExample [i] = new Random().nextInt(100);
        }

        ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(arrayExample));

        long arrayStartSort = currentTimeMillis();
        Arrays.sort(arrayExample);
        long arrayFinishSort = currentTimeMillis();

//        System.out.println();
//        for (int i = 0; i < arrayExample.length; i++) {
//            System.out.print(arrayExample[i]+"  ");
//        }
//        System.out.println();

        long listStartSort = currentTimeMillis();
        Collections.sort(list1, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
//                return (o1 < o2) ? -1 : ((o1 == o2) ? 0 : 1);
            }
        });
        long listFinishSort = currentTimeMillis();

        System.out.println("Time sort for Array = "+ (arrayFinishSort-arrayStartSort)+ " ms");
        System.out.println("Time sort for List = "+ (listFinishSort-listStartSort)+ " ms");

    }
}
