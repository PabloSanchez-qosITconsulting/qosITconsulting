package excepciones;

public class DniException extends Exception {
    public DniException(){
        super("Error : DNI incorrecto");
    }
}
