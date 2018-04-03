import Prenda.java;


public class Item {
	Prenda prenda;
	int cantidad;
	
	
	Item(Prenda unaPrenda,int unaCantidad){
		this.prenda = unaPrenda;
		this.cantidad = unaCantidad;
	}
	
	float importe(){
		return prenda.precio() * cantidad;
	}
}