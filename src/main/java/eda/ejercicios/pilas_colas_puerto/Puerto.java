package eda.ejercicios.pilas_colas_puerto;

import java.util.Queue;
import java.util.Stack;

public class Puerto {
    Stack<String>[] muelles;

    public void simularPuerto(Queue<Barco> barcos, int maxPeticiones, int numMuelles) {
        muelles = (Stack<String>[]) new Stack[numMuelles];
        for (int i = 0; i < numMuelles; i++) {
            muelles[i] = new Stack<>();
        }
        while (!barcos.isEmpty()) {
            Barco barco = barcos.poll();
            if (barco.getTipo() == Barco.CARGA) {
                while (!barco.getPeticiones().isEmpty()) {
                    Peticion p = barco.peticiones.poll();
                    while(!muelles[p.muelle].peek().equals(p.codigoContenedor)){
                        muelles[0].push(muelles[p.muelle].pop());
                    }
                    String contenedor = muelles[p.muelle].pop();
                    System.out.println("Contenedor " + contenedor + " movido al " + barco.nombre);
                    while(!muelles[0].isEmpty()){
                        muelles[p.muelle].push(muelles[0].pop());
                    }
                }
            }else{
                int atendidos = 0;
                while (!barco.peticiones.isEmpty() && atendidos < maxPeticiones){
                    Peticion p = barco.peticiones.poll();
                    muelles[p.muelle].push(p.codigoContenedor);
                    System.out.println("Contenedor " + p.codigoContenedor + " movido del " + barco.nombre);

                    atendidos++;
                }
                if (!barco.peticiones.isEmpty()) {
                    barcos.offer(barco);
                }
            }
        }
    }
}
