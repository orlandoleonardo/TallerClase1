import estadoPrenda.java;
//import Prenda.java;

public class prendaPromocion {
	
	float descuento;
	
	Promocion(float unDescuento){
		this.descuento = unDescuento;
	}
	
	public float precioFinal(float precioOriginal) {
		return precioOriginal - descuento;
	};
	
}
