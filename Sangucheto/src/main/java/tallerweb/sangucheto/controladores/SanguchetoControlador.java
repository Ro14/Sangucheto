package tallerweb.sangucheto.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import tallerweb.sangucheto.modelo.Ingrediente;
import tallerweb.sangucheto.modelo.Sangucheto;

@Controller
@RequestMapping

public class SanguchetoControlador {
	
	@RequestMapping("crearSangucheto")
	public ModelAndView crearSangucheto(){
		ModelMap model=new ModelMap();
		Sangucheto miSangucheto = Sangucheto.getInstance();
		model.put("miSangucheto", miSangucheto);
		return new ModelAndView("crearSangucheto",model);
		
	}
	
	
	@RequestMapping("agregarIngrediente")
	public ModelAndView agregarIngrediente(){
		ModelMap model=new ModelMap();
		Ingrediente miIngrediente = new Ingrediente();
		model.put("miIngrediente", miIngrediente);
		return new ModelAndView("agregarIngrediente",model);
		
	}
	
	@RequestMapping(value="confirmacionIngrediente", method = RequestMethod.POST)
	public ModelAndView agregarIngrediente(@ModelAttribute("ingrediente") Ingrediente ingrediente){
			ModelMap model= new ModelMap();
			model.addAttribute("nombre",ingrediente.getNombre());
			model.addAttribute("precio",ingrediente.getPrecio());
			model.addAttribute("tipo",ingrediente.getTipo());
			model.addAttribute("ingrediente")
			return new ModelAndView("confirmacionIngrediente",model);
	}
	
	
	

}
