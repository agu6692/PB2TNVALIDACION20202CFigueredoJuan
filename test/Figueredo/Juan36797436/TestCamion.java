package Figueredo.Juan36797436;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import Figueredo.Juan36797436.Camion;
import Figueredo.Juan36797436.Producto;
import Figueredo.Juan36797436.TiendaCamion;

public class TestCamion {
	

	//opcional
	@Test
	public void queSeAgregueUnProducto() {
		Camion primerCamion= new Camion("1234");
		
		Producto primerProducto= new Producto(12345,10.0,"packGaseosa",15.0);
	    assertTrue(primerCamion.cargarProducto(primerProducto));
	}
	
	//opcional
	@Test
	public void queSeDescargueUnProducto() throws ProductoInexistenteException {
		Producto nuevo = new Producto(1234, 10.0, "packShampo", 1.0);
		Camion vw = new Camion("12345");
		vw.cargarProducto(nuevo);
		assertEquals(nuevo,vw.descargarProducto(0));
	
	}
	
	//obligatorio
	@Test
	
	public void queDescargueUnProductoInexistenteLanceUnaException() {
	
	
	}
	
}
