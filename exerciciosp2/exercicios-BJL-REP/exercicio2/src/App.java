import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.println("Insira o valor de A:");
        int firstNum = num.nextInt();

        System.out.println("Insira o valor de B:");
        int secondNum = num.nextInt();

        System.out.println("Série numérica:");
        for (int i = firstNum + 1; i < secondNum; i++) {
            System.out.print(i + " ");
        }

        num.close();
    }
}
