package ejemplo2;

import PI.CalcPi;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i < 15; i++) {
			CalcPi PI  = new CalcPi(i);
			Double lado = PI.calcularlado();
			System.out.println("Iteracion " + " " + i +") = "+ + lado);	
		}
	}

}
