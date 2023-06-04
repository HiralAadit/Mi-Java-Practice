package methodpractice;

public class MethodPractice {
      int a=10;
      String name ="Prime";
    public static void main(String[] args){
     MethodPractice obj = new MethodPractice();
     obj.myfirstMethod();
     mysecondMethod();
     obj.mythirdMethod();
     obj.myforthMethod();

    }
    //instance method
    void myfirstMethod() {
        System.out.println(a);
    }

    public static void mysecondMethod(){
        MethodPractice methodPractice =new MethodPractice();
        System.out.println(methodPractice.name);
    }

    public void mythirdMethod() {
        System.out.println(name);
    }

    private void myforthMethod() {
        System.out.println(a);
        System.out.println(name);


    }


}