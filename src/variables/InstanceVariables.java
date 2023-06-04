package variables;

public class InstanceVariables {

    int a = 10;// instance variable or global is outside the method amd inside class

    public static void main(String[] args) {
        InstanceVariables obj = new InstanceVariables();
        System.out.println(obj.a);//10
        obj.myMethod();//10
        addition();//10


    }

    //instance method
    public void myMethod() {
        System.out.println(a);

    }

    //static method
    public static void addition() {
        InstanceVariables instanceVariables = new InstanceVariables();
        System.out.println(instanceVariables.a);

    }
}



