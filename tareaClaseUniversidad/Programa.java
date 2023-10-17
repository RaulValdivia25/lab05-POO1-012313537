package tareaClaseUniversidad;

public class Programa 
{
	Curso cursosDelPrograma[] = new Curso[5];
	String nombrePrograma;

	public Programa(Curso[] cursosDelPrograma, String nombrePrograma) 
	{
		this.cursosDelPrograma = cursosDelPrograma;
		this.nombrePrograma = nombrePrograma;
	}

	public Programa()
	{}

	public String getNombrePrograma() 
	{
		return nombrePrograma;
	}

	public void setNombrePrograma(String nombrePrograma) 
	{
		this.nombrePrograma = nombrePrograma;
	}

	public Curso[] getCursosDelPrograma() 
	{
		return cursosDelPrograma;
	}

	public void setCursosDelPrograma(Curso[] cursosDelPrograma) 
	{
		this.cursosDelPrograma = cursosDelPrograma;
	}
	
	public void agregarCurso (Curso curso)
	{
		int numeroElemento;
		int tamañoArreglo;
		
		tamañoArreglo = cursosDelPrograma.length;
		numeroElemento = 0;
		
		while (numeroElemento < tamañoArreglo && cursosDelPrograma[numeroElemento] != null)
		{
			numeroElemento++;
		}
		
		if (numeroElemento < tamañoArreglo)
		{
			cursosDelPrograma[numeroElemento] = curso;
		}
		
		else
		{
			System.out.println("El programa esta lleno. No se pueden agregar más cursos.");
		}
	}
	
	public void mostrarInformacion()
	{
		int tamañoArreglo;
		int numeroElemento;
		int numeroCurso;
		
		tamañoArreglo = cursosDelPrograma.length;
		
		String nombre;
		nombre = getNombrePrograma();
		
		if (nombre != null)
		{
			System.out.println("El nombre del programa es: " + getNombrePrograma());

			System.out.println("INFORMACION DE LOS CURSOS DEL PROGRAMA");
			
			for (numeroElemento = 0; numeroElemento < tamañoArreglo; numeroElemento++)
			{
				numeroCurso = numeroElemento + 1;
				
				System.out.println("La informacion del curso " + numeroCurso + " es: ");
				
				if (cursosDelPrograma[numeroElemento] != null)
				{
					cursosDelPrograma[numeroElemento].mostrarInformacion();	
				}
				
				else
				{
					System.out.println("No se ha ingresado los datos de este curso.");
				}
			}
		}
		
		else
		{
			System.out.println("No se ha ingresado los datos de este programa.");
		}
	}
}
