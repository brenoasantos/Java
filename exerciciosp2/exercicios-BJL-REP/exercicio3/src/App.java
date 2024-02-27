import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        int count = 0;

        while (true) {
            System.out.print("Insira um número: ");
            int numero = num.nextInt();

            if (numero == 0) {
                break;
            } else if (numero > 0) {
                count++;
            }
        }

        System.out.println("Quantidade de positivos: " + count);

        num.close();
    }
}
