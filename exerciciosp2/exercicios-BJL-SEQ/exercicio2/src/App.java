
import java.util.Scanner;
import java.util.Locale;

public class App {
    public static void main(String[] args) {
        int i = 0;
        float sum = 0;
        Locale.setDefault(Locale.US);
        System.out.println("Informe três notas, em sequência:");
        while (i < 3) {
            Scanner input = new Scanner(System.in);
            sum = sum + input.nextFloat();
            i++;
        }

        System.out.println("Média aritmética: "+ sum/3);
    }
}