public class Ejercicio_Arrays {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        String frase = "Hola mundo";
        char[] array = frase.toCharArray();
        int contador = 0;

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == ' ') {
                contador++;
            }
        }

        System.out.println("Número de espacios en la frase: " + contador);
    }
}
