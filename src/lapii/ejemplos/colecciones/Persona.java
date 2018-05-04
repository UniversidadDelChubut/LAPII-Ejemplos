package lapii.ejemplos.colecciones;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedList;

public class Persona {
	
	private int numeroDocumento;
	private String apellido;
	private String nombre;
	private Date fechaNacimiento;
	
	public Persona(int numeroDocumento, String apellido, String nombre, String fechaNacimiento) {
		super();
		this.numeroDocumento = numeroDocumento;
		this.apellido = apellido;
		this.nombre = nombre;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			this.fechaNacimiento = sdf.parse(fechaNacimiento);
		} catch (ParseException e) {
			; 
		}
	}
	public static Collection <Persona> getPersonas () {
		Collection <Persona> personas = new LinkedList<>();
		personas.add(new Persona(14276579, "MARADONA", "DIEGO ARMANDO", "30/10/1960"));
		personas.add(new Persona(10520020, "VILAS", "GUILLERMO", "17/08/1952"));
		personas.add(new Persona(16739553, "SABATINI", "GABRIELA", "21/06/1963"));
		personas.add(new Persona(17364878, "SABATINI", "OSVALDO ANIBAL", "08/06/1965"));
		personas.add(new Persona( 2381189, "FAVALORO", "RENE GERONIMO", "14/07/1923"));
		personas.add(new Persona( 8480435, "TRAVERSO", "JUAN MARIA", "28/12/1950"));
		return personas;
	}

	public int getNumeroDocumento() {
		return numeroDocumento;
	}

	public String getApellido() {
		return apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	@Override
	public String toString() {
		return this.getApellido() + ", " + this.getNombre() + "  (" + this.getNumeroDocumento()+ ")";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numeroDocumento;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (numeroDocumento != other.numeroDocumento)
			return false;
		return true;
	}

}
