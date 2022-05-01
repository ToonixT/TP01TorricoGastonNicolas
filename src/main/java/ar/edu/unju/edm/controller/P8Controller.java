
package ar.edu.unju.edm.controller;
import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import ar.edu.unju.edm.model.Punto8;

@Controller
public class P8Controller {

@GetMapping("/resolverPunto8")
public String getPunto8Page( Model model ) {
	
		Punto8 nPunto8 = new Punto8();
		int[] narray= nPunto8.seqMultiples4();

			model.addAttribute("Punto8", Arrays.toString(narray));
			
		return "punto08";
	}
}