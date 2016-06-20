package tallerweb.sanguchetto.modelo;

import org.junit.Before;
import org.junit.Test;

import tallerweb.sangucheto.modelo.Ingrediente;
import tallerweb.sangucheto.modelo.Sangucheto;

public class SanguchettoTest {
	
	@Before
	public void init(){
		Sangucheto miSangucheto = Sangucheto.getInstance();
	}
	

    @Test
    public void testVaciar() {
    	Sangucheto miSangucheto = Sangucheto.getInstance();
    	Ingrediente jamon = new Ingrediente();
    	Ingrediente queso = new Ingrediente();
		miSangucheto.agregarIngrediente(jamon);
		miSangucheto.agregarIngrediente(queso);
		miSangucheto.vaciar();   
		
    }

    @Test
    public void testAgregarIngrediente() {
        // Implementar
    }

    @Test
    public void testVerIngredientes() {
        // Implementar
    }

    @Test
    public void testVerCondimentos() {
        // Implementar
    }

    @Test
    public void testGetPrecio() {
        // Implementar
    }
}
