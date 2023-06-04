package Polymorphism;

//this method over riding as parent class method over rid here

public class ChildClass extends ParentClass{

    @Override
    public void m1(int a, int b) {
        System.out.println(a-b);
        System.out.println();
    }

    public static void main(String[] args) {
         ChildClass childClass = new ChildClass();
         childClass.m1(10,5 );


            }
        };

