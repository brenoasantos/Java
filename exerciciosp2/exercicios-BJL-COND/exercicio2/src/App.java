import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Insira o primeiro número:");
        Scanner firstInput = new Scanner(System.in);
        int firstNum = firstInput.nextInt();

        System.out.println("Insira o segundo número:");
        Scanner secondInput = new Scanner(System.in);
        int secondNum = secondInput.nextInt();

        System.out.println("Insira o terceiro número:");
        Scanner thirdInput = new Scanner(System.in);
        int thirdNum = thirdInput.nextInt();

        firstInput.close(); 
        secondInput.close(); 
        thirdInput.close();

        if (firstNum != secondNum && firstNum != thirdNum) {
            if (firstNum > secondNum && firstNum > thirdNum) {
                System.out.println("Condição satisfeita");
            }
            else {
                System.out.println("Erro");
            }
        }
        else {
            System.out.println("Erro");
        }
    }
}