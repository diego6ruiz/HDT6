/*
 * Diego Ruiz
 * Javier Alvarez
 * 
*/

import java.io.File;
import java.util.HashMap;
import java.util.Scanner;


public class HashMapTXT {
	public HashMapTXT() {
	}
	
	public void generateHashMap(HashMap <Integer, Producto> producto, String filename) {
		 try {
	            Scanner input = new Scanner(new File(filename));
	            int i = 1;
	            while (input.hasNextLine()) {
	                String line = input.nextLine();
	                String[] tokens = line.split(" \\|	");
	                producto.put(i, new Producto(tokens[0], tokens[1], 10));
	                i++;
	            }
	            input.close();
	        } catch (Exception ex) {
	            ex.printStackTrace();
	        }
	}
	
	public void agregarHM(HashMap <Integer, Producto> producto, String categoria, String nombreP, Integer existencia) {
		int a = producto.size();
		producto.put((a+1), new Producto(categoria, nombreP, existencia));
	}
	
	public String mostrarProducto(HashMap <Integer, Producto> producto, String n) {
		String name = "";
		String detalles = "";
		for(Producto val: producto.values()) {
			name = val.getNombre();
			if(name.equalsIgnoreCase(n)) {
				detalles = val.toString();
			}
		}
		return detalles;
	}
	
	public String mostrarCategoria(HashMap <Integer, Producto> producto, String n) {
		String name = "";
		String categ = "";
		for(Producto val: producto.values()) {
			name = val.getNombre();
			if(name.equalsIgnoreCase(n)) {
				categ = val.getCategoria();
			}
		}
		return categ;
	}
	
	
	

}
