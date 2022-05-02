
package ar.edu.unju.edm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


import ar.edu.unju.edm.model.Punto3;

@Controller
public class P3Controller {

	@GetMapping("/resolverPunto3")
	public String getPunto3Page( @RequestParam (name = "num1") int num1,@RequestParam (name = "num2") int num2,@RequestParam (name = "num3") int num3,@RequestParam (name = "num4") int num4,@RequestParam (name = "num5") int num5, Model model ) {
		
		Punto3 nPunto3 = new Punto3();
		String esPar="SI es par", noPar="NO es par";
		nPunto3.setNum(num1);
		if(nPunto3.esPar() == true)
			model.addAttribute("Punto3", esPar);
		else
			model.addAttribute("Punto3", noPar);
		
		//control para el num2 
		
		nPunto3.setNum(num2);
		if(nPunto3.esPar() == true)
			model.addAttribute("Punto3dos", esPar);
		else
			model.addAttribute("Punto3dos", noPar);
		
		//agregar 3,4,5 de la misma manera	
		
		nPunto3.setNum(num3);
		if(nPunto3.esPar() == true)
			model.addAttribute("Punto3tres", esPar);
		else
			model.addAttribute("Punto3tres", noPar);
		
		nPunto3.setNum(num4);
		if(nPunto3.esPar() == true)
			model.addAttribute("Punto3cuatro", esPar);
		else
			model.addAttribute("Punto3cuatro", noPar);
		
		nPunto3.setNum(num5);
		if(nPunto3.esPar() == true)
			model.addAttribute("Punto3cinco", esPar);
		else
			model.addAttribute("Punto3cinco", noPar);
		
		
		return "punto03";
		
		
	}
}