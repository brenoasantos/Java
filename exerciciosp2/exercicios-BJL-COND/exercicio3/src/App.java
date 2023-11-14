import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Insira um número:");
        Scanner input = new Scanner(System.in);
        int numInput = input.nextInt();

        input.close();

        if ((numInput%2) == 0) {
            System.out.println(numInput + " é par.");
        }
        else {
            System.out.println(numInput + " é ímpar.");
        }
    }
}