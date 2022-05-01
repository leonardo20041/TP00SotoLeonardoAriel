package ar.edu.unju.edm;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ar.edu.unju.edm.model.Calculadora;

@SpringBootApplication
public class Tp00SotoLeonardoArielApplication {

	public static void main(String[] args) {
		SpringApplication.run(Tp00SotoLeonardoArielApplication.class, args);
		
		Calculadora unaCalculadora = new Calculadora();
		unaCalculadora.setNum1(9);
		unaCalculadora.setNum2(2);
		System.out.println("Ingresar un valor: ");
		System.out.println("La suma es: "+unaCalculadora.sumar());
		System.out.println("La resta es: "+unaCalculadora.restar());
		System.out.println("La multiplicacion es: "+unaCalculadora.mult());
		System.out.println("La division es: "+unaCalculadora.div());
		System.out.println("La raiz es: "+unaCalculadora.raiz());
		System.out.println("La potencia es: "+unaCalculadora.potencia());
		
	}

}
