package tareaClaseUniversidad;

public class Carrera 
{
	private String nombreCarrera;
	private Curso cursosCarrera[] = new Curso[5];
	
	
	public Carrera(String nombreCarrera, Curso[] cursosCarrera) 
	{
		this.nombreCarrera = nombreCarrera;
		this.cursosCarrera = cursosCarrera;
	}

	public Carrera()
	{}
	
	public String getNombreCarrera() 
	{
		return nombreCarrera;
	}
	
	public void setNombreCarrera(String nombreCarrera) 
	{
		this.nombreCarrera = nombreCarrera;
	}
	
	public Curso[] getCursosCarrera() 
	{
		return cursosCarrera;
	}
	
	public void setCursosCarrera(Curso[] cursosCarrera) 
	{
		this.cursosCarrera = cursosCarrera;
	}
	
	public void agregarCurso (Curso curso)
	{
		int numeroElemento;
		int tamañoArreglo;
		
		tamañoArreglo = cursosCarrera.length;
		numeroElemento = 0;
		
		while (numeroElemento < tamañoArreglo && cursosCarrera[numeroElemento] != null)
		{
			numeroElemento++;
		}
		
		if (numeroElemento < tamañoArreglo)
		{
			cursosCarrera[numeroElemento] = curso;
		}
		
		else
		{
			System.out.println("La carrera esta lleno. No se pueden agregar más cursos.");
		}
	}
	
	public void mostrarInformacion()
	{
		int tamañoArreglo;
		int numeroElemento;
		int numeroCurso;
		
		tamañoArreglo = cursosCarrera.length;
		
		String nombre;
		nombre = getNombreCarrera();
		
		if (nombre != null)
		{
			System.out.println("El nombre de la carrera es: " + getNombreCarrera());

			System.out.println("INFORMACION DE LOS CURSOS DE LA CARRERA");
			
			for (numeroElemento = 0; numeroElemento < tamañoArreglo; numeroElemento++)
			{
				numeroCurso = numeroElemento + 1;
				
				System.out.println("La informacion del curso " + numeroCurso + " es: ");
				
				if (cursosCarrera[numeroElemento] != null)
				{
					cursosCarrera[numeroElemento].mostrarInformacion();	
				}
				
				else
				{
					System.out.println("No se ha ingresado los datos de este curso.");
				}
			}
		}
		
		else
		{
			System.out.println("No se han ingresado los datos de esta carrera.");
		}
	}
}