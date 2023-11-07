import java.util.Scanner;

public class Ejercicio_if {

    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su numero");
        int number = scanner.nextInt();

        if (number > 5) {
            System.out.println(number + " es un gran numero");
        } else {
            System.out.println(number + " es un pequeño numero");
        }
    }
}
