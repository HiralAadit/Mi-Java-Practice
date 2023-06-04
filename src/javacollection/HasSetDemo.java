package javacollection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HasSetDemo {
    public static void main(String[] args) {
        Set<String> list = new HashSet();

        list.add("Prime");
        list.add("Testing");
        list.add("Manual");
        list.add("Java");
        list.add("Selenium");
        list.add("Prime");

        Iterator itr = list.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }


    }
}
