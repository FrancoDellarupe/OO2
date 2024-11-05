package ar.edu.info.unlp.ejercicio7;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FileSystem {
	
	private Directorio raiz;
	
	public FileSystem(Directorio raiz) {
		this.raiz = raiz;
	}
			/**
		* Retorna el espacio total ocupado, incluyendo todo su contenido.
		*/
      public int tamanoTotalOcupado() {
    	  return this.raiz.getTamanio();
      }

		    	/**
		* Retorna el archivo con mayor cantidad de bytes en cualquier nivel del 
		* filesystem 
		*/
       public Archivo archivoMasGrande() {
    	   return this.raiz.archivoMasGrande();
       }

			/**
		* Retorna el archivo con fecha de creación más reciente en cualquier nivel 
		* del filesystem
		*/
       public Archivo archivoMasNuevo() {
    	   return this.raiz.archivoMasNuevo();
       }

		/**
		* Retorna el primer elemento con el nombre solicitado contenido en cualquier
		* nivel del filesystem
		*/
       public Elemento buscar(String nombre) {
    	   return this.raiz.buscar(nombre);
       }

		/**
		* Retorna la lista con los elementos que coinciden con el nombre solicitado 
		* contenido en cualquier nivel del filesystem
		*/
       public List<Elemento> buscarTodos(String nombre) {
    	   List<Elemento> lista = new ArrayList<Elemento>();
    	   this.raiz.buscarTodos(nombre, lista);
    	   return lista;
       }

		/**
		* Retorna un String con los nombres de los elementos contenidos en todos los 
		* niveles del filesystem. De cada elemento debe retornar el path completo
		* (similar al comando pwd de linux) siguiendo el modelo presentado a
		* continuación
		/Directorio A
		/Directorio A/Directorio A.1
		/Directorio A/Directorio A.1/Directorio A.1.1
		/Directorio A/Directorio A.1/Directorio A.1.2 	
		/Directorio A/Directorio A.2
		/Directorio B
		*/
       public String listadoDeContenido() {
    	   return this.raiz.listar("");
       }

}

