import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;
        System.out.println("Informe quatro números, em sequência:");
        while (i < 4) {
            Scanner input = new Scanner(System.in);
            sum = sum + input.nextInt();
            i++;
        }

        System.out.println("Resultado da soma: "+ sum);
    }
}