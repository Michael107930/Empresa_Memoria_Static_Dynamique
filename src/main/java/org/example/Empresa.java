package org.example;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Empleado> empleados;

    public Empresa(){
        this.empleados= new ArrayList<>();
    }

    public void agregarEmpleado(String nombre, double salario){
        Empleado nuevoEmpleado = new Empleado(nombre,salario);
        empleados.add(nuevoEmpleado);
        System.out.println("El empleado ha sido agregado exitosamente.");
    }
    public void listarEmpleados(){
        if (empleados.isEmpty()){
            System.out.println("No hay empleados registrados");
            return;
        } else {
            for (Empleado empleado: empleados){
                empleado.mostrarInfo();
            }
            System.out.println("Total de empleados enlistados: "+Empleado.getcontadorEmpleados());
        }
    }
}
