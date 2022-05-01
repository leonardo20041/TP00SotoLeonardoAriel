package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

//clase
@Component
public class Calculadora 
{
	//cambie los tipos de datos de las variables para que la raiz se pueda resolver de manera correcta
	private double num1;
	private double num2;
	
	public Calculadora()
	{
		// TODO Auto-generated constructor stub
	}
	
	public void setNum1(double num1)
	{
		this.num1 = num1;
	}
	
	public double getNum1()
	{
		return num1;
	}
	
	public void setNum2(double num2)
	{
		this.num2 = num2;
	}
	
	public double getNum2()
	{
		return num2;
	}
	
	public double sumar()
	{
		return num1 + num2;
	}
	
	public double restar()
	{
		return num1 - num2;
	}
	
	public double mult()
	{
		return num1 * num2;
	}
	
	public double div()
	{
		if ((num1 != 0) && (num2 != 0))
			return num1/num2;
		
		else
		{
			System.out.println("Error");
			return 0;
		}
	}
	
	public double raiz()
	{
		double exp = 1/num2;
		double resultadoRaiz = Math.pow(num1, exp);
		return resultadoRaiz;
	}
	
	public double potencia()
	{
		return Math.pow(num1, num2);
	}
	
//	private int num1;
//	private int num2;
	
//	public void setNum1(int num1)
//	{
//		this.num1 = num1;
//	}
	
//	public int getNum1()
//	{
//		return num1;
//	}
	
//	public void setNum2(int num2)
//	{
//		this.num2 = num2;
//	}
	
//	public int getNum2()
//	{
//		return num2;
//	}
	
//	public int sumar()
//	{
//		return num1 + num2;
//	}
	
//	public int restar()
//	{
//		return num1 - num2;
//	}
	
//	public int mult()
//	{
//		return num1 * num2;
//	}
	
//	public int div()
//	{
//		if ((num1 != 0) && (num2 != 0))
//			return num1/num2;
//		
//		else
//		{
//			System.out.println("Error");
//			return 0;
//		}
//	}
	
//	public int potencia()
//	{
//		return (int) Math.pow(num1, num2);
//	}
}
