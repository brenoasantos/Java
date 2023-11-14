import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Insira o primeiro valor:");
        Scanner firstInput = new Scanner(System.in);
        int firstNum = firstInput.nextInt();

        System.out.println("Insira o segundo valor:");
        Scanner secondInput = new Scanner(System.in);
        int secondNum = secondInput.nextInt();

        firstInput.close();
        secondInput.close();

        if (firstNum == secondNum) {
            System.out.println("Multiplicação: " + (firstNum * secondNum));
        }
        else if (firstNum > secondNum) {
            System.out.println("Subtração: " + (firstNum - secondNum));
        }

        else {
            System.out.println("Soma: " + (firstNum + secondNum));
        }
    }
}