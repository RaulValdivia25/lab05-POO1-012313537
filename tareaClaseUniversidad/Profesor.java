package tareaClaseUniversidad;

import java.util.Scanner;

public class Profesor extends Persona
{
	private double salario;
	private String curso;
	private String universidad;
	
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
	
	public String getCurso() 
	{
		return curso;
	}

	public void setCurso(String curso) 
	{
		this.curso = curso;
	}

	public String getUniversidad() 
	{
		return universidad;
	}

	public void setUniversidad(String universidad) 
	{
		this.universidad = universidad;
	}

	@Override
	public void mostrarInformacion()
	{
		System.out.println("El nombre del profesor es: " + getNombre());
		System.out.println("El apellido del profesor es: " + getApellido());
		System.out.println("La edad del profesor es: " + getEdad());
		
		if (curso != null)
		{
			System.out.println("El profesor pertenece al curso de: " + getCurso());
		}
		
		else
		{
			System.out.println("El profesor no pertenece a ningun curso.");
		}
		
		if (universidad != null)
		{
			System.out.println("El profesor pertenece a la universidad: " + getUniversidad());
		}
		
		else
		{
			System.out.println("El profesor no pertenece a ninguna universidad.");
		}
		
		System.out.println("El salario del profesor es: " + getSalario());
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