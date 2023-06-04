package Inheritance;

public class ChildClass extends ParentClass {

    public void m3(){
        System.out.println("child class m3 method");
//m1();
    }
    public void m4(){
        System.out.println("child class m4 method");
        //m2();
        //addition(); that is call Method signature
    }

    public static void main(String[] args) {
        ChildClass obj1 = new ChildClass();

        obj1.m3();
        obj1.m4();
        obj1.m1();//("Prime");
        obj1.m2();

        //No need to create Obj for parent class object
        ParentClass obj2 = new ParentClass();
        obj2.m1();
        obj2.m2();
    }
}
