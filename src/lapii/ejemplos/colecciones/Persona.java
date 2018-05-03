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
	/*
	 * 23142765799	DNI	14276579	MARADONA DIEGO ARMANDO	MASCULINO	30/10/1960	CIUDAD AUTONOMA DE BS AS	99
20023811899	LE	2381189	FAVALORO RENE GERONIMO	MASCULINO	14/07/1923	CIUDAD AUTONOMA DE BS A
20084804356	LE	8480435	TRAVERSO JUAN MARIA	MASCULINO	28/12/1950	BUENOS AIRES	
27167395533	DNI	16739553	SABATINI GABRIELA	FEMENINO	21/06/1963	BUENOS AIRES	
20105900202	DNI	10520020	VILAS GUILLERMO	MASCULINO	17/08/1952	CIUDAD AUTONOMA DE BS AS	
	 */
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
