/*
 * Diego Ruiz
 * Javier Alvarez
 * 
*/
import java.io.File;
import java.util.TreeMap;
import java.util.Scanner;

public class TreeMapTXT {
		public TreeMapTXT() {
		}
		
		public void generateTreeMap(TreeMap <Integer, Producto> productoTree, String filename) {
			 try {
		            Scanner input = new Scanner(new File(filename));
		            int i = 1;
		            while (input.hasNextLine()) {
		                String line = input.nextLine();
		                String[] tokens = line.split(" \\|	");
		                productoTree.put(i, new Producto(tokens[0], tokens[1], 10));
		                i++;
		            }
		            input.close();
		        } catch (Exception ex) {
		            ex.printStackTrace();
		        }
		}
		
		public void agregarTM(TreeMap <Integer, Producto> productoTree, String categoria, String nombreP, Integer existencia) {
			int a = productoTree.size();
			productoTree.put((a+1), new Producto(categoria, nombreP, existencia));
		}
		
		public String mostrarProducto(TreeMap <Integer, Producto> productoTree, String n) {
			String name = "";
			String detalles = "";
			for(Producto val: productoTree.values()) {
				name = val.getNombre();
				if(name.equalsIgnoreCase(n)) {
					detalles = val.toString();
				}
			}
			return detalles;
		}
		
		public String mostrarCategoria(TreeMap <Integer, Producto> productoTree, String n) {
			String name = "";
			String categ = "";
			for(Producto val: productoTree.values()) {
				name = val.getNombre();
				if(name.equalsIgnoreCase(n)) {
					categ = val.getCategoria();
				}
			}
			return categ;
		}
}