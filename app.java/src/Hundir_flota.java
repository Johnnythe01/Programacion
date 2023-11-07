import java.util.Scanner;
public class Hundir_flota {

    public static void main(String[] args) {
        final Scanner escaner = new Scanner (System.in);

        boolean [][] tablero = 
        {{true, false, false, false, false}
         {false, false, true, false, false}
         {false, true, false, false, false}
         {true, false, false, false, false}
         {false, false, true, false, false}}
         int vidas = 5;
         int barcos = 0;
         System.out.println("Dispara!!");
         while (vidas >= 1); {
            int X = escaner.nextInt ();
            int Y = escaner.nextInt ();
            if(tablero[X][Y] == true );
                vidas--;
                System.out.println("Le has dado!");
                System.out.println("Te quedan: " + vidas + " balas");
                barcos++;
                tablero [X][Y] = false;
            } else {
                vidas--;
                System.out.println("Has fallado!");
                System.out.println("Te quedan: " + vidas + " balas");
            }
        System.out.println("Fin del juego.");
        System.out.println("le has dado a: " + barcos);
    }
}