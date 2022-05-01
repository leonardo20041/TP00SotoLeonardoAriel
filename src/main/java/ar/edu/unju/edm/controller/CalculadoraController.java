package ar.edu.unju.edm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ar.edu.unju.edm.model.Calculadora;

@Controller
public class CalculadoraController 
{
	@GetMapping("/menu")
	//cuando se solicita /menu tiene que devolver el index
	public String mostrarMenuCalculadora()
	{
		return "index";
	}
	
	@GetMapping("/sumar")
	//1) recibo los parametros que vienen de la vista
	public String getSumaPage(@RequestParam (name = "num1") int num1 , @RequestParam (name = "num2") int num2, Model model)
																							//model va a alojar nuestro resultado
	{
//		int resultadoS = 0;
		double resultadoS = 0;
		Calculadora nuevaCalculadora = new Calculadora();
		nuevaCalculadora.setNum1(num1);
		nuevaCalculadora.setNum2(num2);
		resultadoS = nuevaCalculadora.sumar();
		//2) los proceso y devuelve un resultadoS
		model.addAttribute("resultadoS", resultadoS);
		//3) desplegando la pagina que se llama resultado
		return "resultado";
	}
	
	@GetMapping("/restar")
	public String getRestaPage(@RequestParam (name = "num1") int num1 , @RequestParam (name = "num2") int num2, Model model)
	{
//		int resultadoR = 0;
		double resultadoR = 0;
		Calculadora nuevaCalculadora = new Calculadora();
		nuevaCalculadora.setNum1(num1);
		nuevaCalculadora.setNum2(num2);
		resultadoR = nuevaCalculadora.restar();
		model.addAttribute("resultadoR", resultadoR);
		return "resultadoResta";
	}
	
	@GetMapping("/mult")
	public String getMultiplicacionPage(@RequestParam (name = "num1") int num1 , @RequestParam (name = "num2") int num2, Model model)
	{
//		int resultadoM = 0;
		double resultadoM = 0;
		Calculadora nuevaCalculadora = new Calculadora();
		nuevaCalculadora.setNum1(num1);
		nuevaCalculadora.setNum2(num2);
		resultadoM = nuevaCalculadora.mult();
		model.addAttribute("resultadoM", resultadoM);
		return "resultadoMultiplicacion";
	}
	
	@GetMapping("/div")
	public String getDivisionPage(@RequestParam (name = "num1") int num1 , @RequestParam (name = "num2") int num2, Model model)
	{
//		int resultadoD = 0;
		double resultadoD = 0;
		Calculadora nuevaCalculadora = new Calculadora();
		nuevaCalculadora.setNum1(num1);
		nuevaCalculadora.setNum2(num2);
		resultadoD = nuevaCalculadora.div();
		model.addAttribute("resultadoD", resultadoD);
		return "resultadoDivision";
	}
	
	@GetMapping("/raiz")
	public String getRaizPage(@RequestParam (name = "num1") int num1 , @RequestParam (name = "num2") int num2, Model model)
	{
		double resultadoRa = 0;
		Calculadora nuevaCalculadora = new Calculadora();
		nuevaCalculadora.setNum1(num1);
		nuevaCalculadora.setNum2(num2);
		resultadoRa = nuevaCalculadora.raiz();
		model.addAttribute("resultadoRa", resultadoRa);
		return "resultadoRaiz";
	}
	
	@GetMapping("/potencia")
	public String getPotenciaPage(@RequestParam (name = "num1") int num1 , @RequestParam (name = "num2") int num2, Model model)
	{
//		int resultadoP = 0;
		double resultadoP = 0;
		Calculadora nuevaCalculadora = new Calculadora();
		nuevaCalculadora.setNum1(num1);
		nuevaCalculadora.setNum2(num2);
		resultadoP = nuevaCalculadora.potencia();
		model.addAttribute("resultadoP", resultadoP);
		return "resultadoPotencia";
	}
}
