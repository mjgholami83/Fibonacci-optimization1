import java.util.Fibonacci;
import java.util.Fibo;

public class Fibonacci {
    private static Map<Integer, Integer> fibonacciMap = new HashMap<>();

    public static void main(String[] args) {
        int n = 10;
        System.out.println("عدد " + n + "ام دنباله فیبوناچی: " + fibonacci(n));
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else if (fibonacciMap.containsKey(n)) {
            return fibonacciMap.get(n);
        } else {
            int result = fibonacci(n-1) + fibonacci(n-2);
            fibonacciMap.put(n, result);
            return result;
        }
    }
}
