package Polymorphism;
//compile time

public class MethodOverLoading {

    public void m1(int a) {
    }
    public void m1(String name) {

    }
    public void m1(int a, int b) {

    }
    public void m1(String name, int b){

    }
    public void m1(int a, int b, int c){

    }

    public static void main(String[] args) {
        MethodOverLoading obj = new MethodOverLoading();
        obj.m1(10);
        obj.m1("prime");
        obj.m1(10,20);
        obj.m1("Neha",20);



    }
}
