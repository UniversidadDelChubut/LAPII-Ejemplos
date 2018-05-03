package lapii.ejemplos.colecciones;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TestPersona {
	public static void main(String[] args) {

		List <Persona> personas = new LinkedList<Persona>( Persona.getPersonas());  
		for (Persona p : personas) {
			System.out.println(p);
		}
		
		Collections.sort(personas, new PersonaPorEdadComparator());
		System.out.println("Por edad");
		for (Persona p : personas) {
			System.out.println(p);
		}
	
		
		Collections.sort(personas, new PersonaPorNombreComparator());
		System.out.println("Por nombre");
		for (Persona p : personas) {
			System.out.println(p);
		}


	}
}
