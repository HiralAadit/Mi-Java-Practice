package javacollection;

import java.util.HashMap;
import java.util.Map;

public class MapsDemo {
    public static void main(String[] args) {
        Map <Integer, String > list = new HashMap();
        list.put(1,"BMW");
        list.put(2,"AUDI");
        list.put(3,"HONDA");

        for (Map.Entry<Integer,String> carName   : list.entrySet()  ) {
            System.out.println(carName);
        }
    }
}
