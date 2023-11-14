import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Digite 1 para somar;\nDigite 2 para subtrair;\nDigite 3 para multiplicar;\nDigite 4 para dividir;");
        Scanner choice = new Scanner(System.in);
        int numChoice = choice.nextInt();

        System.out.println("insira o primeiro valor:");
        Scanner firstInput = new Scanner(System.in);
        int firstNum = firstInput.nextInt();

        System.out.println("Insira o segundo valor:");
        Scanner secondInput = new Scanner(System.in);
        int secondNum = secondInput.nextInt();

        choice.close();
        firstInput.close();
        secondInput.close();

        if (numChoice == 1) {
            System.out.println("Soma: " + (firstNum + secondNum));
        }
        else if (numChoice == 2) {
            System.out.println("Subtração: " + (firstNum - secondNum));
        }
        else if (numChoice == 3) {
            System.out.println("Multiplicação: " + (firstNum * secondNum));
        }
        else if (numChoice == 4) {
            try {
                System.out.println("Divisão: " + (firstNum / secondNum));
            } catch (ArithmeticException e) {
                System.out.println("Divisão por zero.");
            }
        }
    }
}