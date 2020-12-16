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
        
     

        
		
	}
	

	//opcional
	@Test
	public void queAlArirUnaCajaLaListaDeVentaEsteVacia() {
		
	}

}
