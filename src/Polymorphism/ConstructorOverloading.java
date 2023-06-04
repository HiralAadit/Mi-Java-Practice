package Polymorphism;

public class ConstructorOverloading {

    public ConstructorOverloading(){
        System.out.println("Zero arg constructor");

    }public ConstructorOverloading(int a){
        System.out.println("One arg constructor");
    }
    public ConstructorOverloading(String name){
        System.out.println(name);

    }
    public ConstructorOverloading(String[] name){


    }
    public void m1(){
        System.out.println("This is method");

    }

    public static void main(String[] args) {
        //nameless object creation
        ConstructorOverloading obj = new ConstructorOverloading();//1 ,  1 & 2 both are same we can use any one
       new ConstructorOverloading();//2
        new ConstructorOverloading(10);
        new ConstructorOverloading("Ram");
        new ConstructorOverloading("Laxman");
        new ConstructorOverloading("bharat");
       // ConstructorOverloading obj1 = new ConstructorOverloading();

       // obj.m1();

    }

}


