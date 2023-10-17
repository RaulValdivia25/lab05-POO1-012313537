package tareaClaseUniversidad;

public class Facultad 
{
	private String nombreFacultad;
	private Carrera carrerasFacultad[] = new Carrera[5];
	
	public Facultad(String nombreFacultad, Carrera[] carrerasFacultad) 
	{
		this.nombreFacultad = nombreFacultad;
		this.carrerasFacultad = carrerasFacultad;
	}
	
	Facultad()
	{}

	public String getNombreFacultad() 
	{
		return nombreFacultad;
	}

	public void setNombreFacultad(String nombreFacultad) 
	{
		this.nombreFacultad = nombreFacultad;
	}

	public Carrera[] getCarrerasFacultad() 
	{
		return carrerasFacultad;
	}

	public void setCarrerasFacultad(Carrera[] carrerasFacultad) 
	{
		this.carrerasFacultad = carrerasFacultad;
	}
	
	public void agregarCarrera (Carrera carrera)
	{
		int numeroElemento;
		int tamañoArreglo;
		
		tamañoArreglo = carrerasFacultad.length;
		numeroElemento = 0;
		
		while (numeroElemento < tamañoArreglo && carrerasFacultad[numeroElemento] != null)
		{
			numeroElemento++;
		}
		
		if (numeroElemento < tamañoArreglo)
		{
			carrerasFacultad[numeroElemento] = carrera;
		}
		
		else
		{
			System.out.println("La facultad esta llena. No se pueden agregar más cursos.");
		}
	}
	
	public void mostrarInformacion()
	{
		int tamañoArreglo;
		int numeroElemento;
		int numeroCarrera;
		
		tamañoArreglo = carrerasFacultad.length;
		
		String nombre;
		nombre = getNombreFacultad();
		
		if (nombre != null)
		{
			System.out.println("El nombre de la facultad es: " + getNombreFacultad());

			System.out.println("INFORMACION DE LAS CARRERAS DE LA FACULTAD");
			
			for (numeroElemento = 0; numeroElemento < tamañoArreglo; numeroElemento++)
			{
				numeroCarrera = numeroElemento + 1;
				
				System.out.println("La informacion de la carrera " + numeroCarrera + " es: ");
				
				if (carrerasFacultad[numeroElemento] != null)
				{
					carrerasFacultad[numeroElemento].mostrarInformacion();	
				}
				
				else
				{
					System.out.println("No se ha ingresado los datos de este curso.");
				}
			}
		}
		
		else
		{
			System.out.println("No se han ingresado los datos de esta facultad.");
		}
	}
}