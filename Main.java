import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;


/*
 * Diego Ruiz
 * Javier Alvarez
 * 
 * Driver program
 * Hoja de Trabajo 6
 * HashMap, TreeMap y LinkedHashMap 
 * 
*/

public class Main {
	public static void main(String[] args) {
		
		//HASH MAP
		HashMapTXT hm = new HashMapTXT();
		HashMap <Integer, Producto> producto = new HashMap <Integer, Producto>();
		hm.generateHashMap(producto, "ListadoProducto.txt");
		
		hm.agregarHM(producto, "Lacteos", "Queso crema", 10);
		
		for (Map.Entry<Integer, Producto> fila: producto.entrySet()) {
			System.out.println(fila.getKey() + ": " + fila.getValue().toString());
    	}
		
		System.out.println(hm.mostrarCategoria(producto, "Cerveza tibetana Barley")); 
		System.out.println(hm.mostrarProducto(producto, "Cerveza tibetana Barley")); 
		
		//TREE MAP
		TreeMapTXT tm = new TreeMapTXT();
		TreeMap <Integer, Producto> productoTree = new TreeMap <Integer, Producto>();
		tm.generateTreeMap(productoTree, "ListadoProducto.txt");
		
		tm.agregarTM(productoTree, "Lacteos", "Queso crema", 10);
		
		for (Map.Entry<Integer, Producto> fila: productoTree.entrySet()) {
			System.out.println(fila.getKey() + ": " + fila.getValue().toString());
    	}
		
		System.out.println(tm.mostrarCategoria(productoTree, "Cerveza tibetana Barley")); 
		System.out.println(tm.mostrarProducto(productoTree, "Cerveza tibetana Barley")); 
		
		//LINKED HASH MAP
		LinkedHashMapTXT lhm = new LinkedHashMapTXT();
		LinkedHashMap <Integer, Producto> productoLinked = new LinkedHashMap <Integer, Producto>();
		lhm.generateLinkedMap(productoLinked, "ListadoProducto.txt");
				
		lhm.agregarLHM(productoLinked, "Lacteos", "Queso crema", 10);
				
		for (Map.Entry<Integer, Producto> fila: productoLinked.entrySet()) {
			System.out.println(fila.getKey() + ": " + fila.getValue().toString());
		}
				
		System.out.println(lhm.mostrarCategoria(productoLinked, "Cerveza tibetana Barley")); 
		System.out.println(lhm.mostrarProducto(productoLinked, "Cerveza tibetana Barley")); 
		
	}
	
	

}
