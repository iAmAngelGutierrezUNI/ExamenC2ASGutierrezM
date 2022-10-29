package bll;

import java.util.List;
import java.util.Scanner;

import dol.Estudiante;

public class Aplicacion {
	private Scanner scan = new Scanner(System.in);
	private Estudiante alumno;
	private List<Estudiante>listaEstudiantes;
	
	public void menu() {
		System.out.println("Bienvenido");
		System.out.println("1. Para agregar un estudiante.");
		System.out.println("2. Ver estudiantes.");
		System.out.println("3. para guardar un estudiante.");
		System.out.println("4. Salir.");
	}
	public void run () {
		menu();
	String opc;
	opc = scan.nextLine();
	switch (opc) {
	case "1": 
		AgregarEstudiante();
		
		break;
	case "2": 
		System.out.println("aqui vemos estudiantes");
		run();
		break;
	case "3":  
		System.out.println("Aqui guardamos");
		run();
		break;
	case "4": 
		System.exit(0);
		break;
		default:
			System.out.println("Opcion invalida");
			run();
	}
	}
	public void AgregarEstudiante() {
		Estudiante est =new Estudiante();
		System.out.println("Dijite primer nombre");
		est.setPrimerNombre(scan.next());
		System.out.println("Dijite segundo nombre");
		est.setSegundoNombre(scan.next());
		System.out.println("Dijite Primer apellido");
		est.setPrimerApellido(scan.next());
		System.out.println("Dijite segundo apellido");
		est.setSegundoApellido(scan.next());;
		run();
	}

}
