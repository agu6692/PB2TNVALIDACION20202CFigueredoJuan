package Figueredo.Juan36797436;

import static org.junit.Assert.assertEquals;

import java.util.TreeSet;

import org.junit.Test;

import Figueredo.Juan36797436.Camion;
import Figueredo.Juan36797436.Empresa;
import Figueredo.Juan36797436.TiendaCamion;

public class TestEmpresa {
	
	
	//Opcional
	@Test
	public void queSeAgregueUnCamion() {
		Camion vw = new Camion("123");
		Empresa luxcar = new Empresa("volks");
		luxcar.agregarCamion(vw);
		Integer valor = 1;
		assertEquals(valor, luxcar.cantidadDeCamiones());
	
	}
	
	
//Obligatorio
	@Test
	public void QueSeObtengaUnaListaDeCaionesTiendaOrdenadosPorPatentes() {
		Empresa nueva = new Empresa("samsung");
		Camion camion1 = new Camion("AAA111");
		Camion camion2 = new Camion("BBB111");
		Camion camion3 = new Camion("CCC111");
		Camion camion4 = new Camion("DDD111");
		
		nueva.agregarCamion(camion1);
		nueva.agregarCamion(camion2);
		nueva.agregarCamion(camion3);
		nueva.agregarCamion(camion4);
		
		assertEquals(camion1, nueva.obtenerTiendascamionOrdenadoPorPatente().first());
		assertEquals(camion4, nueva.obtenerTiendascamionOrdenadoPorPatente().last());
		
		
	}


}
