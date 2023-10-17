package tareaClaseUniversidad;

public class Universidad 
{
	private String nombreUniversidad;
	private Programa programasUniversitarios[] = new Programa[5];
	private Facultad facultadesUniversitarias[] = new Facultad[5];
	private Persona personasUniversitarias[] = new Persona[30];
	
	
	public Universidad(String nombreUniversidad, Programa[] programasUniversitarios,
			Facultad[] facultadesUniversitarias, Persona[] personasUniversitarias) 
	{
		this.nombreUniversidad = nombreUniversidad;
		this.programasUniversitarios = programasUniversitarios;
		this.facultadesUniversitarias = facultadesUniversitarias;
		this.personasUniversitarias = personasUniversitarias;
	}

	public Universidad()
	{}
	
	public String getNombreUniversidad() 
	{
		return nombreUniversidad;
	}

	public void setNombreUniversidad(String nombreUniversidad) 
	{
		this.nombreUniversidad = nombreUniversidad;
	}

	public Programa[] getProgramasUniversitarios() 
	{
		return programasUniversitarios;
	}

	public void setProgramasUniversitarios(Programa[] programasUniversitarios) 
	{
		this.programasUniversitarios = programasUniversitarios;
	}
	
	public Facultad[] getFacultadesUniversitarias() 
	{
		return facultadesUniversitarias;
	}

	public void setFacultadesUniversitarias(Facultad[] facultadesUniversitarias) 
	{
		this.facultadesUniversitarias = facultadesUniversitarias;
	}

	public Persona[] getPersonasUniversitarias() 
	{
		return personasUniversitarias;
	}

	public void setPersonasUniversitarias(Persona[] personasUniversitarias) 
	{
		this.personasUniversitarias = personasUniversitarias;
	}

	public void agregarPrograma (Programa programa)
	{
		int numeroElemento;
		int tamañoArreglo;
		
		tamañoArreglo = programasUniversitarios.length;
		numeroElemento = 0;
		
		while (numeroElemento < tamañoArreglo && programasUniversitarios[numeroElemento] != null)
		{
			numeroElemento++;
		}
		
		if (numeroElemento < tamañoArreglo)
		{
			programasUniversitarios[numeroElemento] = programa;
		}
		
		else
		{
			System.out.println("La universidad esta llena. No se pueden agregar más programas.");
		}
	}
	
	public void agregarFacultad (Facultad facultad)
	{
		int numeroElemento;
		int tamañoArreglo;
		
		tamañoArreglo = facultadesUniversitarias.length;
		numeroElemento = 0;
		
		while (numeroElemento < tamañoArreglo && facultadesUniversitarias[numeroElemento] != null)
		{
			numeroElemento++;
		}
		
		if (numeroElemento < tamañoArreglo)
		{
			facultadesUniversitarias[numeroElemento] = facultad;
		}
		
		else
		{
			System.out.println("La universidad esta llena. No se pueden agregar más programas.");
		}
	}
	
	public void agregarProfesor (Profesor profesor)
	{
		int numeroElemento;
		int tamañoArreglo;
		
		tamañoArreglo = personasUniversitarias.length;
		numeroElemento = 0;
		
		while (numeroElemento < tamañoArreglo && personasUniversitarias[numeroElemento] != null)
		{
			numeroElemento++;
		}
		
		if (numeroElemento < tamañoArreglo)
		{
			personasUniversitarias[numeroElemento] = profesor;
		}
		
		else
		{
			System.out.println("La universidad esta llena. No se pueden agregar más profesores.");
		}
	}
	
	public void agregarEstudiante (Estudiante estudiante)
	{
		int numeroElemento;
		int tamañoArreglo;
		
		tamañoArreglo = personasUniversitarias.length;
		numeroElemento = 0;
		
		while (numeroElemento < tamañoArreglo && personasUniversitarias[numeroElemento] != null)
		{
			numeroElemento++;
		}
		
		if (numeroElemento < tamañoArreglo)
		{
			personasUniversitarias[numeroElemento] = estudiante;
		}
		
		else
		{
			System.out.println("La universidad esta llena. No se pueden agregar más estudiantes.");
		}
	}
	
	public void mostrarInfomacionProgramas()
	{
		int tamañoArreglo;
		int numeroElemento;
		int numeroCurso;
		
		tamañoArreglo = programasUniversitarios.length;
		
		for (numeroElemento = 0; numeroElemento < tamañoArreglo; numeroElemento++)
		{
			numeroCurso = numeroElemento + 1;
			
			System.out.println("INFORMACION SOBRE LOS PROGRAMAS DE LA UNIVERSIDAD");
			
			if (programasUniversitarios[numeroElemento] != null)
			{
				System.out.println("La informacion del programa " + numeroCurso + " es: ");
				programasUniversitarios[numeroElemento].mostrarInformacion();
			}
			
			else
			{
				System.out.println("No se agregaron los datos de este programa.");
			}
		}
	}
	
	public void mostrarInfomacionFacultades()
	{
		int tamañoArreglo;
		int numeroElemento;
		int numeroFacultad;
		
		tamañoArreglo = programasUniversitarios.length;
		
		for (numeroElemento = 0; numeroElemento < tamañoArreglo; numeroElemento++)
		{
			numeroFacultad = numeroElemento + 1;
			
			System.out.println("INFORMACION SOBRE LOS PROGRAMAS DE LA UNIVERSIDAD");
			
			if (facultadesUniversitarias[numeroElemento] != null)
			{
				System.out.println("La informacion del programa " + numeroFacultad + " es: ");
				facultadesUniversitarias[numeroElemento].mostrarInformacion();
			}
			
			else
			{
				System.out.println("No se agregaron los datos de esta facultad.");
			}
		}
	}
	
	public void mostrarInfomacionPersonas()
	{
		int tamañoArreglo;
		int numeroElemento;
		int numeroPersona;
		
		tamañoArreglo = personasUniversitarias.length;
		
		for (numeroElemento = 0; numeroElemento < tamañoArreglo; numeroElemento++)
		{
			numeroPersona = numeroElemento + 1;
			
			System.out.println("INFORMACION SOBRE LAS PERSONAS DE LA UNIVERSIDAD");
			System.out.println("La informacion de la persona " + numeroPersona + " es: ");
			
			if (personasUniversitarias[numeroElemento] instanceof Persona)
			{
				personasUniversitarias[numeroElemento].mostrarInformacion();
			}
			
			else if (personasUniversitarias[numeroElemento] instanceof Profesor)
			{
				System.out.println("La persona " + numeroPersona + " es un profesor.");
				personasUniversitarias[numeroElemento].mostrarInformacion();
			}
			
			else if (personasUniversitarias[numeroElemento] instanceof Estudiante)
			{
				System.out.println("La persona " + numeroPersona + " es un estudiante.");
				personasUniversitarias[numeroElemento].mostrarInformacion();
			}
			
			else if (personasUniversitarias[numeroElemento] == null)
			{
				System.out.println("No se han ingresado de esta persona.");
			}
		}
	}
	
}