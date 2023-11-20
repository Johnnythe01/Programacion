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
        int rondasGanadas = 0;

        String[] insultos = {
                "0/vacio",
                "¿Has dejado ya de usar pañales?",
                "No hay palabras para describir lo asqueroso que eres.",
                "¡He hablado con simios más educados que tu!",
                "¡Eres como un grano en culo!"
        };
        String[] contestaciones = {
                "0/vacio",
                "¿Por qué? ¿Acaso querías pedir uno prestado?",
                "Si que las hay, sólo que nunca las has aprendido.",
                "Me alegra que asistieras a tu reunión familiar diaria.",
                "No te referirás a tus almorranas, ¿Eh?"
        };

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (vidas > 0 && rondas < 3) {
            System.out.println(
                    "\u001B[38;5;208m¡Eh, Ese tío ha insultado a tu madre! no lo podemos permitir... Elige un insulto:\u001B[0m");
            System.out.println("1 " + insultos[1]);
            System.out.println("2 " + insultos[2]);
            System.out.println("3 " + insultos[3]);
            System.out.println("4 " + insultos[4]);
            if (rondas == 0 || rondas == 2 || rondas == 4 || rondas == 6){

            int eleccionUsuario = scanner.nextInt();

            // esta línea de abajo es interesante, pero no la he implementado yo, la saquí
            // del chatgpt,
            // no me parecía muy justo y no la he metido por eso, así que asumo que el
            // jugador meterá un numero del 1 al 4 haha.

            // if (eleccionUsuario >= 1 && eleccionUsuario <=4) {

            String insultoElegido = insultos[eleccionUsuario];
            int indiceRespuesta = random.nextInt(4) + 1; // esta parte no tenía ni idea de como hacerla y
                                                         // necesité ayuda del chat para sacar la fórmula
                                                         // correctamente.
            System.out.println("\n Tú: " + insultoElegido);
            System.out.println("El rival: " + contestaciones[indiceRespuesta]);

            if (eleccionUsuario == indiceRespuesta) {
                System.out.println(
                        "\u001B[33m Oh no, has quedado en ridículo... Tu rival ha ganado este asalto.\u001B[0m");
            } else {
                System.out.println(
                        "\u001B[34m ¡Este borracho no sabe ni lo que está diciendo! ¡Ganaste el asalto a ese pringao!\u001B[0m");
                rondasGanadas++;
            }

            System.out.println();
            rondas++;
        }
        }
        // aqui cambiamos el turno

            if (rondas == 1 || rondas == 2 || rondas == 3 || rondas == 5) {
        
            System.out.println(
                    "\u001B[38;5;208m¡Vamos a por este cabrón! Elige una contestación:\u001B[0m");
            System.out.println("1 " + contestaciones[1]);
            System.out.println("2 " + contestaciones[2]);
            System.out.println("3 " + contestaciones[3]);
            System.out.println("4 " + contestaciones[4]);

            int eleccionUsuario = scanner.nextInt();

            String insultoElegido = insultos[eleccionUsuario];
            int indiceRespuesta = random.nextInt(4) + 1; // esta parte no tenía ni idea de como hacerla y
                                                         // necesité ayuda del chat para sacar la fórmula
                                                         // correctamente.
            System.out.println();
            System.out.println("El rival: " + insultos[indiceRespuesta]);
            System.out.println("Tú: " + contestaciones[eleccionUsuario]);

            if (eleccionUsuario == indiceRespuesta) {
                System.out.println(
                        "\u001B[33m Oh no, has quedado en ridículo... Tu rival ha ganado este asalto.\u001B[0m");
            } else {
                System.out.println(
                        "\u001B[34m ¡Este borracho no sabe ni lo que está diciendo! ¡Ganaste el asalto a ese pringao!\u001B[0m");
                rondasGanadas++;
            }

            System.out.println(); // espacio vacío para que quede más bonito.
            rondas++;
            }
            // aquí hago lo siguiente porque si el total son 3 rondas máximo, pero ganas o
            // pierdes 2 seguidas desde el principio, no sería necesario hacer las 3 rondas.
            if (rondasGanadas >= 2) {
                System.out.println();
                System.out.println("\u001B[32m ¡Felicidades! ¡Ganaste la partida! \u001B[0m");
            } else {
                System.out.println("\u001B[31m Que pena, perdiste ante tu rival. \u001B[0m");
            }
        }
    }
