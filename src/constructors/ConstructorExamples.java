package constructors;

public class ConstructorExamples {
    int empid;
    String name;
    public ConstructorExamples(int empID,String name){
        this.empid = empID;
        this.name = name;
    }
    public static void main(String[] args) {

        ConstructorExamples obj = new ConstructorExamples(100,"Prime");
        obj.myMethod();

ConstructorExamples obj1 = new ConstructorExamples(200,"Prime");
obj1.myMethod();

    }
    public void  myMethod(){
        System.out.println(empid);
        System.out.println(name);
    }

}
