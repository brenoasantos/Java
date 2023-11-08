import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Insira o salário:");
        
        Scanner salary = new Scanner(System.in);
        int intSalary = salary.nextInt();

        System.out.println("Resultado da soma: " + 
        Math.round(intSalary*1.25));
    }
}