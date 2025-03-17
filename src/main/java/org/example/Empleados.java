package org.example;

public class Empleados{
    private static int contadorEmpleados = 0;
    private String nombre;
    private double salario;
    private int id;

    public Empleados(String nombre, double salario) {
        this.id = ++contadorEmpleados;
        this.nombre = nombre;
        this.salario = salario;
    }

    public int getId() {
        return this.id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public double getSalario() {
        return this.salario;
    }

    public void mostrarInfo() {
        System.out.println("ID: " + this.id + " | Nombre: " + this.nombre + " | Salario: $" + this.salario);
    }

    public static int getContadorEmpleados() {
        return contadorEmpleados;
    }
}
