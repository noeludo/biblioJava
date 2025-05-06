package org.example;

public class Tienda {
    private String nombre;
    private ArrayList<Producto> productos = new ArrayList<>();
    private ArrayList<Trabajador> trabajadores = new ArrayList<>();
    private ArrayList<Cliente> clientes = new ArrayList<>();

    public Tienda(String nombre) {
        this.nombre = nombre;
        RegistroTiendas.agregarTienda(this); // opción para mantener lista global
    }

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    public void agregarTrabajador(Trabajador t) {
        trabajadores.add(t);
    }

    public void agregarCliente(Cliente c) {
        clientes.add(c);
    }

    public void mostrarProductos() {
        System.out.println("Productos en " + nombre + ":");
        for (Producto p : productos) {
            System.out.println(p);
        }
    }

    public void mostrarTrabajadores() {
        System.out.println("Trabajadores en " + nombre + ":");
        for (Trabajador t : trabajadores) {
            System.out.println(t);
        }
    }

    public void mostrarClientes() {
        System.out.println("Clientes en " + nombre + ":");
        for (Cliente c : clientes) {
            System.out.println(c);
        }
    }

    public String getNombre() {
        return nombre;
    }
}
