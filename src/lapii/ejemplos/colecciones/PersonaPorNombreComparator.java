package lapii.ejemplos.colecciones;

import java.util.Comparator;

public class PersonaPorNombreComparator implements Comparator<Persona> {

	@Override
	public int compare(Persona p1, Persona p2) {
		if (p1.equals(p2))
			return 0;
		if (p1.getApellido().compareTo(p2.getApellido()) != 0 ){
			return p1.getApellido().compareTo(p2.getApellido());
		} else {
			return p1.getNombre().compareTo(p2.getNombre());
		}
		
	}
}
