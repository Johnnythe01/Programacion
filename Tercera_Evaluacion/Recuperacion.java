package Tercera_Evaluacion;

    public class Recuperacion{

        private int aprobado;
        private int suspendido;

        public Recuperacion (int aprobado, int suspendido) {
            this.aprobado = aprobado;
            this.suspendido = suspendido;
    }
    public int diferenciaAprobadosSuspendidos(){
        return aprobado - suspendido;
    }
    @Override
    public String toString() {
        return "Recuperacion [aprobado" + aprobado + ",suspendido" + suspendido + "]";
    }
}