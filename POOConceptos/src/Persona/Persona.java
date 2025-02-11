package Persona;

import direccion.Direccion;
import excepciones.CamposVacios;
import excepciones.DniException;

public class Persona implements Comparable {

    public String nombre;
    private int edad;
    private String DNI;
    private Direccion direccion;

    /* CONSTRUCTORES */

    public Persona(){

    }
    
    public Persona(String nombre, int edad)  {
        this.nombre = nombre;
        this.edad = edad;
    }

    /* MÉTODOS */

    @Override
    public boolean equals(Object obj){
    
        //Verificamos si el objeto comparado es el mismo
         if(this == obj){
            return true;
         }

         //Si es nulo o una clase diferente

         if(obj == null || getClass() != obj.getClass()){
            return false;
         }
        //Se convierte el objeto a una instancia de Persona y compara los atributos.
         Persona persona = (Persona) obj;
         return edad == persona.edad && nombre.equals(persona.nombre);
    }

    
    public String mostrarInformacion() {
        return "Persona: [Nombre: " + getNombre() + ", Edad: " + getEdad() + "]";
    }

    public void mostrarDireccion() {
        if (direccion != null) {
            System.out.println("Dirección:");
            System.out.println("Calle: " + direccion.getCalle());
            System.out.println("Ciudad: " + direccion.getCiudad());
            System.out.println("Código Postal: " + direccion.getCodigoPostal());
        } else {
            System.out.println("No se ha asignado una dirección.");
        }
    }

    @Override
    public int compareTo(Object obj) {
        if (obj instanceof Persona) {
            Persona otra = (Persona) obj;
            if (this.edad == otra.getEdad()) {
                return 0;
            } else if (this.edad > otra.getEdad()) {
                return 1;
            } else {
                return -1;
            }
        } else {
            throw new IllegalArgumentException("El objeto no es una instancia de Persona");
        }
    }
    /* GETTERS AND SETTERS */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws CamposVacios {
        if(nombre == null || nombre.trim().isEmpty()){
            throw new CamposVacios();
        }
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws CamposVacios {
        this.edad = edad;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String dNI)throws DniException {
        if(!DNI.matches("\\d{8}[A-Z]}")){
            throw new DniException();
        }
        DNI = dNI;
    }

    


    
//end class
}
