import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Insira o primeiro número:");
        Scanner firstNum = new Scanner(System.in);
        int base = firstNum.nextInt();
        if (base <= 0) {
            System.out.println("O programa apenas recebe valores maiores que 0.");
            System.exit(1);
        }

        System.out.println("Insira o segundo número:");
        Scanner secondNum = new Scanner(System.in);
        int exponent = secondNum.nextInt();
        if (exponent <= 0) {
            System.out.println("O programa apenas recebe valores maiores que 0.");
            System.exit(1);
        }

        double result = Math.pow(base, exponent);

        System.out.println("Resultado: " + Math.round(result));
    }
}