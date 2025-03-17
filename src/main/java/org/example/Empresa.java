package org.example;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Empleados> empleados;

    public Empresa(){
        this.empleados= new ArrayList<>();
    }
<<<<<<< HEAD
    public void agregarEmpleado(String  nombre,double  salario) {
        Empleado nuevoEmpleado = new Empleado(nombre, salario);
=======

    public void agregarEmpleado(String nombre, double salario){
        Empleados nuevoEmpleado = new Empleados(nombre,salario);
>>>>>>> 8f4afc4 (Cambios Felipe)
        empleados.add(nuevoEmpleado);
        System.out.println("Ha agregado exitosamente el empleado");
    }

    public void listarEmpleados(){
        if(empleados.isEmpty()){
            System.out.println("Por el momento no hay empleados registrados");
            return;
<<<<<<< HEAD
        }else{
            for(Empleado empleado: empleados){
                empleado.mostrarInfo();
            }
            System.out.println("Total de empleados registrados: "+Empleado.getcontadorEmpleados());
=======
        } else {
            for (Empleados empleado: empleados){
                empleado.mostrarInfo();
            }
            System.out.println("Total de empleados enlistados: "+Empleados.getContadorEmpleados());
>>>>>>> 8f4afc4 (Cambios Felipe)
        }
    }
}
