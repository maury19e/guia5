package guia5nueva;

public class Producto {
	private String nombre;
	private int precio;
	private int unidad;
//contuctor de productos
	public Producto(String nomb,int pre,int uni){
		this.nombre=nomb;
		this.precio=pre;
		this.unidad=uni;
	}
	public Producto(){
		this.nombre="";
		this.precio=0;
		this.unidad=0;
	}
	//octener datos
	public String leerNOM() {
		return this.nombre;
	}
	public int leerPRE() {
		return this.precio;
	}
	public int leerUNI() {
		return this.unidad;
	}
	//modificar producto
	public void modificarSTOCK(int uni) {
		this.unidad=uni;
		
	}

}
