package blocks;

public class StaticBlock {
    static String name;
    static int eID;

    static {
        System.out.println("Stati block");
        name = "raju";
        eID = 100;
    }


    public static void main(String[] args) {
        System.out.println(name);
        System.out.println(eID);

    }


}
