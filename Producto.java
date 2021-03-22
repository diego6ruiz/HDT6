public class Producto {
	private String categoria;
	private String nombreP;
	private Integer existencia;
	
	public Producto(String categoria, String nombreP, Integer existencia){
		this.categoria = categoria;
		this.nombreP = nombreP;
		this.existencia = existencia;
	}
	
	public String getNombre(){
		return nombreP;
	}
	public String getCategoria(){
		return categoria;
	}
	
	@Override
	public String toString() {
		return (categoria + ", " + nombreP + ", " + existencia);
	}
	
}
