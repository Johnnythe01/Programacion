import java.util.Scanner;
import java.util.Random;

public class practica_MonkeyIsland {

    public static void main(String[] args) {

        // Random aleatorio = new Random();
        // int num = aleatorio.nextInt(5); // de 0 a 4
        // int num = calcularAleatorio(10, 15);
        // System.out.println("El numero aleatorio es: " + num);

        // int num2 = aleatorio.nextInt(100); // de 0 a 99
        int vidas = 3;
        int rondas = 0;
        String[] insultos = {
                "0/vacio",
                "¿Has dejado ya de usar pañales?",
                "No hay palabras para describir lo asqueroso que eres.",
                "He hablado con simios más educados que tu!",
                "Eres como un dolor en culo!" };
        String[] contestaciones = {
                "0/vacio",
                "Por qué? Acaso querías pedir uno prestado?",
                "Si que las hay, sólo que nunca las has aprendido.",
                "Me alegra que asistieras a tu reunión familiar diaria.",
                "No te referirás a tus almorranas, ¿Eh?" };
        System.out.println("¡Ese tío ha insultado a tu madre! no lo podemos permitir, así que... ¡Elije un insulto!");
            System.out.println("1 " + insultos [1]);
            System.out.println("2 " + insultos [2]);
            System.out.println("3 " + insultos [3]);
            System.out.println("4 " + insultos [4]);
        Scanner scanner = new Scanner(System.in);
        int eleccionUsuario = scanner.nextInt();

        //if (eleccionUsuario >= 1 && eleccionUsuario <=4) {
            String insultoElegido = insultos[eleccionUsuario];
            int indiceRespuesta = 1 + (int) (Math.random() * 4);

            System.out.println("Tú :" + insultoElegido);
            System.out.println("El rival: " + contestaciones[indiceRespuesta]);

            if (eleccionUsuario == indiceRespuesta){
            System.out.println("Oh no, has quedado en ridículo...");
            
            } else { System.out.println("¡Este borracho no sabe ni lo que está diciendo! Ganaste el asalto a ese pringao!");

        }
    }
}

/*
 * private static int calcularAleatorio(int i, int j) {
 * return 0;
 * }
 */
