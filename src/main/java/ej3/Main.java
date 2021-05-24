package ej3;

import ej3.modelo.Combo;
import ej3.modelo.Mezclar;
import ej3.modelo.Papas;
import ej3.modelo.Tomate;

public class Main {
    public static void main(String[] args) {
        Mezclar mezclar = new Tomate("tomate", 50,
                                new Papas("papas", 100,
                                    new Combo("Simple : pan + carne", 200)));
        System.out.println("Contenido: " + mezclar.obtenerContenido() + "\nCosto total: $" + mezclar.obtenerCosto());
    }
}
