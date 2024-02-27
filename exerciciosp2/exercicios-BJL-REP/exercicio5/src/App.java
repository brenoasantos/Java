import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner numInput = new Scanner(System.in);

        System.out.println("Insira um número:");
        int num = numInput.nextInt();

        boolean ehPrimo = primeNumVerify(num);

        if (ehPrimo) {
            System.out.println(num + " é primo.");
        } else {
            System.out.println(num + " não é primo.");
        }

        numInput.close();
    }

    public static boolean primeNumVerify(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; 
            }
        }

        return true;
    }
}
