package org.lesson.java.security;

public class PasswordGenerator {

	public static void main(String[] args) {
		
		
		String name = "Michel";
		String surname = "Ramirez";
		String birthDate = "20/12/1991";
		String color = "Red";
		
		int year = birthDate.lastIndexOf('/') + 1;
		String yearBirth = birthDate.substring(year);
		
		
		System.out.println("La tua password super sicura è: " + name + '-' + surname + '-' + yearBirth + '-' + color);
		
//		print: Michel-Ramirez-1991-Red
	}

}
