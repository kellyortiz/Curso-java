package entidade;

public class Retangulo {

	public double altura;
	public double base;
	public int quantidade;
	
	public double area() {
		return base * altura;
	}
	
	public double perimetro() {
		return 2*(base + altura);
	}
	
	public double diagonal() {
		return Math.sqrt(altura * altura + base * base);
	}
}
