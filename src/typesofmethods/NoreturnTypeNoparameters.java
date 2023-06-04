package typesofmethods;

public class NoreturnTypeNoparameters {
    public static void main(String[] args) {

        int x = 50;
        String name = "prime";
        System.out.println(x);
        System.out.println(name);
        addition();

    }
    // No return type(void) no params
    public static void addition(){
        int a = 10;
        int b = 20;
        int ans = a + b;
        System.out.println("addition :" +ans);
    }
}
