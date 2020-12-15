package Figueredo.Juan36797436;

import java.util.ArrayList;
import java.util.List;


/*
 * La clase tiendaCamion pertenece a la familia de los camiones y tambien se comporta como una tienda
 * 
 * Desarrolle  e implemente los metodos pedido para que la clase cumpla con sus funcionalidades
 */
public class TiendaCamion extends Camion implements ITienda  {
	private List<Producto> ventas;
	private Boolean estadoDeCaja; // True Abierta - False Cerrada
	
	
	public TiendaCamion(String Patente) {
		
		
		
	}

	
	

	public void abrirCaja() {
		// Al Inicicio del dia limpia todas las ventas
		// y abre la caja diaria
		this.ventas.removeAll(ventas);
		this.estadoDeCaja=true;

		
	}
	
	public void cerrarCaja() {
		
		this.estadoDeCaja=false;
	}




	@Override
	public void vender(Integer idProducto) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public Reporte cierreZ() {
		// TODO Auto-generated method stub
		return null;
	}
	


}
