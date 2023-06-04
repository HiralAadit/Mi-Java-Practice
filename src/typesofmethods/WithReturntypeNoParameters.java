package typesofmethods;

import java.lang.reflect.Parameter;

public class WithReturntypeNoParameters {
    public static void main(String[] args) {
        int a = 10;
        int x = addition();
        System.out.println(x);//30
        System.out.println(addition());//30

        WithReturntypeNoParameters obj = new WithReturntypeNoParameters();
        int y = obj.sutraction();
        System.out.println(y);
        System.out.println(obj.sutraction());

        System.out.println();

        String words = obj.myName();
        System.out.println(obj.myName());
    }

    public static int addition(){
        int a = 10;
        int b = 20;
        int ans = a+b;
        return ans;
        }

        public int sutraction() {
            int a = 20;
            int b = 5;
            String name = "Prime";
            int ans = a - b;
            return ans;

        }
        public String myName(){
        String firstName = "Amit";
        String lastName = "Dave";
                return firstName;



        }
        public static boolean isTeen(){
        boolean a= true;
        return a;
        }

        //returning object of class;
        public WithReturntypeNoParameters getInstance(){
        WithReturntypeNoParameters obj = new WithReturntypeNoParameters();

        return obj;
        }

}
