package com.mycompany.instituto;

public class Profesor extends Persona{
    private String codigoDocente;
    private boolean Tutor;
    
    public Profesor() {
        super();
    }

    public String getCodigoDocente() {
        return codigoDocente;
    }

    public void setCodigoDocente(String codigoDocente) {
        this.codigoDocente = codigoDocente;
    }
    
    public boolean getTutor() {
    	return Tutor;
    }
    
    public void setTutor(String Respuesta) {
    	if (Respuesta.equals("sí")) {
    		this.Tutor = true;
    	}else {
    		this.Tutor = false;
    	}
    }
}
