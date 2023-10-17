package tareaClaseUniversidad;

import java.util.Random;

public class Curso 
{
	private String nombreCurso;
	private String IDCurso;
	private Profesor profesor = new Profesor();
	private Estudiante estudiantes[] = new Estudiante[5];
	
	public Curso()
	{
		Random numeroRandom1 = new Random();
		Random numeroRandom2 = new Random();
		
		String letrasRandomID = "";
		int numeroRandomID;
		int posicionRandom;
		String letraRandom = "";
		String ID = "";
		
		for(int hola = 0; hola < 2; hola++)
		{
			posicionRandom = numeroRandom1.nextInt(27) + 1;
			
			switch (posicionRandom)
			{
				case 1:
				{
					letraRandom = "A";
					break;
				}
			
				case 2:
				{
					letraRandom = "B";
					break;
				}
				
				case 3:
				{
					letraRandom = "C";
					break;
				}
				
				case 4:
				{
					letraRandom = "D";
					break;
				}
				
				case 5:
				{
					letraRandom = "E";
					break;
				}
				
				case 6:
				{
					letraRandom = "F";
					break;
				}
				
				case 7:
				{
					letraRandom = "G";
					break;
				}
				
				case 8:
				{
					letraRandom = "H";
					break;
				}
				
				case 9:
				{
					letraRandom = "I";
					break;
				}
				
				case 10:
				{
					letraRandom = "J";
					break;
				}
				
				case 11:
				{
					letraRandom = "K";
					break;
				}
				
				case 12:
				{
					letraRandom = "L";
					break;
				}
				
				case 13:
				{
					letraRandom = "M";
					break;
				}
				
				case 14:
				{
					letraRandom = "N";	
					break;
				}
				
				case 15:
				{
					letraRandom = "Ñ";
					break;
				}
				
				case 16:
				{
					letraRandom = "O";
					break;
				}
				
				case 17:
				{
					letraRandom = "P";	
					break;
				}
				
				case 18:
				{
					letraRandom = "Q";
					break;
				}
				
				case 19:
				{
					letraRandom = "R";
					break;
				}
				
				case 20:
				{
					letraRandom = "S";
					break;
				}
				
				case 21:
				{
					letraRandom = "T";
					break;
				}
				
				case 22:
				{
					letraRandom = "U";
					break;
				}
				
				case 23:
				{
					letraRandom = "V";
					break;
				}
				
				case 24:
				{
					letraRandom = "W";
					break;
				}
				
				case 25:
				{
					letraRandom = "X";
					break;
				}
				
				case 26:
				{
					letraRandom = "Y";
					break;
				}
				
				case 27:
				{
					letraRandom = "Z";
					break;
				}
			}
			
			letrasRandomID += letraRandom;
		}
		
		numeroRandomID = numeroRandom2.nextInt(900000) + 100000;
		
		ID += letrasRandomID + "-" + numeroRandomID;
		
		this.IDCurso = ID;
	}
	
	public Curso(String nombreCurso, Profesor profesor, Estudiante[] estudiantes) 
	{
		this.nombreCurso = nombreCurso;
		this.profesor = profesor;
		this.estudiantes = estudiantes;
		
		Random numeroRandom1 = new Random();
		Random numeroRandom2 = new Random();
		
		String letrasRandomID = "";
		int numeroRandomID;
		int posicionRandom;
		String letraRandom = "";
		String ID = "";
		
		for(int hola = 0; hola < 2; hola++)
		{
			posicionRandom = numeroRandom1.nextInt(27) + 1;
			
			switch (posicionRandom)
			{
				case 1:
				{
					letraRandom = "A";
					break;
				}
			
				case 2:
				{
					letraRandom = "B";
					break;
				}
				
				case 3:
				{
					letraRandom = "C";
					break;
				}
				
				case 4:
				{
					letraRandom = "D";
					break;
				}
				
				case 5:
				{
					letraRandom = "E";
					break;
				}
				
				case 6:
				{
					letraRandom = "F";
					break;
				}
				
				case 7:
				{
					letraRandom = "G";
					break;
				}
				
				case 8:
				{
					letraRandom = "H";
					break;
				}
				
				case 9:
				{
					letraRandom = "I";
					break;
				}
				
				case 10:
				{
					letraRandom = "J";
					break;
				}
				
				case 11:
				{
					letraRandom = "K";
					break;
				}
				
				case 12:
				{
					letraRandom = "L";
					break;
				}
				
				case 13:
				{
					letraRandom = "M";
					break;
				}
				
				case 14:
				{
					letraRandom = "N";	
					break;
				}
				
				case 15:
				{
					letraRandom = "Ñ";
					break;
				}
				
				case 16:
				{
					letraRandom = "O";
					break;
				}
				
				case 17:
				{
					letraRandom = "P";
					break;	
				}
				
				case 18:
				{
					letraRandom = "Q";
					break;
				}
				
				case 19:
				{
					letraRandom = "R";
					break;
				}
				
				case 20:
				{
					letraRandom = "S";
					break;
				}
				
				case 21:
				{
					letraRandom = "T";
					break;
				}
				
				case 22:
				{
					letraRandom = "U";
					break;
				}
				
				case 23:
				{
					letraRandom = "V";
					break;
				}
				
				case 24:
				{
					letraRandom = "W";
					break;
				}
				
				case 25:
				{
					letraRandom = "X";
					break;
				}
				
				case 26:
				{
					letraRandom = "Y";
					break;
				}
				
				case 27:
				{
					letraRandom = "Z";
					break;
				}
			}
			
			letrasRandomID += letraRandom;
		}
		
		numeroRandomID = numeroRandom2.nextInt(900000) + 100000;
		
		ID += letrasRandomID + "-" + numeroRandomID;
		
		this.IDCurso = ID;
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
		this.profesor = profesor;
	}

	public Estudiante[] getEstudiantes() 
	{
		return estudiantes;
	}

	public void setEstudiantes(Estudiante[] estudiantes) 
	{
		this.estudiantes = estudiantes;
	}
	
	public Estudiante getEstudianteEspecifico(int numeroEstudiante) 
	{
		return estudiantes[numeroEstudiante];
	}
	
	public void setEstudianteEspecifico(Estudiante estudiante, int numeroEstudiante)
	{
		this.estudiantes[numeroEstudiante] = estudiante;
	}

	public String getIDCurso()
	{
		return IDCurso;
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
			estudiantes[numeroElemento] = estudiante;
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
		
		if (nombreCurso != null)
		{
			System.out.println("El nombre del curso es: " + getNombreCurso());
		}
		
		else
		{
			System.out.println("El nombre del curso es: " + "No se han ingresado datos.");
		}
		
		System.out.println("El ID del curso es: " + getIDCurso());
		System.out.println("La informacion del profesor es: ");
		
		if (profesor != null)
		{
			profesor.mostrarInformacion();
		}
		
		else
		{
			System.out.println("No se han ingresado los datos del profesor.");
		}
		
		System.out.println("INFORMACION DE LOS ESTUDIANTES DEL CURSO");
		
		for (numeroElemento = 0; numeroElemento < tamañoArreglo; numeroElemento++)
		{
			numeroEstudiante = numeroElemento + 1;
			
			System.out.println("La informacion del estudiante " + numeroEstudiante + " es: ");
			
			if (estudiantes[numeroElemento] != null)
			{
				estudiantes[numeroElemento].mostrarInformacion();	
			}
			
			else
			{
				System.out.println("No se ha ingresado los datos de este estudiante.");
			}
		}
	}
}