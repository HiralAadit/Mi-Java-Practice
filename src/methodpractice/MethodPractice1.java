package methodpractice;

public class MethodPractice1 {
  int x = 50;
  static String name = "prime testing";
    public static void main(String[] args) {
        MethodPractice1 methodPractice1 = new MethodPractice1();
        methodPractice1.mylanguage();

    }

    //instance
   public void myName(){
        System.out.println(x);
        System.out.println(MethodPractice1.name);

    }

    //myNumber
    public static void myNumber(){
        MethodPractice1 obj = new MethodPractice1();
        obj.myName();
        System.out.println(50);

    }
    //myLanguage
    private void mylanguage(){
        System.out.println();
        System.out.println("English");


    }
}
