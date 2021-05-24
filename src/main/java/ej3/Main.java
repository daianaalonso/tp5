package ej3;

import ej3.modelo.*;

public class Main {
    public static void main(String[] args) {
        Mezclar mezclar = new Tomate("tomate", 50,
                            new Papas("papas", 100,
                               new Combo("Simple", "pan + carne", 200)));
        System.out.println(mezclar.obtenerContenido() + "\nCosto total: $" + mezclar.obtenerCosto());

        Mezclar mezclar1 = new Carne("carne", 100,
                            new Queso("queso", 70,
                                new Combo("Especial", "pan + carne + huevo + paleta", 300)));
        System.out.println(mezclar1.obtenerContenido() + "\nCosto total: $" + mezclar1.obtenerCosto());
    }
}
