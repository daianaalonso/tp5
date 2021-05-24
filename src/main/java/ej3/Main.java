package ej3;

import ej3.modelo.Combo;
import ej3.modelo.Mezclar;
import ej3.modelo.Papas;

public class Main {
    public static void main(String[] args) {
        Mezclar mezclar = new Papas(new Combo("pan + carne", 200), "papas", 100);
        System.out.println("Contenido: " + mezclar.obtenerContenido() + "\nCosto total: $" + mezclar.obtenerCosto());
    }
}
