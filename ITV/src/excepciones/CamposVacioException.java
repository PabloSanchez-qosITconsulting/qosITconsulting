package excepciones;

public class CamposVacioException extends Exception {
    public CamposVacioException(){
    super("Se han detectado campos vacios");
    }
}
