package tareaClaseUniversidad;

public class Curso 
{
	private String nombreCurso;
	private Profesor profesor = new Profesor();
	private Estudiante estudiantes[] = new Estudiante[5];
	
	public Curso()
	{}
	
	public Curso(String nombreCurso, Profesor profesor, Estudiante[] estudiantes) 
	{
		this.nombreCurso = nombreCurso;
		this.profesor = profesor;
		this.estudiantes = estudiantes;
		
		estudiantes[0].setCurso(getNombreCurso());
		estudiantes[1].setCurso(getNombreCurso());
		estudiantes[2].setCurso(getNombreCurso());
		estudiantes[3].setCurso(getNombreCurso());
		estudiantes[4].setCurso(getNombreCurso());
		profesor.setCurso(getNombreCurso()	);
	}

	public String getNombreCurso() 
	{
		return nombreCurso;
	}

	public void setNombreCurso(String nombreCurso) 
	{
		this.nombreCurso = nombreCurso;
	}

	public Profesor getProfesor() 
	{
		return profesor;
	}

	public void setProfesor(Profesor profesor) 
	{
		String curso;
		
		curso = getNombreCurso();
		
		this.profesor = profesor;
		profesor.setCurso(curso);
	}

	public Estudiante[] getEstudiantes() 
	{
		return estudiantes;
	}

	public void setEstudiantes(Estudiante[] estudiantes) 
	{
		this.estudiantes = estudiantes;
		estudiantes[0].setCurso(getNombreCurso());
		estudiantes[1].setCurso(getNombreCurso());
		estudiantes[2].setCurso(getNombreCurso());
		estudiantes[3].setCurso(getNombreCurso());
		estudiantes[4].setCurso(getNombreCurso());
	}
	
	public Estudiante getEstudianteEspecifico(int numeroEstudiante) 
	{
		return estudiantes[numeroEstudiante];
	}

	public void agregarEstudiante (Estudiante estudiante)
	{
		int numeroElemento;
		int tamañoArreglo;
		
		tamañoArreglo = estudiantes.length;
		numeroElemento = 0;
		
		while (numeroElemento < tamañoArreglo && estudiantes[numeroElemento] != null)
		{
			numeroElemento++;
		}
		
		if (numeroElemento < tamañoArreglo)
		{
			estudiante = estudiantes[numeroElemento];
			estudiante.setCurso(getNombreCurso());
		}
		
		else
		{
			System.out.println("El curso esta lleno. No se pueden agregar más estudiantes.");
		}
	}
	
	public void mostrarInformacion()
	{
		int tamañoArreglo;
		int numeroElemento;
		int numeroEstudiante;
		
		tamañoArreglo = estudiantes.length;
		
		System.out.println("El nombre del curso es: " + getNombreCurso());
		System.out.println("La informacion del profesor es: ");
		
		profesor.mostrarInformacion();
		
		System.out.println("INFORMACION DE LOS ESTUDIANTES DEL CURSO");
		
		for (numeroElemento = 0; numeroElemento < tamañoArreglo; numeroElemento++)
		{
			numeroEstudiante = numeroElemento + 1;
			
			System.out.println("La informacion del estudiante " + numeroEstudiante + " es: ");
			estudiantes[numeroElemento].mostrarInformacion();
		}
	}
	
	public void agregarUniversidad(String universidad)
	{
		profesor.setUniversidad(universidad);
		estudiantes[0].setUniversidad(universidad);
		estudiantes[1].setUniversidad(universidad);
		estudiantes[2].setUniversidad(universidad);
		estudiantes[3].setUniversidad(universidad);
		estudiantes[4].setUniversidad(universidad);
	}
}