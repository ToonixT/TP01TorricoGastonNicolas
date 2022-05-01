package ar.edu.unju.edm.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


import ar.edu.unju.edm.model.Punto1;
@Controller

	
public class P1Controller {

@GetMapping({"/menu"})
public String mostrarMenu() {
	return "menu";
}
@Autowired
Punto1 apunto1;

@GetMapping("/resolverPunto1")
public String getPunto1Page(@RequestParam (name= "num") int num, Model model) {

	apunto1.setNumero(num);
	model.addAttribute("Puntox1", apunto1.ResFact());
	model.addAttribute("numero",num);
	return "Punto01";
}
}

