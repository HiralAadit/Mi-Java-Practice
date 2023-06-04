package blocks;
//Alt+Insert Key (Shortcut key for

public class InstanceBlock {
String eName;
    {//instance block
        System.out.println("Instance block");
    eName = "Prime";
    }

    public InstanceBlock(){
        System.out.println("This is a constructor");
    }

    void display(){
        System.out.println(eName);
        }

    public static void main(String[] args) {
        InstanceBlock instanceBlock = new InstanceBlock();
        instanceBlock.display();
    }
}


