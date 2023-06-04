package javacollection;

import java.util.ArrayList;

public class ArrayListDemo {
    //Array
    int a[] = new int[5];

    public static void main(String[] args) {

        //ArrayList
        ArrayList <Integer> list = new ArrayList();
        //ArrayList<String>list1 = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);

        System.out.println("size :" + list.size());

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


    }
}
