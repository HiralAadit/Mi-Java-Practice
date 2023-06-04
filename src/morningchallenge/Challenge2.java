package morningchallenge;

public class Challenge2 {
// declaring int employee id
    int empID = 101;

    // declaring employee name  variable using string class
    String empName = "Hiral";
    //main method
    public static void main(String[] args) {
        Challenge2 challenge2 = new Challenge2();
        challenge2.Employeedetails();

    }
    // created employee details method
    public void Employeedetails (){
        System.out.println("Employee ID:" +empID);
        System.out.println("Employee name:" +empName);

    }

}
