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
		Empresa luxcar = new Empresa();
		luxcar.agregarCamion(vw);
		Integer valor = 1;
		assertEquals(valor, luxcar.cantidadDeCamiones());
	
	}
	
	
//Obligatorio
	@Test
	public void QueSeObtengaUnaListaDeCaionesTiendaOrdenadosPorPatentes() {
		
		
	}


}
