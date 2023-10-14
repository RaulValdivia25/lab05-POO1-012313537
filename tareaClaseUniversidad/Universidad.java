package tareaClaseUniversidad;

public class Universidad 
{
	private String nombreUniversidad;
	private Estudiante estudiantesUniversitarios[] = new Estudiante[25];
	private Profesor profesoresUniversitarios[] = new Profesor[5];
	private Programa programasUniversitarios[] = new Programa[5];
	
	public Universidad(String nombreUniversidad, Estudiante[] estudiantesUniversitarios, Profesor[] profesoresUniversitarios, Programa[] programasUniversitarios) 
	{
		this.estudiantesUniversitarios = estudiantesUniversitarios;
		this.profesoresUniversitarios = profesoresUniversitarios;
		this.programasUniversitarios = programasUniversitarios;
		this.nombreUniversidad = nombreUniversidad;
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

	public Estudiante[] getEstudiantesUniversitarios() 
	{
		return estudiantesUniversitarios;
	}

	public void setEstudiantesUniversitarios(Estudiante[] estudiantesUniversitarios) 
	{
		this.estudiantesUniversitarios = estudiantesUniversitarios;
	}

	public Profesor[] getProfesoresUniversitarios() 
	{
		return profesoresUniversitarios;
	}

	public void setProfesoresUniversitarios(Profesor[] profesoresUniversitarios) 
	{
		this.profesoresUniversitarios = profesoresUniversitarios;
	}

	public Programa[] getProgramasUniversitarios() 
	{
		return programasUniversitarios;
	}

	public void setProgramasUniversitarios(Programa[] programasUniversitarios) 
	{
		this.programasUniversitarios = programasUniversitarios;
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
			programa = programasUniversitarios[numeroElemento];
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
		
		tamañoArreglo = profesoresUniversitarios.length;
		numeroElemento = 0;
		
		while (numeroElemento < tamañoArreglo && profesoresUniversitarios[numeroElemento] != null)
		{
			numeroElemento++;
		}
		
		if (numeroElemento < tamañoArreglo)
		{
			profesor = profesoresUniversitarios[numeroElemento];
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
		
		tamañoArreglo = estudiantesUniversitarios.length;
		numeroElemento = 0;
		
		while (numeroElemento < tamañoArreglo && estudiantesUniversitarios[numeroElemento] != null)
		{
			numeroElemento++;
		}
		
		if (numeroElemento < tamañoArreglo)
		{
			estudiante = estudiantesUniversitarios[numeroElemento];
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
			System.out.println("La informacion del programa " + numeroCurso + " es: ");
			programasUniversitarios[numeroElemento].mostrarInformacion();
		}
	}
	
	public void mostrarInfomacionEstudiantes()
	{
		int tamañoArreglo;
		int numeroElemento;
		int numeroEstudiante;
		
		tamañoArreglo = estudiantesUniversitarios.length;
		
		for (numeroElemento = 0; numeroElemento < tamañoArreglo; numeroElemento++)
		{
			numeroEstudiante = numeroElemento + 1;
			
			System.out.println("INFORMACION SOBRE LOS ESTUDIANTES DE LA UNIVERSIDAD");
			System.out.println("La informacion del estudiante " + numeroEstudiante + " es: ");
			estudiantesUniversitarios[numeroElemento].mostrarInformacion();
		}
	}
	
	public void mostrarInfomacionProfesores()
	{
		int tamañoArreglo;
		int numeroElemento;
		int numeroProfesor;
		
		tamañoArreglo = profesoresUniversitarios.length;
		
		for (numeroElemento = 0; numeroElemento < tamañoArreglo; numeroElemento++)
		{
			numeroProfesor = numeroElemento + 1;
			
			System.out.println("INFORMACION SOBRE LOS PROFESORES DE LA UNIVERSIDAD");
			System.out.println("La informacion del profesor " + numeroProfesor + " es: ");
			profesoresUniversitarios[numeroElemento].mostrarInformacion();
		}
	}
}