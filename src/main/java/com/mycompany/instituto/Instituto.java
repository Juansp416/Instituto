package com.mycompany.instituto;

import java.util.Scanner;

public class Instituto {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        
        Profesor profesor = new Profesor();
        Alumno alumno = new Alumno();
        
        System.out.println("Leyendo datos del profesor: \n");
        System.out.print("DNI: ");
        profesor.setDNI(sca.nextLine());
        System.out.println("");
        System.out.print("Nombre: ");
        profesor.setNombre(sca.nextLine());
        System.out.println("");
        System.out.print("Primer apellido: ");
        profesor.setApellido_1(sca.nextLine());
        System.out.println("");
        System.out.println("Segundo apellido: ");
        profesor.setApellido_2(sca.nextLine());
        System.out.print("Código de docente: ");
        profesor.setCodigoDocente(sca.nextLine());
        System.out.println("");
        System.out.println("Edad del profesor: ");
        profesor.setEdad(sca.nextInt());
        System.out.println("");
        System.out.println("Es el profesor el tutor?(sí/no): ");
        profesor.setTutor(sca.next());
        System.out.println("");
        
        
        System.out.println("Mostrando datos del profesor: \n");
        System.out.println("DNI: " + profesor.getDNI());
        System.out.println("Nombre: " + profesor.getNombre());
        System.out.println("Apellidos: " + profesor.getApellido_1() + " " + profesor.getApellido_2());
        System.out.println("Código de docente: " + profesor.getCodigoDocente());
        System.out.println("Edad: " + profesor.getEdad());
        System.out.println("El profesor es tutor del alumno: " + profesor.getTutor());
        System.out.println("");
        System.out.println("------------------------------------------------------------------");
        System.out.println("");

        
        System.out.println("Leyendo datos del alumno: \n");
        System.out.print("DNI: ");
        alumno.setDNI(sca.next());
        System.out.println("");
        System.out.print("Nombre: ");
        alumno.setNombre(sca.next());
        System.out.println("");
        System.out.print("Primer apellido: ");
        alumno.setApellido_1(sca.next());
        System.out.println("");
        System.out.println("Segundo apellido: ");
        alumno.setApellido_2(sca.next());
        System.out.println("");
        System.out.print("Código de alumno: ");
        alumno.setCodigoAlumno(sca.next());
        System.out.println("");
        System.out.println("Edad del alumno: ");
        alumno.setEdad(sca.nextInt());
        System.out.println("");
        System.out.println("Número de partes del alumno: ");
        alumno.setNPartes(sca.nextInt());
        System.out.println("");
        System.out.println("Número de suspensos del alumno: ");
        alumno.setNSuspensos(sca.nextInt());
        System.out.println("");
        
        System.out.println("Mostrando datos del alumno: \n");
        System.out.println("DNI: " + alumno.getDNI());
        System.out.println("Nombre: " + alumno.getNombre());
        System.out.println("Apellidos: " + alumno.getApellido_1() + " " + alumno.getApellido_2());
        System.out.println("Código de docente: " + alumno.getCodigoAlumno());
        System.out.println("Edad: " + alumno.getEdad());
        System.out.println("Partes: " + alumno.getNPartes());
        System.out.println("Suspensos: " + alumno.getNSuspensos());
    }
}
