package tareaClaseUniversidad;

import java.util.Scanner;

public class Profesor extends Persona
{
	private Double salario;
	
	public Profesor(String nombre, String apellido, int edad, double salario) 
	{
		super(nombre, apellido, edad);
		this.salario = salario;
	}
	
	public Profesor()
	{}
	
	public double getSalario() 
	{
		return salario;
	}

	public void setSalario(double salario) 
	{
		this.salario = salario;
	}

	@Override
	public void mostrarInformacion()
	{
		if (salario != null)
		{
			System.out.println("El nombre del profesor es: " + getNombre() + " " + getApellido());
			System.out.println("La edad del profesor es: " + getEdad());
			System.out.println("El salario del profesor es: " + getSalario());
			System.out.println("El ID del profesor es: " + getID());
		}
		
		else
		{
			System.out.println("No se han igresado los datos de este profesor.");
		}
	}
	
	public void evaluarEstudiante(Estudiante estudiante)
	{
		Scanner entrada1 = new Scanner(System.in);
		Scanner entrada2 = new Scanner(System.in);
		Double notaIngresada;
		int numeroNotaIngresada;
		
		System.out.println("Ingrese el numero de la nota (1, 2, 3...): ");
		
		numeroNotaIngresada = entrada1.nextInt();
		
		System.out.println("Ingrese la nota del estudiante: ");
		
		notaIngresada = entrada2.nextDouble();
		
		estudiante.setNotaEspecifica(notaIngresada, numeroNotaIngresada);
		
		entrada1.close();
		entrada2.close();
	}
}