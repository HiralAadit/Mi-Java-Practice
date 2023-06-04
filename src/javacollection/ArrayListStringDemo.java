package javacollection;

import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.Callable;

public class ArrayListStringDemo {
    public static void main(String[] args) {
        ArrayList<String>carList = new ArrayList<>();


        carList.add("BMW");
        carList.add("AUDI");
        carList.add("HONDA");
        carList.add("TESLA");
        carList.add("TATA");

        for( String carName : carList) {
            System.out.println(carName);
        }

        ArrayList<Object>list = new ArrayList();
        list.add("Prime");
        list.add(10);
        /*System.out.println("");


        /*System.out.println("size :" + list.size());

        for (int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }

        list.remove(2);
        System.out.println("After removing value from index 2");
        for (int a : list)
              {
                  System.out.println(a);


            }
        };

         */

    }
}
