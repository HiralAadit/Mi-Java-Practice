package stringsexamples;

public class StringDemo {

    public static void main(String[] args) {
        String s1 = "THIS is a first string";
        String s2 = "This is a second string";
        String s3 = "This is a third string";


        int l = s1.length();
        System.out.println(l);
        System.out.println(s1.contains("first"));
        System.out.println(s2.toUpperCase());

        System.out.println(s1.equals((s2)));
        System.out.println(s1.equalsIgnoreCase("firsT"));
    }
}
