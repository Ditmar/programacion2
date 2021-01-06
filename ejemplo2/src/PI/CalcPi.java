package PI;

public class CalcPi {
	private Integer numerodelados;
	private Integer iteracion;
	public  CalcPi(Integer iteracion) {
		this.iteracion = iteracion;
		this.numerodelados = (int) Math.pow(2.0, this.iteracion + 1);
	}
	public double calcularlado() {
		Double resultadoiterativo = 0.0;
		for (Integer i = 1; i < this.iteracion; i++) {
			Double aux = Math.sqrt(2.0 + resultadoiterativo);
			resultadoiterativo = aux;
		}
		Double result = Math.pow(2.0, this.iteracion) * Math.sqrt(2 - resultadoiterativo);
		return result;
	}
}
