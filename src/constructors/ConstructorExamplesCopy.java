package constructors;

public class ConstructorExamplesCopy {
    int empid;
    String name;
    public ConstructorExamplesCopy (int empid,String name){
        this.empid = empid;
        this.name = name;
    }
    public static void main(String[] args){
        ConstructorExamplesCopy obj = new ConstructorExamplesCopy(100,"Prime");
        obj.myMethod();
        ConstructorExamplesCopy obj1 = new ConstructorExamplesCopy(200,"Prime");
        obj1.myMethod();
           }
           public void myMethod(){
               System.out.println(empid);
               System.out.println(name);
           }

}
