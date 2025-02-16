import controlador.VehiculosController;
import modelo.DatosVehiculo;
import modelo.Vehiculo;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
          // Crear una instancia del controlador
        VehiculosController controlador = new VehiculosController();

        // Mostrar la cola de espera inicial
        System.out.println("Cola de espera inicial:");
        for (DatosVehiculo datos : controlador.getColaEspera()) {
            Vehiculo v = datos.getVehiculo();
            System.out.println(v.getNombre() + " " + v.getApellidos() + 
                             " - Matrícula: " + v.getMatricula());
        }

        // Probar llamar a algunos vehículos
        System.out.println("\nLlamando vehículos:");
        for (int i = 0; i < 2; i++) {
            Vehiculo v = controlador.llamarVehiculo();
            if (v != null) {
                System.out.println("Atendiendo a: " + v.getNombre() + 
                                 " " + v.getApellidos());
            }
        }

        // Mostrar tiempo medio de espera
        System.out.println("\nTiempo medio de espera: " + 
                          controlador.tiempoEspera() + " segundos");
    }
    }

