package loteria;

public class Primitiva {
	//atributos.
	private Integer[] resultados;
	private Integer LimiteNumerico;
	//constructor
	public Primitiva(Integer limite, Integer limiteNumerico) {
		resultados = new Integer[limite];
		LimiteNumerico = limiteNumerico;
	}
	public void generar() {
		Integer i = 0;
		while (i < resultados.length) {
			//CAST
			Integer numerosaleatorios =  (int) Math.round(Math.random() * (LimiteNumerico - 1)) + 1;  
			if (verificarNumero( numerosaleatorios)) {
				resultados[i] = numerosaleatorios;
				i++;
			}
		}
	}
	public void ordenar() {
		for (int i = 0; i < resultados.length; i++) {
			for (int j = i + 1; j < resultados.length; j++) {
				if (resultados[i] > resultados[j]) {
					Integer aux = resultados[j];
					resultados[j] = resultados[i];
					resultados[i] = aux;
				}
			}
		}
	}
	public Integer[] getResult() {
		return resultados;
	}
	private Boolean verificarNumero(Integer n) {
		for (Integer i = 0; i < resultados.length; i++) {
			if(resultados[i] == n) {
				return false;
			}
		}
		return true;
	}
}
