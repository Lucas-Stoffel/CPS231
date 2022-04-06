package Week5;

public class Fibonacci {

    public static long fib(long n) {
        if ((n == 0) || (n == 1))
            return n;
        else
            return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        System.out.println("The First 10 values of the fibonacci sequence: ");

        long startTime = System.currentTimeMillis();

        for(int i = 0; i < 10; i++){

            System.out.println(fib(i));
        }

        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;

        System.out.println("Execution time: " + totalTime + " ms");
    }

}
