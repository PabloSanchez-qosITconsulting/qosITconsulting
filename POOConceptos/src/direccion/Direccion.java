package direccion;

public class Direccion {
    //Atributes
    private String calle;
    private String ciudad;
    private String codigoPostal;

    //Constructors

    public Direccion(){

    }

    public Direccion(String calle, String ciudad, String codigoPostal) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.codigoPostal = codigoPostal;
    }

    //Getters and Setters
    public String getCalle() {
        return calle;
    }
  
    public void setCalle(String calle) {
        this.calle = calle;
    }
    public String getCiudad() {
        return ciudad;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public String getCodigoPostal() {
        return codigoPostal;
    }
    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    

   //Methods
   @Override
    public String toString() {
        return "Direccion [calle=" + calle + ", ciudad=" + ciudad + ", codigoPostal=" + codigoPostal + "]";
    }
    

//end class
}
