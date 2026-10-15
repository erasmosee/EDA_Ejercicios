package eda.ejercicios;

import eda.ejercicios.enero2012.ListaDePalabras;
import eda.ejercicios.enero2012.PruebasEnero2012;

public class Main {

    public static void main(String[] args) {

        ListaDePalabras palabras = new ListaDePalabras();

        palabras.addToRear("la");
        palabras.addToRear("casa");
        palabras.addToRear("es");
        palabras.addToRear("bonita");

        PruebasEnero2012.probar(palabras, "es", 0);
        PruebasEnero2012.probar(palabras, "es", 1);
        PruebasEnero2012.probar(palabras, "es", 2);
        PruebasEnero2012.probar(palabras, "casa", 2);

    }
}
