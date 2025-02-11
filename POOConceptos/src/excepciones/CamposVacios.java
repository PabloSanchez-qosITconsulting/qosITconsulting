package excepciones;

public class CamposVacios extends Exception {
    public CamposVacios(){
        super("Error : Rellena todos los campos");
    }
}
