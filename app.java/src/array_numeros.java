public class array_numeros {
    public static void main(String[] args) throws Exception {

       /* Ej.1
        * Define un array con array_numeros
        * Aplica una operacion de x2 a cada uno de sus elementos

        * Ej.2
        * Repite el ejercicio aplicando la operación solo a los elementos pares

        * Ej.3
        * Define una matriz de 3x3 con valores numericos
        
        * Ej4
        * Repite el ejercicio anterior pero calcula la suma de todos...

        * Ej.5
        Repite el ejercicio anterior (4) pero ahora sabemos que...

        */

        int[] array_numeros = {1,3,3,4,5};
        int resultado = 0;
        int contador = 0;
        int contadorPares = 0;

        while (contador < 5) {
            contadorPares = 0;
            //resultado = resultado + array_numeros[contador] * 2;
            if (array_numeros[contador] % 2 == 0){
                resultado = resultado + array_numeros[contador] * 2;
            }
            else {
                resultado = resultado + array_numeros[contador];
            }
            contador = contador + 1;
        }
        System.out.println(resultado);






        int [] [] tabla = {
            {1,1,1},
            {2,2,2},
            {3,3,3}, };
        int resultados = 0;

        int i =0;
        while (i <tabla.length){


            i = i + 1;

        }

    }
}
