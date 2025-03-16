package org.example;

public class Empleado {
    private static int contadorEmpleados;
    private String nombre;
    private double salario;
    private int id;
    public Empleado (String nombre, double salario){
        this.id=++contadorEmpleados;
        this.nombre=nombre;
        this.salario=salario;
    }
    public int getId() {
        return id;
    }
    public String getNombre(){
        return nombre;
    }
    public double getSalario(){
        return salario;
    }
    public void mostrarInfo(){
        System.out.println("ID: "+id+"| Nombre: "+nombre+"| Salario: "+salario);
    }
    public static int getcontadorEmpleados() {
        return contadorEmpleados;
    }
}
