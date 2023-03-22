package guia5nueva;

public class descuento {

	private int descuento1;
	
	public descuento(int des1){
		this.descuento1=des1-(des1/100*30);
		}
	public descuento() {
		this.descuento1=0;
	}
	public int leerDES1() {
		return this.descuento1;
	}
	

}
