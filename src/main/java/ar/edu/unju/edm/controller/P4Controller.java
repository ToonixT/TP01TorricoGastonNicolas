
package ar.edu.unju.edm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


import ar.edu.unju.edm.model.Punto4;

@Controller
public class P4Controller {

@GetMapping("/resolverPunto4")
public String getPunto4Page( @RequestParam (name = "num") int num, Model model ) {
		String whatis;
		Punto4 nPunto4 = new Punto4();
		nPunto4.setNum(num);
	if(nPunto4.esMes() == true)
			whatis = "Si es un mes";
	else
			whatis = "No es un mes";

			model.addAttribute("Punto4", whatis);
			
		return "punto04";
	}
}