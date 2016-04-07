package lapii.ejemplos.colecciones;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class EjemploCollections {
	public static void main(String[] args) {
		
		
		LinkedList<String> nombres = new LinkedList<String>();
		

		
		
		nombres.add( "Moisés");
		nombres.add( "César");
		nombres.add( "Gonzalo");
		nombres.add( "Matías");
		nombres.add( "Santiago");
		nombres.add( "Gonzalo");
		
		List<String> lista1=new ArrayList<>();
		lista1.add("Gonzalo");
		
		
		for (int i = 0; i< nombres.size(); i++){
			System.out.println(nombres.get(i));
		}
		System.out.println("------------");
		nombres.remove("Pepe");

		
		System.out.println("------------");
		for (String nombre : nombres) {
			System.out.println(nombre);
		}
		
		System.out.println( "El maximo valor es " + Collections.max(nombres));
		
		System.out.println("---OPRDENADA---");
		Collections.sort(nombres);

		
		for (String nombre : nombres) {
			System.out.println(nombre);
		}
		
		System.out.println("---ITERADORES---");
		Iterator <String> i = nombres.descendingIterator();
		while (i.hasNext()){
			String s = i.next();
			System.out.println(s);
		}
		
		
		
	}
}
