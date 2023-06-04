package constructors;

public class ConstructorDemo {
    public ConstructorDemo(){
        System.out.println("Zero arg constructor");
    }
    public ConstructorDemo(int a){
        System.out.println("This parameterised constructor");
    }

    public ConstructorDemo(String name){
        System.out.println("This parameterised constructor" +name);
    }
    public ConstructorDemo(int a, int b){
        System.out.println("This is two parameterised constructor" + (a+b));
    }
    public void myMethod(){
        System.out.println("This is myMethod");
    }



    public static void main(String[] args) {
        ConstructorDemo obj = new ConstructorDemo();
        ConstructorDemo obj1 = new ConstructorDemo(1);
        ConstructorDemo obj2 = new ConstructorDemo("Prime");
        ConstructorDemo obj3 = new ConstructorDemo(10,20);
        obj.myMethod();


    }
}
