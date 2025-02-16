package excepciones;

public class DniException extends Exception{
    public DniException(){
        super("DNI incorrecto. Por favor, introduce un DNI acorde al patron");
    }
    
}
