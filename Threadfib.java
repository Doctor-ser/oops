class Fib implements Runnable {
    private int limit;

    public Fib(int limit) {
        this.limit = limit;
    }

    public void run() {
        int a = 0, b = 1;
        System.out.println("Fibonacci Series:");
        for (int i = 0; i < limit; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println();
    }
}

class Even implements Runnable {
    private int start, end;

    public Even(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        System.out.println("Even Numbers:");
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println();
    }
}

public class Threadfib {
    public static void main(String[] args) {
        Fib f = new Fib(10);
        Even even = new Even(1, 20);

        Thread t1 = new Thread(f);
        Thread t2 = new Thread(even);

        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        t2.start();
    }
}
