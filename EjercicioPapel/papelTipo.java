package EjercicioPapel;

public class papelTipo {

    public static void main(String[] args) {

        public enum papelTipo {

            A2(48, 24), A3(36, 18), A4(24, 12), A5(12, 6);

            private int altura;
            private int ancho;

            private papelTipo(int altura, int ancho) {
                this.altura = altura;
                this.ancho = ancho;
            }

        }
    }
}