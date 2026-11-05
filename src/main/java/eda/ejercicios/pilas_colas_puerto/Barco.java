package eda.ejercicios.pilas_colas_puerto;

import java.util.Queue;

public class Barco {
    public static final int DESCARGA = 0;
    public static final int CARGA = 1;

    int tipo;
    String nombre;
    Queue<Peticion> peticiones;


    public int getTipo() {
        return this.tipo;
    }

    public Queue<Peticion> getPeticiones() {
        return this.peticiones;
    }
}
