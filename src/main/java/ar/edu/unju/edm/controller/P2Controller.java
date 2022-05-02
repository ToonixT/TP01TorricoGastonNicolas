package ar.edu.unju.edm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ar.edu.unju.edm.model.Punto2;

@Controller
public class P2Controller {
	
@GetMapping("/resolverPunto2")

	public String getPunto2Page( @RequestParam (name = "yy") int yy, Model model ) {
		boolean resultado;
		String whatis;
		Punto2 aPunto2 = new Punto2();
		aPunto2.setYear(yy);
		resultado = aPunto2.esBisiesto();
		if(resultado == true)
			whatis = "Si es bisiesto";
		else
			whatis = "No es bisiesto";

			model.addAttribute("Punto2", whatis);
			model.addAttribute("numanio", yy);

		return "punto02";
	}
}

