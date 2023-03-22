package guia5nueva;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class usoPROGRAMA {

	public static void main(String[] args) {
		//el proximo comterio seria del punto 1
		//Producto pro1=new Producto("fanta", 130 , 1);
		//Producto pro2=new Producto("sprite", 140 , 2);
		 
		String[] arrey = null;
		
		try {
			Path ARCHIVO = Paths.get("algoQUEnoEXISTE.txt");
			for (String linea: Files.readAllLines(ARCHIVO)) {
				arrey=linea.split(" ");
			}
			
			} catch (IOException e) {
				e.printStackTrace();
			}	
			int numero = Integer.parseInt(arrey[0]);
			int numero1 = Integer.parseInt(arrey[1]);
			String nom =arrey[2];
			Producto pro1=new Producto(nom, numero1,numero);
			
			numero = Integer.parseInt(arrey[3]);
			numero1 = Integer.parseInt(arrey[4]);
			nom =arrey[5];
			Producto pro2=new Producto(nom, numero1,numero);  
			
		carrito total=new carrito(pro1,pro2);
		System.out.print("total de las compras sin descuento"+total.leertotal());
		descuento des1=new descuento(total.leertotal());
		System.out.print("\ntotal de las compras con descuento "+des1.leerDES1() );
		
	

}
}
