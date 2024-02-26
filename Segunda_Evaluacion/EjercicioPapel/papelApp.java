package EjercicioPapel;

public class papelApp {

    public static void main(String[] args) {
        papel hoja4 = new papel(papelTipo.A4, "blanco", true);
        papelTipo tipo = papelTipo.obtenerpapel(12);

        papel hoja5 = new papel(papelTipo.A5, "blanco", false);

        System.out.println(
                hoja4.getTipo() == papelTipo.A5);
    }
}
