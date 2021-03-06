import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double A, B, C, valorpi = 3.14159;
		double areatri, areacirc, areatrap, areaquad, arearet;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		areatri = A * C / 2;
		areacirc = valorpi * Math.pow(C, 2);
		areatrap =  C * (A + B) / 2;
		areaquad = Math.pow(B, 2);
		arearet = A * B;
		
		System.out.printf("Triangulo: %.3f%n", areatri);
		System.out.printf("Circulo: %.3f%n", areacirc);
		System.out.printf("Trapezio: %.3f%n", areatrap);
		System.out.printf("Quadrado: %.3f%n", areaquad);
		System.out.printf("Retangulo: %.3f%n", arearet);		
		
		sc.close();
	}
}
