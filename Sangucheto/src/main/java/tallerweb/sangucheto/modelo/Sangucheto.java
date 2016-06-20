package tallerweb.sangucheto.modelo;

import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;



public class Sangucheto {

	private static Sangucheto instance = new Sangucheto();
	private List<Ingrediente> ingredientes = new LinkedList<Ingrediente>();
	
	private Sangucheto(){}
	
	public static Sangucheto getInstance(){
		return instance;
	}
	
	/**
	 * Elimina todos los ingredientes del sanguchetto.<br>
	 */
	public void vaciar(){
		ingredientes.clear();	
	}
	
	/**
	 * Agrega un ingrediente al carrito.<br>
	 * @param ingrediente
	 */
	public void agregarIngrediente(Ingrediente ingrediente){
		this.ingredientes.add(ingrediente);
	}
	
	/**
	 * Lista todos los ingredientes que forman parte del sanguchetto.<br>
	 * @return
	 */
	public List<Ingrediente> verIngredientes(){
		List<Ingrediente> listaIngredientes = new LinkedList<Ingrediente>();
		Iterator<Ingrediente> iterador = ingredientes.iterator();
		while (iterador.hasNext()){
			Ingrediente ingrediente=iterador.next();
			if(ingrediente.getTipo().equals(TipoIngrediente.INGREDIENTE)){
				listaIngredientes.add(ingrediente);
			}
		}
		return listaIngredientes;
	}
	
	/**
     * Lista todos los condimentos que forman parte del sanguchetto.<br>
     * @return
     */
    public List<Ingrediente> verCondimentos(){
		List<Ingrediente> listaCondimentos = new LinkedList<Ingrediente>();
		Iterator<Ingrediente> iterador = ingredientes.iterator();
		while (iterador.hasNext()){
			Ingrediente ingrediente=iterador.next();
			if(ingrediente.getTipo().equals(TipoIngrediente.CONDIMENTO)){
				listaCondimentos.add(ingrediente);
			}
		}
		return listaCondimentos;
    }
	
	/**
	 * Devuelve el precio total del sanguchetto.<br>
	 * @return
	 */
	public Double getPrecio(){
		// Implementar
		return null;
	}
}
