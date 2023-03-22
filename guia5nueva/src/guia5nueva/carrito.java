package guia5nueva;

public class carrito {

	private int total=0;
	//contuctor de productos
		public carrito(Producto pr1,Producto pr2){
			this.total=(pr1.leerPRE()*pr1.leerUNI())+(pr2.leerPRE()*pr2.leerUNI());
			
		}
		public carrito(){
			this.total=0;
		}
	
		public int leertotal() {
			return this.total;
		}


}
