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
	
	//@RequestMapping(value="/confirmacion", method = RequestMethod.POST)
	//public ModelAndView agregarIngredientes(@ModelAttribute("ingredientes") Ingrediente ingredientes){
	//		ModelMap model= new ModelMap();
	//		model.addAttribute("nombre",persona.getNombre());
	//		model.addAttribute("apellido", persona.getApellido());
	//		model.addAttribute("mail", persona.getEmail());	
	//		return new ModelAndView("confirmacion",model);
	//}
	
	
	

}
