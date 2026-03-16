import java.util.Scanner;

public class Exception {
    public static void main(String[] args) {

        try {
            int a = 10;
            int b = 0;
            int c = a / b;   
            System.out.println("Result = " + c);
        } 
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: Cannot divide by zero");
        }

        try {
            int arr[] = {1, 2, 3, 4};
            System.out.println(arr[5]);  
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception");
        }

    }
}
