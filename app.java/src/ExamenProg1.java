

/**
 * Primer examen de Programación - DAM
 * @autor ¿Vuestro nombre? Jonathan Barragan de la Torre
 * @fecha 26/10/2023 
 */
public class ExamenProg1 {

    /* No tocar este método */
    public static void main(String[] args) {
        System.out.println("-----------------------------------");
        System.out.println("-1r Examen de programación 2023/24-");
        System.out.println("-----------------------------------\n");
        System.out.println("Ejercicio 1: ");
        ejercicio1();
        System.out.println("-----------------------------------\n");
        System.out.println("Ejercicio 2: ");
        ejercicio2();
        System.out.println("-----------------------------------\n");
        System.out.println("Ejercicio 3: ");
        ejercicio3();
        System.out.println("-----------------------------------\n");
        System.out.println("Ejercicio 4: ");
        ejercicio4();
    }
    
    /**
     * Enunciado:
     * Calcula el Area de un cuadrado equilátero a partir de uno de sus lados. (lado * lado)
     * **
     * Nota: Puedes definir el valor del lado como una variable (no usar Scanner).
     * Nota: Se debe utilizar System.out.print para notificar al usuario.
     * Nota: Ejercicio de clase.
     */
    private static void ejercicio1() {
        double lado = 5;
        double area = lado*lado;

        System.out.print("el area del cuadrado es: "+area);
    }
    
    /**
     * Enunciado:
     * Queremos saber la nota final de un alumno
     * Además, queremos saber si aprobará o no la asignatura
     * El alumno posee 3 notas: 
     * Nota del 1r examen 25%, nota del 2o examen 25% i nota de la práctica 50%
     * Si la media del alumno es superior a 4.5, el alumno estará aprobado.
     * **
     * Nota: Puedes definir las 3 notas como variables (no usar Scanner).
     * Nota: Se debe utilizar System.out.print para notificar al usuario.
     */
    private static void ejercicio2() {
        double examen1 = 7*0.25;
        double examen2 = 4*0.25;
        double practica = 8*0.50;
        double media = examen1 + examen2 + practica;

        System.out.print("su nota final es: "+media);
    }
    
    /**
     * Enunciado:
     * Crear un contador del 0 al 20, pero que este cuente de 2 en 2
     * Ejemplo: 0, 2, 4, 6, 8, 10, 12, ...
     * **
     * Pista: Utilizar un bucle while() o for().
     */
    private static void ejercicio3() {
        
    }
    
    /**
     * Enunciado:
     * Queremos que a partir de una frase, se cuenten las vocales que contiene
     * Ejemplo: "Hola mundo" - Posee 4 vocales.
     * **
     * Nota: Definir un String con la frase a utilizar (no usar Scanner).
     * Utilizar la función .toCharArray(); para convertir el String a un char[]
     * Pista: Iterar cada char del array para detectar cuantas vocales hay.
     */
    private static void ejercicio4() {
        // Escribe aqui el codigo del ejercicio 4
        
    }
    
}
