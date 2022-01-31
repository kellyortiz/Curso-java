package exercicios01;

import java.util.Locale;
import java.util.Scanner;

public class Atividade06 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A,B,C, areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;
		double pi = 3.14159;
		
	    A = sc.nextDouble();
	    B = sc.nextDouble();
	    C = sc.nextDouble();
	    
	    areaTriangulo = (A * C)/2;
	    areaCirculo = pi * C * C;
	    areaTrapezio = ((A+B)*C)/2;
	    areaQuadrado = 4 * B;
	    areaRetangulo = (A*2) + (B*2);
	    
	    System.out.printf("Triangulo: " + "%.3f%n", areaTriangulo);
	    System.out.printf("Circulo: " + "%.3f%n",areaCirculo);
	    System.out.printf("Trapezio: " + "%.3f%n",areaTrapezio);
	    System.out.printf("Quadrado: " + "%.3f%n",areaQuadrado);
	    System.out.printf("Retangulo: " + "%.3f%n",areaRetangulo);
	    
	    sc.close();
	}

}
