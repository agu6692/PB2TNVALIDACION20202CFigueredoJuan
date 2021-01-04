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
	private Integer cantidadDeCamiones=0;
	private ArrayList<Camion> camionesAOrdenar = new ArrayList<Camion>();

	public Empresa(String nombre) {
		flota = new HashMap<>();
		this.nombre=nombre;

	}

	public void agregarCamion(Camion camion) {

		// se agrega uncamion el primer camion tiene como identificador 0 el el segundo
		// 1 2 3.4
		this.flota.put(this.idCamion++,camion);
		this.camionesAOrdenar.add(camion);
		++cantidadDeCamiones;
		

	}

	public Integer cantidadDeCamiones() {

		return flota.size();
	}

	public TreeSet<Camion> obtenerTiendascamionOrdenadoPorPatente() {
		
		
		PorPatenteComparator ordenador = new PorPatenteComparator();
		TreeSet<Camion> camionesOrdenados = new TreeSet<Camion>(ordenador);
		camionesOrdenados.addAll(camionesAOrdenar);
		
		return camionesOrdenados;
	}

}
