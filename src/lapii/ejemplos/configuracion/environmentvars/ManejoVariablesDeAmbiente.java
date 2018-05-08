package lapii.ejemplos.configuracion.environmentvars;

import java.util.Map;

public class ManejoVariablesDeAmbiente {

	public static void main(String[] args) {
		Map<String, String> env = System.getenv();
		for (String envName : env.keySet()) {
			System.out.format("%s=%s%n", envName, env.get(envName));
		}
		
	}

	/*
	 * Para agregar variables de ambiente en Eclipse: Acceder al menú Run > Run
	 * Configurations, elegir la aplicación, agregar las variables en la pestaña
	 * Environment.
	 */

}
