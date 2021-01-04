package Figueredo.Juan36797436;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import Figueredo.Juan36797436.Producto;
import Figueredo.Juan36797436.Reporte;
import Figueredo.Juan36797436.TiendaCamion;

public class TestTiendaCamion {
	
	
	
	//Obligatorio
	
	@Test
	public void queSeObtengaUnreporteAlHAcerUnCierreZ()  throws CajaCerradaException, ProductoInexistenteException{
		TiendaCamion tienda = new TiendaCamion("1234");
        
        Producto primerProducto = new Producto(1,30.0,"gaseosa",5.0);
        Producto segundoProducto = new Producto(2,40.0,"galletitas",14.0);


        tienda.abrirCaja();

        tienda.agregarProducto(primerProducto);
        tienda.agregarProducto(segundoProducto);
        tienda.vender(1);
        tienda.vender(2);
        
        assertEquals(70.0,tienda.cierreZ().getTotalVentas(),0.1);
        assertEquals((70.0*0.21),tienda.cierreZ().getTotalIva(),0.1);
		assertEquals(70.0+(70.0*0.21),tienda.cierreZ().getTotalNeto(),0.1);
        
     

        
		
	}
	

	//opcional
	@Test
	public void queAlArirUnaCajaLaListaDeVentaEsteVacia()throws CajaCerradaException, ProductoInexistenteException {
		TiendaCamion tienda1 = new TiendaCamion("AAA111");
		Producto producto1 = new Producto(1,10.0,"coca",1.0);
		Producto producto2 = new Producto(2,20.0,"agua",1.5);
		Producto producto3 = new Producto(3,30.0,"soda",1.3);
		
		tienda1.agregarProducto(producto3);
		tienda1.agregarProducto(producto2);
		tienda1.agregarProducto(producto1);
		
		tienda1.abrirCaja();
		tienda1.vender(1);
		tienda1.vender(2);
		tienda1.vender(3);
		tienda1.cierreZ();
		
		tienda1.abrirCaja();
		
		assertEquals(0,tienda1.getCantidadVentas(),0.1);
		
	}

}
