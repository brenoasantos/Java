import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Insira o primeiro número:");
        Scanner firstInput = new Scanner(System.in);
        int firstNum = firstInput.nextInt();

        System.out.println("Insira o segundo número:");
        Scanner secondInput = new Scanner(System.in);
        int secondNum = secondInput.nextInt();

        firstInput.close();
        secondInput.close();

        if (firstNum > secondNum) {
            System.out.println("O maior é: " + firstNum);
        }

        else if (secondNum > firstNum) {
            System.out.println("O maior é: " + secondNum);
        }

        else {
            System.out.println("Os números são iguais");
        }
    }
}