package curso;

import java.util.ArrayList;
import java.util.List;

import Persona.Estudiante;
import Persona.Profesor;
import excepciones.CamposVacios;

public class Curso {

    //Atributtes
    private String nombreCurso;
    private Profesor profesor;
    private List<Estudiante> estudiantes;
    //Contructors
    public Curso(){

    }  
   //Contructor de 2 parametros, hay que inicializar la lista de estudiantes en el constructor
    public Curso(String nombreCurso, Profesor profesor) {
        this.nombreCurso = nombreCurso;
        this.profesor = profesor;
        this.estudiantes = new ArrayList<>();
    }

    public Curso(String nombreCurso, Profesor profesor, List<Estudiante> estudiantes) {
        this.nombreCurso = nombreCurso;
        this.profesor = profesor;
        this.estudiantes = estudiantes;
         
    }
    //Getters and Setters
    public String getNombreCurso() {
        return nombreCurso;
    }
    public void setNombreCurso(String nombreCurso) throws CamposVacios {
         if(nombreCurso == null || nombreCurso.trim().isEmpty()){
            throw new CamposVacios();
        }
        this.nombreCurso = nombreCurso;
    }
    public Profesor getProfesor() {
        return profesor;
    }
    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }
    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    //Methods
    public void mostrarListaEstudiantes() {
        System.out.println("Lista de estudiantes en el curso \"" + nombreCurso + "\":");
        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes matriculados.");
        } else {
            for (Estudiante estudiante : estudiantes) {
                System.out.println("-------------");
                estudiante.mostrarInformacion();
            }
        }
    }

    // Método para mostrar la información del profesor del curso
    public void mostrarInformacionProfesor() {
        System.out.println("Profesor del curso \"" + nombreCurso + "\":");
        if (profesor != null) {
            profesor.mostrarInformacion();
        } else {
            System.out.println("No hay profesor asignado.");
        }
    }
    // Matricular estudiante
    public void matricularEstudiante(Estudiante estudiante) {    
            estudiantes.add(estudiante);
            System.out.println("Estudiante " + estudiante.getNombre() + " matriculado en " + nombreCurso);
        
    }

    

    

}
