package org.example;

public class RegistroTiendas {
    private static ArrayList<Tienda> tiendas = new ArrayList<>();

    public static void agregarTienda(Tienda t) {
        tiendas.add(t);
    }

    public static void mostrarTodasLasTiendas() {
        System.out.println("--- Lista de tiendas ---");
        for (Tienda t : tiendas) {
            System.out.println(t.getNombre());
        }
    }
}

