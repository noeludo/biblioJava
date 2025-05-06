// Main.java
package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Tienda.inicializarTiendas();

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Menú Principal ---");
            System.out.println("1. Ver tiendas");
            System.out.println("2. Ver productos de una tienda");
            System.out.println("3. Ver trabajadores de una tienda");
            System.out.println("4. Ver clientes de una tienda");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    RegistroTiendas.mostrarTodasLasTiendas();
                    break;
                case 2:
                    RegistroTiendas.mostrarProductosDeUnaTienda(scanner);
                    break;
                case 3:
                    RegistroTiendas.mostrarTrabajadoresDeUnaTienda(scanner);
                    break;
                case 4:
                    RegistroTiendas.mostrarClientesDeUnaTienda(scanner);
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 0);

        scanner.close();
    }
}
