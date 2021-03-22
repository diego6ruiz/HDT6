/*
 * Diego Ruiz
 * Javier Alvarez
 * 
*/

import java.io.File;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class LinkedHashMapTXT {
		public LinkedHashMapTXT() {
		}
		
		public void generateLinkedMap(LinkedHashMap <Integer, Producto> productoLinked, String filename) {
			 try {
		            Scanner input = new Scanner(new File(filename));
		            int i = 1;
		            while (input.hasNextLine()) {
		                String line = input.nextLine();
		                String[] tokens = line.split(" \\|	");
		                productoLinked.put(i, new Producto(tokens[0], tokens[1], 10));
		                i++;
		            }
		            input.close();
		        } catch (Exception ex) {
		            ex.printStackTrace();
		        }
		}
		
		public void agregarLHM(LinkedHashMap <Integer, Producto> productoLinked, String categoria, String nombreP, Integer existencia) {
			int a = productoLinked.size();
			productoLinked.put((a+1), new Producto(categoria, nombreP, existencia));
		}
		
		public String mostrarProducto(LinkedHashMap <Integer, Producto> productoLinked, String n) {
			String name = "";
			String detalles = "";
			for(Producto val: productoLinked.values()) {
				name = val.getNombre();
				if(name.equalsIgnoreCase(n)) {
					detalles = val.toString();
				}
			}
			return detalles;
		}
		
		public String mostrarCategoria(LinkedHashMap <Integer, Producto> productoLinked, String n) {
			String name = "";
			String categ = "";
			for(Producto val: productoLinked.values()) {
				name = val.getNombre();
				if(name.equalsIgnoreCase(n)) {
					categ = val.getCategoria();
				}
			}
			return categ;
		}
}