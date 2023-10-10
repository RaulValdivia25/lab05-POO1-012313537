package tareaClaseUniversidad;

public abstract class Persona 
{
	private String nombre;
	private String apellido;
	private int edad;
	
	public Persona(String nombre, String apellido, int edad) 
	{
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	public Persona()
	{}
	
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
	
	public void mostrarInformacion()
	{
		System.out.println("El nombre de la persona es: " + getNombre());
		System.out.println("El apellido de la persona es: " + getApellido());
		System.out.println("La edad de la persona es: " + getEdad());
	}
}