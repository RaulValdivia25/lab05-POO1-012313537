package tareaClaseUniversidad;

public class testPrincipal 
{
	public static void main(String[] args) 
	{	
		Profesor profesorMatematica = new Profesor("Juan", "Perez", 45, 1000);
		
		Estudiante estudiante1 = new Estudiante("Maria", "Rodriguez", 22);
		Estudiante estudiante2 = new Estudiante("Carlos", "Sanchez", 20);
		Estudiante estudiante3 = new Estudiante("Laura", "Gonzales", 21);
		Estudiante estudiante4 = new Estudiante("Alejandro", "Martinez", 23);
		Estudiante estudiante5 = new Estudiante("Ana", "Lopez", 19);
		
		Estudiante estudiantesMatematica[] = new Estudiante[5];
		estudiantesMatematica[0] = estudiante1;
		estudiantesMatematica[1] = estudiante2;
		estudiantesMatematica[2] = estudiante3;
		estudiantesMatematica[3] = estudiante4;
		estudiantesMatematica[4] = estudiante5;
		
		Curso Matematica = new Curso("Matematica", profesorMatematica, estudiantesMatematica);
		
		Profesor profesoresUniversitarios[] = new Profesor[5];
		profesoresUniversitarios[0] = profesorMatematica;
		
		Estudiante estudiantesUniversitarios[] = new Estudiante[25];
		estudiantesUniversitarios[0] = estudiante1;
		estudiantesUniversitarios[1] = estudiante2;
		estudiantesUniversitarios[2] = estudiante3;
		estudiantesUniversitarios[3] = estudiante4;
		estudiantesUniversitarios[4] = estudiante5;
		
		Curso cursosUniversitarios[] = new Curso[5];
		cursosUniversitarios[0] = Matematica;
		
		Universidad USIL = new Universidad("USIL", estudiantesUniversitarios, profesoresUniversitarios, cursosUniversitarios);
		
		USIL.mostrarInfomacionCursos();
	}
}
