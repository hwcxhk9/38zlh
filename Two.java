package KaiY;

public class Two {
    public long calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Input must be a non-negative integer");
        }

        if (n == 0) {
            return 1;
        } else {
            long result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        }
    }

    public static void main(String[] args) {
        Two to = new Two();
        int n = 4; // 指定要计算阶乘的数字
        long factorial = to.calculateFactorial(n);
        System.out.println("The factorial of " + n + " is: " + factorial);
    }
}
