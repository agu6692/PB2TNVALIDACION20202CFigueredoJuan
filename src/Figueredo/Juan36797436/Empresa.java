package Figueredo.Juan36797436;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public class Empresa {

	// completar la clase Empresa

	// si es necesraio agregue los metodos atributos y clases que crea que sea
	// conveniente
	private String nombre;
	private HashMap<Integer, Camion> flota;
	private Integer idCamion=0;

	public Empresa() {
		flota = new HashMap<>();

	}

	public void agregarCamion(Camion camion) {

		// se agrega uncamion el primer camion tiene como identificador 0 el el segundo
		// 1 2 3.4
		if(camion != null) {
			flota.put(idCamion, camion);
			idCamion++;
		}

	}

	public Integer cantidadDeCamiones() {

		return flota.size();
	}

	public TreeSet<Camion> obtenerTiendascamionOrdenadoPorPatente() {
		
		
		return null;
	}

}
