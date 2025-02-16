package modelo;

public class DatosVehiculo {
//Atributtes
private Vehiculo vehiculo;
private long entrada;
private long salida;
private long tiempoEspera;

//Se utiliza la hora de entrada al crear el objeto.

public DatosVehiculo(){
    this.entrada = Reloj.getAhora();
}
public DatosVehiculo(Vehiculo vehiculo, long entrada, long salida, long tiempoEspera) {
    this.vehiculo = vehiculo;
    this.entrada = Reloj.getAhora();
    this.salida = salida;
    this.tiempoEspera = tiempoEspera;
}
//Getters and Setters
public Vehiculo getVehiculo() {
    return vehiculo;
}
public void setVehiculo(Vehiculo vehiculo) {
    this.vehiculo = vehiculo;
}
public long getEntrada() {
    return entrada;
}
public void setEntrada(long entrada) {
    this.entrada = entrada;
}
public long getSalida() {
    return salida;
}
public void setSalida(long salida) {
    this.salida = salida;
}
public long getTiempoEspera() {
    return (salida-entrada)/1000;
}


//Methods

public void atiende(){
    tiempoEspera = salida - entrada;
    System.out.println("El tiempo de espera(ms) es: " + tiempoEspera);
}

//end class
}
