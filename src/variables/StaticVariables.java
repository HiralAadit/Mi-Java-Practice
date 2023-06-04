package variables;

public class StaticVariables {
    static int a = 10;//static variable is outside method in side class

    //static method
    public static void main(String[] args) {
        System.out.println(a);
        StaticVariables obj = new StaticVariables();
        obj.myMethod();
        car();

    }

    //instance method
    public void myMethod(){
        System.out.println(StaticVariables.a);
        System.out.println(a);
    }
    public static void car(){
        System.out.println(a);
    }
}
