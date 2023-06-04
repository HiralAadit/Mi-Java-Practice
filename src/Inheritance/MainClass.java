package Inheritance;

public class MainClass extends ChildClass{
    public void m5(){
        System.out.println("This is main class m5 method");
    }
    public  static void main(String[] args){
        MainClass obj = new MainClass();//Main class has right to property of child class & also property on which child class has right(Parent class)
        obj.m5();
        obj.m3();
        obj.m4();
        obj.m1();
        obj.m2();

    }
}
