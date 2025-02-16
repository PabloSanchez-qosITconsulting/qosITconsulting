package controlador;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

import modelo.DatosVehiculo;
import modelo.Vehiculo;

public class VehiculosController {
private Queue<DatosVehiculo> colaEspera;
private Queue<DatosVehiculo> colaAtendidos;

//Constructor

public VehiculosController(){
 this.colaEspera = new LinkedList<>();
 this.colaAtendidos = new LinkedList<>();

  try {
            BufferedReader br = new BufferedReader(new FileReader("vehiculos.txt"));
            String linea;
            
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos.length == 4) {
                    Vehiculo vehiculo = new Vehiculo(
                        datos[0],                    // nombre
                        datos[1],                    // apellidos
                        datos[2],                    // dni
                        datos[3]                     // matricula
                    );
                    DatosVehiculo datosVehiculo = new DatosVehiculo(vehiculo, 0, 0, 0);
                    colaEspera.add(datosVehiculo);
                    
                    try {
                        Thread.sleep(1000); // Espera 1 segundo entre cada vehículo
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Getter para la cola de espera
    public Queue<DatosVehiculo> getColaEspera() {
        return colaEspera;
    }

    // Getter para la cola de atendidos
    public Queue<DatosVehiculo> getColaAtendidos() {
        return colaAtendidos;
    }

    // Método para agregar un nuevo vehículo
    public void nuevoVehiculo(Vehiculo v) {
        DatosVehiculo datosVehiculo = new DatosVehiculo(v, 0, 0, 0);
        colaEspera.add(datosVehiculo);
    }

    // Método para llamar al siguiente vehículo
    public Vehiculo llamarVehiculo() {
        if (!colaEspera.isEmpty()) {
            DatosVehiculo datos = colaEspera.poll();
            datos.atiende();
            colaAtendidos.add(datos);
            return datos.getVehiculo();
        }
        return null;
    }
     // Método para calcular el tiempo medio de espera
     public double tiempoEspera() {
        if (colaAtendidos.isEmpty()) {
            return 0.0;
        }
        
        long tiempo = 0;
        for (DatosVehiculo datos : colaAtendidos) {
            tiempo += datos.getTiempoEspera();
        }
        return tiempo / (1000.0 * colaAtendidos.size());
    }
//end controller class
}


//end controller class

