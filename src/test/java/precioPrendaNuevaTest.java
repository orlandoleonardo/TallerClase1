
public class precioPrendaNuevaTest {
	
	@Test
	Prenda prenda = new Prenda(20 , prendaNueva);
	
	Assert.assertEquals(20,prenda.precioFinal());
	
}
