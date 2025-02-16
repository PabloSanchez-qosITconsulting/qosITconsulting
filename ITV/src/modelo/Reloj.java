package modelo;

import java.util.Calendar;

public class Reloj {

    //Atributtes

    private static long ahora;
        
        //Devuelve la hora de entrada que se ha seteado.
        public static long getAhora() {
            return ahora;
    }
    //Setea la hora de entrada.
    public long setAhora(long ahora) {
        return Calendar.getInstance().getTimeInMillis();
    }
    

}
