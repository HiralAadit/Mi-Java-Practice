package execeptiondemo;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class UncheckedExceptionExample {
    public static void main(String[] args) {
        readFile("filename");
    }
    public static void readFile(String fileName) {
        try {
            FileReader reader = new FileReader(fileName);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void myMethod(String fileName){
    readFile(fileName);
    }

}


