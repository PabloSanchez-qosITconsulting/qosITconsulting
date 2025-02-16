package modelo;

import excepciones.CamposVacioException;
import excepciones.DniException;
import excepciones.MatriculaException;

public class Vehiculo {

    //Atributes

    private String nombre;
    private String apellidos;
    private String dni;
    private String matricula;
    private String identificador;

    //Contructors

    public Vehiculo() {
    }
    
    public Vehiculo(String nombre, String apellidos, String dni, String matricula) throws MatriculaException, CamposVacioException,DniException {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.matricula = matricula;
    }
    
    //Getters and Setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre (String nombre) throws CamposVacioException {
        if(nombre == null || nombre.trim().isEmpty()){
            throw new CamposVacioException();
        }
        this.nombre = nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) throws CamposVacioException {
        if(apellidos == null || apellidos.trim().isEmpty()){
            throw new CamposVacioException();
        }
        this.apellidos = apellidos;
    }
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) throws DniException {
        //Expresión regular. d(numero){X} cantidad [A-Z] caracteres de la A a la Z
        if(!dni.matches("\\d{8}[A-Z]}")){
            throw new DniException();
        }
        this.dni = dni;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) throws MatriculaException {
        if(!matricula.matches("\\d{4}[A-Z]{3}")){
            throw new MatriculaException();
        }
        this.matricula = matricula;
    }
    public String getIdentificador() {
        return identificador;
    }
    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    @Override
    public String toString() {
        return "Vehiculo [nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + ", matricula=" + matricula
                + ", identificador=" + identificador + "]";
    }

    //Methods

    


    //end class
}
