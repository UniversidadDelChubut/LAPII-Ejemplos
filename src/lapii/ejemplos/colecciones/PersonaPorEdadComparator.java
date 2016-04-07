package lapii.ejemplos.colecciones;

import java.util.Comparator;

public class PersonaPorEdadComparator implements Comparator<Persona> {

	@Override
	public int compare(Persona o1, Persona o2) {
		return o1.getFechaNacimiento().compareTo(o2.getFechaNacimiento());
	}
}
