package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (i==0){
            System.out.println("Bienvenido a tu programa para gestionar la empresa:");
            System.out.println("1) Agregar Empleado.");
            System.out.println("2) Listar Empleado.");
            System.out.println("3) Salir del programa.");
            System.out.println("Digita la opcion a la que deseas acceder");
            int elec = scanner.nextInt();
            switch (elec) {
                case 1:
                    scanner.nextLine();
                    System.out.println("Digita el nombre del nuevo empleado: ");
                    String nombre = scanner.nextLine();
                    System.out.println("Digita el salario del nuevo empleado: ");
                    double salario = scanner.nextDouble();
                    empresa.agregarEmpleado(nombre,salario);
                    break;
                case 2:
                    empresa.listarEmpleados();
                    Esperar.esperar(2);
                    break;
                case 3:
                    i=1;
                    break;
                default:
                    System.out.println("Digito no valido. Vuelva a intentarlo");
            }
        }
    }
}