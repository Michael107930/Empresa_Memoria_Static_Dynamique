package org.example;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Empleado> empleados;

    public Empresa(){
        this.empleados= new ArrayList<>();
    }
    public void agregarEmpleado(String  nombre,double  salario){
        Empleado nuevoEmpleado = new Empleado(nombre,salario);
        empleados.add(nuevoEmpleado);
        System.out.println("Ha agregado exitosamente el empleado");


    }
}
