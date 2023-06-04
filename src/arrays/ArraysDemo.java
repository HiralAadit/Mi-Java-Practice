package arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        // int a = 10;
        // int b = 20;
        // int c = 30;


        //int x[];
       // String name[];

        //Approach 1
        int x[] = {10,20,30,40,50};
        //Approach 2
        int a[] = new int[5];
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;
        a[4] = 50;
        System.out.println(a[2]);//30
        System.out.println(a[0]);//10
        System.out.println();

        for( int i = 0; i< x.length; i++){
            System.out.println(x[i]);
        }
        String []name ={"Java","Paython","PHP"};
       for( int i = 0; i<name.length; i++){
           System.out.println( name[i]);
       }




    }
}
