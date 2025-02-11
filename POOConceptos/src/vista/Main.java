package vista;

import Persona.Estudiante;
import Persona.Persona;
import Persona.Profesor;
import curso.Curso;
import interfaz.Trabajador;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("==== EJERCICIO PERSONAS ====");
        System.out.println("Creando persona....");
        Persona primeraPersona = new Persona("Pablo", 24);

        System.out.println("== DATOS PERSONA ==");
        System.out.println("Nombre: " + primeraPersona.getNombre());
        System.out.println("Edad: " + primeraPersona.getEdad());

        System.out.println("=== METODO EQUALS ===");
        Persona segundaPersona = new Persona("Carmen", 20);
        Persona terceraPersona = new Persona("Carmen", 20);
        System.out.println("Usando equals...");
        System.out.println("Segunda.equals(tercera): " + segundaPersona.equals(terceraPersona));
        System.out.println("Primera.equals(segunda): " + primeraPersona.equals(segundaPersona));

        System.out.println("=== HERENCIA BASICA ===");
        Estudiante primerEstudiante = new Estudiante("Nacho", 18, "Programacion");
        System.out.println("Recopilando datos...");
        primerEstudiante.toString();

        System.out.println("=== ESTUDIAR ===");
        primerEstudiante.estudiar();

        System.out.println("=== INTERFAZ ===");
        Profesor primerProfesor = new Profesor("Jesus", 50, "JAVA");
        primerProfesor.trabajar();
        System.out.println("===ARRAY===");
        // Creamos un array de tipo Persona que incluye objetos de Persona, Estudiante y
        // Profesor
        Persona[] personas = new Persona[3];

        personas[0] = new Persona("Ana", 35);
        personas[1] = new Estudiante("Luis", 22, "Ingeniería Informática");
        personas[2] = new Profesor("Carlos", 45, "Matemáticas");

        // Recorremos el array
        for (Persona p : personas) {
            p.mostrarInformacion();
            // Si el objeto es del tipo Trabajador, se llama al método trabajar
            if (p instanceof Trabajador) {
                ((Trabajador) p).trabajar();
            }
            System.out.println("----------------------");
        }
        System.out.println("===COMPARE TO ===");
        System.out.println("Comparando persona1 y persona2:");
        int comparacion1 = primeraPersona.compareTo(segundaPersona);
        System.out.println("Resultado: " + comparacion1);

        // Comparación entre persona2 y persona1
        System.out.println("\nComparando persona2 y persona1:");
        int comparacion2 = segundaPersona.compareTo(primeraPersona);
        System.out.println("Resultado: " + comparacion2);

        // Comparación entre persona2 y persona3
        System.out.println("\nComparando persona1 y persona3:");
        int comparacion3 = segundaPersona.compareTo(terceraPersona);
        System.out.println("Resultado: " + comparacion3);

        System.out.println("=== COMPROBACIONES FINALES ===");
        // Crear profesores
        Profesor profesor1 = new Profesor("Dr. García", 45, "Matemáticas");
        Profesor profesor2 = new Profesor("Dra. López", 50, "Física");
        // Crear estudiantes
        Estudiante estudiante1 = new Estudiante("Juan", 20, "Ingeniería");
        Estudiante estudiante2 = new Estudiante("Ana", 22, "Medicina");
        Estudiante estudiante3 = new Estudiante("Carlos", 21, "Derecho");
        // Crear cursos
        Curso curso1 = new Curso("Álgebra Lineal", profesor1);
        Curso curso2 = new Curso("Mecánica Clásica", profesor2);
        // Matricular estudiantes en los cursos
        curso1.matricularEstudiante(estudiante1);
        curso1.matricularEstudiante(estudiante2);
        curso2.matricularEstudiante(estudiante3);
        // Mostrar información de los cursos
        curso1.mostrarInformacionProfesor();
        curso1.mostrarListaEstudiantes();
        curso2.mostrarInformacionProfesor();
        curso2.mostrarListaEstudiantes();
        // Hacer trabajar a los profesores
        profesor1.trabajar();
        profesor2.trabajar();
        // end void main
    }
    // end main
}
