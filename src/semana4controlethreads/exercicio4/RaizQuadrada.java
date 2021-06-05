package semana4controlethreads.exercicio4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RaizQuadrada {

	private static List<Double> syncListaResultados = new ArrayList<>();
	
	public static void calcularRaizesQuadradas() {
				
		List<Double> listaResultados = new ArrayList<>();
		
		for (Double i = 1.00; i <= 99; i += 2) {
			Double resultado = Math.sqrt(i);
			listaResultados.add(resultado);
		}
		
		syncListaResultados = Collections.synchronizedList(listaResultados);
		
	}
	
	public static void imprimirLista() throws InterruptedException {
		
		for (Double raiz : syncListaResultados) {
			System.out.println(raiz);
			Thread.sleep(50);
		}
		
	}
	
}
