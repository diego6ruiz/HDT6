import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;



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
		
		Scanner entrada = new Scanner(System.in);
		
		boolean seguir = true;
		
		HashMapTXT hm = new HashMapTXT();
		HashMap <Integer, Producto> producto = new HashMap <Integer, Producto>();
		hm.generateHashMap(producto, "ListadoProducto.txt");
		
		TreeMapTXT tm = new TreeMapTXT();
		TreeMap <Integer, Producto> productoTree = new TreeMap <Integer, Producto>();
		tm.generateTreeMap(productoTree, "ListadoProducto.txt");
		
		LinkedHashMapTXT lhm = new LinkedHashMapTXT();
		LinkedHashMap <Integer, Producto> productoLinked = new LinkedHashMap <Integer, Producto>();
		lhm.generateLinkedMap(productoLinked, "ListadoProducto.txt");
		
		while (seguir == true) {
			System.out.println("Usar el programa? S/N");
			String opc = entrada.next();
		if (opc.equals("s")||opc.equals("S")) {
			System.out.println("Ingrese 1 para HashMap, 2 para TreeMap o 3 para LinkedHashMap");
			String num = entrada.next();
			
			if (num.equals("1")) {
				
				System.out.println("Ingrese 1 para ver la inforamcion completa, 2 para ver los detalles de un articulo, 3 para buscar mostrar la categoria segun el producto, 4 para agreagr un articulo");
				String num2 = entrada.next();
				if (num2.equals("1")) {
					for (Map.Entry<Integer, Producto> fila: producto.entrySet()) {
						System.out.println(fila.getKey() + ": " + fila.getValue().toString());
			    	}
					
				}
				else if (num2.equals("2")) {
					System.out.println("Ingrese el nombre de producto");
					String produ2 = entrada.next();
					System.out.println(hm.mostrarProducto(producto, produ2));
					
				}
				else if (num2.equals("3")) {
					System.out.println("Ingrese el nombre de producto");
					String produ3 = entrada.next();
					System.out.println(hm.mostrarCategoria(producto, produ3));
				}
					
				else if (num2.equals("4")) {
					System.out.println("Ingrese la categoria del producto");
					String cate = entrada.next();
					System.out.println("Ingrese el nombre de producto");
					String produ = entrada.next();
					System.out.println("Ingrese en numeros la cantidad");
					int canti = entrada.nextInt();
					
					hm.agregarHM(producto, cate, produ, canti);
				}
			}
			else if (num.equals("2")) {
				
				System.out.println("Ingrese 1 para ver la inforamcion completa, 2 para ver los detalles de un articulo, 3 para buscar mostrar la categoria segun el producto, 4 para agreagr un articulo");
				String num3 = entrada.next();
				if (num3.equals("1")) {
					for (Map.Entry<Integer, Producto> fila: productoTree.entrySet()) {
						System.out.println(fila.getKey() + ": " + fila.getValue().toString());
			    	}
				}
				else if (num3.equals("2")) {
					System.out.println("Ingrese el nombre de producto");
					String produ5 = entrada.next();
					System.out.println(tm.mostrarProducto(productoTree, produ5)); 
				}
				else if (num3.equals("3")) {
					System.out.println("Ingrese el nombre de producto");
					String produ6 = entrada.next();
					System.out.println(tm.mostrarCategoria(productoTree, produ6));
				}
				else if (num3.equals("4")) {
					System.out.println("Ingrese la categoria del producto");
					String cate2 = entrada.next();
					System.out.println("Ingrese el nombre de producto");
					String produ4 = entrada.next();
					System.out.println("Ingrese en numeros la cantidad");
					int canti2 = entrada.nextInt();
					tm.agregarTM(productoTree, cate2, produ4, canti2);
				}
			}
			else if (num.equals("3")) {
							
				System.out.println("Ingrese 1 para ver la inforamcion completa, 2 para ver los detalles de un articulo, 3 para buscar mostrar la categoria segun el producto, 4 para agreagr un articulo");
				String num4 = entrada.next();
				if (num.equals("1")) {
					for (Map.Entry<Integer, Producto> fila: productoLinked.entrySet()) {
						System.out.println(fila.getKey() + ": " + fila.getValue().toString());
					}
				}
				else if (num4.equals("2")) {
					System.out.println("Ingrese el nombre de producto");
					String produ8 = entrada.next();
					System.out.println(lhm.mostrarProducto(productoLinked, produ8)); 
				}
				else if (num4.equals("3")) {
					System.out.println("Ingrese el nombre de producto");
					String produ9 = entrada.next();
					System.out.println(lhm.mostrarCategoria(productoLinked, produ9)); 
				}
				else if (num4.equals("4")) {
					System.out.println("Ingrese la categoria del producto");
					String cate3 = entrada.next();
					System.out.println("Ingrese el nombre de producto");
					String produ7 = entrada.next();
					System.out.println("Ingrese en numeros la cantidad");
					int canti3 = entrada.nextInt();
					lhm.agregarLHM(productoLinked, cate3, produ7, canti3);
					
				}
			}
			
		} else seguir = false;
		
		//HASH MAP
		//HashMapTXT hm = new HashMapTXT();
		//HashMap <Integer, Producto> producto = new HashMap <Integer, Producto>();
		//hm.generateHashMap(producto, "ListadoProducto.txt");
		
		//hm.agregarHM(producto, "Lacteos", "Queso crema", 10);
		///
		//for (Map.Entry<Integer, Producto> fila: producto.entrySet()) //{
		//	System.out.println(fila.getKey() + ": " + fila.getValue().toString());
    	//}
		
		//System.out.println(hm.mostrarCategoria(producto, "Cerveza tibetana Barley")); 
		//System.out.println(hm.mostrarProducto(producto, "Cerveza tibetana Barley")); 
		
		//TREE MAP
		//TreeMapTXT tm = new TreeMapTXT();
		//TreeMap <Integer, Producto> productoTree = new TreeMap <Integer, Producto>();
		//tm.generateTreeMap(productoTree, "ListadoProducto.txt");
		
		//tm.agregarTM(productoTree, "Lacteos", "Queso crema", 10);
		
		//for (Map.Entry<Integer, Producto> fila: productoTree.entrySet()) {
		//	System.out.println(fila.getKey() + ": " + fila.getValue().toString());
    	//}
		//
		//System.out.println(tm.mostrarCategoria(productoTree, "Cerveza tibetana Barley")); 
		//System.out.println(tm.mostrarProducto(productoTree, "Cerveza tibetana Barley")); 
		
		//LINKED HASH MAP
		//LinkedHashMapTXT lhm = new LinkedHashMapTXT();
		//LinkedHashMap <Integer, Producto> productoLinked = new LinkedHashMap <Integer, Producto>();
		//lhm.generateLinkedMap(productoLinked, "ListadoProducto.txt");
				
		//lhm.agregarLHM(productoLinked, "Lacteos", "Queso crema", 10);
				
		//for (Map.Entry<Integer, Producto> fila: productoLinked.entrySet()) {
		//	System.out.println(fila.getKey() + ": " + fila.getValue().toString());
		//}
				
		//System.out.println(lhm.mostrarCategoria(productoLinked, "Cerveza tibetana Barley")); 
		//System.out.println(lhm.mostrarProducto(productoLinked, "Cerveza tibetana Barley")); 
		
	//}
	
		}
	}

}

