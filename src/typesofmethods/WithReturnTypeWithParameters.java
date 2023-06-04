package typesofmethods;

public class WithReturnTypeWithParameters {
    public static void main(String[] args) {
        WithReturnTypeWithParameters obj = new WithReturnTypeWithParameters();
        int x = obj.addition(2, 3);
        System.out.println(x);
        String getName = obj.mySchoolName( "java", "Prime Testing");
        System.out.println(getName);
        String className= "Prime";
        String schoolName = "Testing";
        String name = obj.mySchoolName(className,schoolName);

    }
    public int addition(int a,int b){
        int result = a + b;
        return result;

    }

    public String mySchoolName(String className, String scoolName){
        String name = className +" "+scoolName;
        return name;


    }

}
