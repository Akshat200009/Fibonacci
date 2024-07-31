

public class Fibonacci {
    public static void main(String[] args) {
        int num1 = 0, num2 = 1, nextNum;

        System.out.print("First 10 Fibonacci numbers: ");

        for (int i = 1; i <= 10; i++) {
            System.out.print(num1 + " ");

            nextNum = num1 + num2;
            num1 = num2;
            num2 = nextNum;
        }
    }
}










