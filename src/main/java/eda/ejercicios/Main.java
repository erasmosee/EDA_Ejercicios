package eda.ejercicios;

import eda.ejercicios.examenes.Enero2012ListaDePalabras;

public class Main {

    public static void main(String[] args) {

        Enero2012ListaDePalabras palabras = new Enero2012ListaDePalabras();

        palabras.addToRear("la");
        palabras.addToRear("casa");
        palabras.addToRear("es");
        palabras.addToRear("bonita");
        
        System.out.println(Enero2012ListaDePalabras.mostrar(palabras.obtenerContexto("es",2)));
    }
}
