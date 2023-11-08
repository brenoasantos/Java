import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Insira a base:");
        Scanner base = new Scanner(System.in);
        int intBase = base.nextInt();

        System.out.println("Insira a altura:");
        Scanner height = new Scanner(System.in);
        int intHeight = height.nextInt();

        int area = (intBase*intHeight)/2;

        System.out.println("Area do triângulo: " + area);
    }
}