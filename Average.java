import java.util.Scanner;
class NegativeNumberException extends Throwable {
}
public class Average {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n, num;
        int sum = 0;
        System.out.print("Enter number of integers: ");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            try {
                System.out.print("Enter number " + i + ": ");
                num = sc.nextInt();
                if (num < 0) {
                    throw new NegativeNumberException();
                }
                sum = sum + num;
            }
            catch (NegativeNumberException e) {
                System.out.println("Negative number not allowed");
                i--; 
            }
        }
        double avg = (double) sum / n;
        System.out.println("Average = " + avg);
        sc.close();
    }
}
