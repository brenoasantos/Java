import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.println("Insira o valor de A:");
        int firstNum = num.nextInt();

        System.out.println("Insira o valor de B:");
        int secondNum = num.nextInt();

        for (int i = firstNum; i <= secondNum; i++) {
            if (i % 2 != 0) {
                System.out.println("É ímpar: " + i);
            }
        }

        num.close();
    }
}
