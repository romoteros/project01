package com.refactoring.projects.project01;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class LibraryManager {

    private List<String> libros = new ArrayList<>();
    private List<String> usuarios = new ArrayList<>();
    
    
    public void procesarPrestamo(String usuario, String libro, int dias) {
	    if (usuarios.contains(usuario) && libros.contains(libro)) {
	        System.out.println("Verificando disponibilidad...");
	        boolean disponible = true;
	        if (disponible) {
	            System.out.println("Prestamo realizado");
	            libros.remove(libro);

	            // Calcular fecha de devolución
	            Calendar cal = Calendar.getInstance();
	            cal.add(Calendar.DAY_OF_MONTH, dias);
	            System.out.println("Fecha devolucion: " + cal.getTime());
	            
	            //hola, es una prueba
	        }
	    }
	}
}


