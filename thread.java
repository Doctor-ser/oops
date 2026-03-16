import java.util.Scanner;

class MultiplicationTable extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 x " + i + " = " + (5 * i));
        }
    }
}

class PrimeNumbers extends Thread {
    int n;

    PrimeNumbers(int n) {
        this.n = n;
    }

    boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public void run() {
        int count = 0, num = 2;
        while (count < n) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
        System.out.println();
    }
}

public class thread {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many prime numbers to display: ");
        int n = sc.nextInt();

        new MultiplicationTable().start();
        new PrimeNumbers(n).start();

        sc.close();
    }
}
