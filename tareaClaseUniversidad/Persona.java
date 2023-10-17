package tareaClaseUniversidad;

import java.util.Random;

public class Persona 
{
	private String nombre;
	private String apellido;
	private int edad;
	private int ID;
	
	public Persona(String nombre, String apellido, int edad) 
	{
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		
		Random numeroAleatorio7 = new Random();
		int ID;
		
		ID = numeroAleatorio7.nextInt(9000000) + 1000000;
		this.ID = ID;
	}

	public Persona()
	{
		Random numeroAleatorio7 = new Random();
		int ID;
		
		ID = numeroAleatorio7.nextInt(9000000) + 1000000;
		this.ID = ID;
	}
	
	public String getNombre() 
	{
		return nombre;
	}

	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}

	public String getApellido() 
	{
		return apellido;
	}

	public void setApellido(String apellido) 
	{
		this.apellido = apellido;
	}

	public int getEdad() 
	{
		return edad;
	}

	public void setEdad(int edad) 
	{
		this.edad = edad;
	}
	
	public int getID() 
	{
		return ID;
	}

	public void mostrarInformacion()
	{
		System.out.println("El nombre de la persona es: " + getNombre() + " " + getApellido());
		System.out.println("La edad de la persona es: " + getEdad());
		System.out.println("El ID de la persona es: " + getID());
	}
}