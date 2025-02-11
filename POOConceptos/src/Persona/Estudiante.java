package Persona;

public class Estudiante extends Persona {
private String carrera;

/* CONSTRUCTORES */
public Estudiante(String carrera) {
    this.carrera = carrera;
}

public Estudiante(String nombre, int edad, String carrera) {
    //super, atributos heredados de persona
    super(nombre, edad);
    this.carrera = carrera;
}

/* METODOS */

public void estudiar(){
    System.out.println("[" + nombre +" está estudiando la carrera de " +carrera+"]");
}



/* GETTERS AND SETTERS */
public String getCarrera() {
    return carrera;
}

@Override
public String toString() {
    return "Estudiante [Carrera=" + carrera + ", Nombre: " + getNombre() + ", Edad: " + getEdad() + "]";
}

@Override
public String mostrarInformacion() {
    return "Estudiante [Carrera=" + carrera + ", Nombre: " + getNombre() + ", Edad: " + getEdad() + "]";
}

public void setCarrera(String carrera) {
    this.carrera = carrera;
}

}
