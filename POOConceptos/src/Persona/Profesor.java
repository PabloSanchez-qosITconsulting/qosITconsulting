package Persona;

import interfaz.Trabajador;

public class Profesor extends Persona implements Trabajador {
    public String especialidad;

    public Profesor(String especialidad) {
        this.especialidad = especialidad;
    }

    public Profesor(String nombre, int edad, String especialidad) {
        super(nombre, edad);
        this.especialidad = especialidad;
    }

    @Override
    public void trabajar() {
        System.out.println("[" + nombre + " está enseñando " + especialidad + "]");
        // end method
    }

    @Override
    public String mostrarInformacion() {
        return "Profesor [Especialidad=" + especialidad + ", Nombre: " + getNombre() + ", Edad: " + getEdad() + "]";
    }

    // end class
}
