package com.mycompany.instituto;

public class Alumno extends Persona{
    private String codigoAlumno;
    private int nPartes;
    private int nSuspensos;
    
    public Alumno() {
        super();
    }

    public String getCodigoAlumno() {
        return codigoAlumno;
    }

    public void setCodigoAlumno(String codigoAlumno) {
        this.codigoAlumno = codigoAlumno;
    }
    
    public int getNPartes() {
    	return nPartes;
    }
    
    public void setNPartes(int NPartes) {
    	this.nPartes = NPartes;
    }
    
    public int getNSuspensos() {
    	return nSuspensos;
    }
    
    public void setNSuspensos(int NSuspensos) {
    	this.nSuspensos = NSuspensos;
    }
}
