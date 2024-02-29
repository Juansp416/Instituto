package com.mycompany.instituto;

public class Persona {
    protected String DNI;
    protected String nombre;
    protected String apellido_1;
    protected String apellido_2;
    protected int edad;

    public Persona() {
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido_1() {
        return apellido_1;
    }

    public void setApellido_1(String apellido_2) {
        this.apellido_1 = apellido_2;
    }
    
    public String getApellido_2() {
    	return apellido_2;
    }
    public void setApellido_2(String apellido_2) {
    	this.apellido_2 = apellido_2;
    }
    public int getEdad() {
    	return edad;
    }
    public void setEdad(int edad) {
    	this.edad = edad;
    }
}
