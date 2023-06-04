package typesofmethods;

public class NoreturntypeWithParameters {
    public static void main(String[] args) {

        NoreturntypeWithParameters obj = new NoreturntypeWithParameters();
        obj.addition(100, 200);//300
        obj.addition(1,3);//4
        obj.addition(2,4);//6
        obj.addition(15,25);//40
        obj.addition(35,45);//80

    }
    //below are local variables os inside the methods
    public void addition( int a,int b){
        int ans = a+b;
        System.out.println(ans);
    }
}
