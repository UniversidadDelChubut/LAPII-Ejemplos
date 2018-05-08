package lapii.ejemplos.configuracion.properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

/**
 * Ejemplo de uso de archivos de propiedades.
 * 
 * @author sadellatorre
 * @see https
 *      ://docs.oracle.com/javase/tutorial/essential/environment/properties.html
 */
public class ManejoProperties {

	public static void main(String[] args) throws IOException {

		// Se cargan las propiedades por defecto desde un archivo
		Properties defaultProps = new Properties();
		FileInputStream in = new FileInputStream("default.properties");
		defaultProps.load(in);
		in.close();

		// se crean las propiedades de aplicación a partir de las propiedades
		// por defecto
		Properties applicationProps = new Properties(defaultProps);

		// y se completan con las propiedades del archivo 
		in = new FileInputStream("app.properties");
		applicationProps.load(in);
		in.close();

		for (String prop : applicationProps.stringPropertyNames()) {
			System.out.println(prop + " -> "
					+ applicationProps.getProperty(prop));
		}
		
		//Se 
		applicationProps.setProperty("acceso.ultimo", new Date().toString());
		
		
		
		FileOutputStream out = new FileOutputStream("app.properties");
		applicationProps.store(out, "---No Comment---");
		out.close();
		

	}

}
