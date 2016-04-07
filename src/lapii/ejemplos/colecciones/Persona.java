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
		personas.add(new Persona(25230298, "DELLA TORRE", "Santiago", "04/03/1976"));
		personas.add(new Persona(39443521, "CURIQUEO", "César", "22/06/1996"));
		personas.add(new Persona(40123090, "BRUZZO", "Matías", "28/03/1997"));
		personas.add(new Persona(34308005, "CALLIZANA VILCA", "Moisés", "11/04/1991"));
		personas.add(new Persona(38801640, "CRUZADO", "Gonzalo", "16/04/1996"));
		
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
	
	

}
