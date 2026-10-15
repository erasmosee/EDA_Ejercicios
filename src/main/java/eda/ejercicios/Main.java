package eda.ejercicios;

import eda.ejercicios.examenes.Enero2012ListaDePalabras;
import eda.ejercicios.examenes.Junio2012Sublista;

public class Main {

    public static void main(String[] args) {

        // probarEnero2012();
        probarJunio2012();

    }

    public static void probarEnero2012() {

        Enero2012ListaDePalabras palabras = new Enero2012ListaDePalabras();

        palabras.addToRear("la");
        palabras.addToRear("casa");
        palabras.addToRear("es");
        palabras.addToRear("bonita");

        System.out.println(Enero2012ListaDePalabras.mostrar(palabras.obtenerContexto("es", 2)));
    }

    public static void probarJunio2012() {

        Junio2012Sublista lista1Pequena = new Junio2012Sublista();
        Junio2012Sublista lista1Grande = new Junio2012Sublista();

        lista1Pequena.addToRear(5);
        lista1Pequena.addToRear(17);
        lista1Pequena.addToRear(20);

        lista1Grande.addToRear(5);
        lista1Grande.addToRear(10);
        lista1Grande.addToRear(17);
        lista1Grande.addToRear(20);

        Junio2012Sublista lista2Pequena = new Junio2012Sublista();
        Junio2012Sublista lista2Grande = new Junio2012Sublista();

        lista2Pequena.addToRear(10);
        lista2Pequena.addToRear(20);

        lista2Grande.addToRear(5);
        lista2Grande.addToRear(10);
        lista2Grande.addToRear(17);
        lista2Grande.addToRear(20);

        Junio2012Sublista lista3Pequena = new Junio2012Sublista();
        Junio2012Sublista lista3Grande = new Junio2012Sublista();

        lista3Pequena.addToRear(10);
        lista3Pequena.addToRear(13);
        lista3Pequena.addToRear(20);

        lista3Grande.addToRear(5);
        lista3Grande.addToRear(10);
        lista3Grande.addToRear(15);
        lista3Grande.addToRear(17);
        lista3Grande.addToRear(20);

        Junio2012Sublista lista4Pequena = new Junio2012Sublista();
        Junio2012Sublista lista4Grande = new Junio2012Sublista();

        lista4Pequena.addToRear(15);
        lista4Pequena.addToRear(15);
        lista4Pequena.addToRear(20);

        lista4Grande.addToRear(5);
        lista4Grande.addToRear(10);
        lista4Grande.addToRear(15);
        lista4Grande.addToRear(17);
        lista4Grande.addToRear(20);

        System.out.println(lista1Pequena.estaContenida(lista1Grande));
        System.out.println(lista2Pequena.estaContenida(lista2Grande));
        System.out.println(lista3Pequena.estaContenida(lista3Grande));
        System.out.println(lista4Pequena.estaContenida(lista4Grande));
    }
}
