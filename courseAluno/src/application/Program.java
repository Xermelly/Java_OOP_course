package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		
		System.out.print("Name: ");
		student.name = sc.nextLine();
		
		System.out.print("Nota 1: ");
		student.notaA = sc.nextDouble();
		
		System.out.print("Nota 2: ");
		student.notaB = sc.nextDouble();
		
		System.out.print("Nota 3: ");
		student.notaC = sc.nextDouble();
		
		System.out.println();
		System.out.printf("FINAL GRADE : %.2f%n", student.media());
		
		if(student.media() < 60) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", student.missingPoints());
		} else {
			System.out.println("PASS");
		}
		
		sc.close();

	}

}
