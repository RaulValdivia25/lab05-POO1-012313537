package tareaClaseUniversidad;

public class Estudiante extends Persona 
{
	private Double notas[] = new Double[5];
	
	public Estudiante(String nombre, String apellido, int edad) 
	{
		super(nombre, apellido, edad);
	}
	
	public Estudiante()
	{}
	
	public Double[] getNotas() 
	{
		return notas;
	}

	public void setNotas(Double[] notas) 
	{
		this.notas = notas;
	}

	public Double getNotaEspecifica(int numeroNota) 
	{
		return notas[numeroNota];
	}

	public void setNotaEspecifica(Double nota, int numeroNota) 
	{
		this.notas[numeroNota] = nota;
	}

	@Override
	public void mostrarInformacion()
	{
		int tamañoArreglo;
		int numeroElemento;
		int numeroNota;
		
		tamañoArreglo = notas.length;
		
		String nombre;
		nombre = getNombre();
		
		if (nombre != null)
		{
			System.out.println("El nombre del estudiante es: " + getNombre() + " " + getApellido());
			System.out.println("La edad del estudiante es: " + getEdad());
			
			System.out.println("El ID del profesor es: " + getID());
			
			System.out.println("Las notas del estudiantes son: ");
			
			for (numeroElemento = 0; numeroElemento < tamañoArreglo; numeroElemento++)
			{
				numeroNota = numeroElemento + 1;
				
				if (notas[numeroElemento] != null)
				{
					System.out.println("La nota " + numeroNota + " es: " + notas[numeroElemento]);
				}
				
				else
				{
					System.out.println("La nota " + numeroNota + " es: No se ha ingresado un valor.");
				}
			}	
		}
		
		else
		{
			System.out.println("No se han ingresado los datos de este estudiante.");
		}
	}
}