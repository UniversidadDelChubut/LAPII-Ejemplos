package lapii.ejemplos.configuracion.commandline;

public class ManejoLineaComandos {

	public static void main(String[] args) {
		for (String arg: args) {
			System.out.println(arg);
		}
	}
	/*
	 * Para agregar propiedades de sistema en Eclipse: Acceder al menú Run > Run
	 * Configurations, elegir la aplicación, ir a la pestaña Arguments y en el
	 * campo Program Arguments ingresar, por ejemplo,
	 * "Juan Alberto" estamos al horno
	 * 
	 * Por linea de comandos 
	 * # java lapii.ejemplos.configuracion.commandline.ManejoLineaComandos "Juan Alberto" estamos al horno  
	 */
	
	

}
