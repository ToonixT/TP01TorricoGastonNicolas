package ar.edu.unju.edm.controller;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


import ar.edu.unju.edm.model.Punto12;

@Controller
public class P12Controller {

@GetMapping("/resolverPunto12")
public String getPunto12Page(@RequestParam (name="altura")int altura, Model model ) {
	
	Punto12 nPunto12 = new Punto12();
	nPunto12.setAltura(altura);

	model.addAttribute("Punto12", nPunto12.calcTiempo());
			
		return "punto12";
	}
}