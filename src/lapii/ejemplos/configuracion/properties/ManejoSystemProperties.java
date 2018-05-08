package lapii.ejemplos.configuracion.properties;

public class ManejoSystemProperties {

	public static void main(String[] args) {

		for (String prop : System.getProperties().stringPropertyNames()) {
			System.out.println(prop + " -> "
					+ System.getProperties().getProperty(prop));
		}
	}

	/*
	 * Para agregar propiedades de sistema en Eclipse: Acceder al menú Run > Run
	 * Configurations, elegir la aplicación, ir a la pestaña Arguments y en el
	 * campo VMArguments ingresar, por ejemplo,
	 * -Dpropiedad.nombre=valor_propiedad
	 * 
	 * Por linea de comandos 
	 * # java -Dpropiedad.nombre=valor_propiedad lapii.ejemplos.configuracion.properties.ManejoSystemProperties 
	 */

}
