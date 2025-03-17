package org.example;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Empleados> empleados;

    public Empresa(){
        this.empleados= new ArrayList<>();
    }
    public void agregarEmpleado(String  nombre,double  salario) {
        Empleados nuevoEmpleado = new Empleados(nombre, salario);
        empleados.add(nuevoEmpleado);
        System.out.println("Ha agregado exitosamente el empleado");
    }

    public void listarEmpleados(){
        if(empleados.isEmpty()){
            System.out.println("Por el momento no hay empleados registrados");
            return;
        }else{
            for(Empleados empleado: empleados){
                empleado.mostrarInfo();
            }
            System.out.println("Total de empleados registrados: "+Empleados.getContadorEmpleados());
        }
    }
}
