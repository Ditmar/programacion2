
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder cad = new StringBuilder("Para el resto de n�meros reales, esta representaci�n puede ampliarse todav�a m�s utilizando infinitas cifras decimales peri�dicas y no peri�dicas, de forma que tambi�n suele conocerse �informalmente� como n�mero decimal a cualquier n�mero real escrito as�, sobre todo en los primeros cursos d");
		System.out.println("LEN " + cad.length() );
		System.out.println("LEN " + cad.indexOf(",") );
		System.out.println( cad.substring(cad.indexOf("esta"), cad.lastIndexOf(",")));
		String otracadena = cad.toString();
		otracadena = otracadena.replaceAll("a", "u");
		System.out.println( otracadena);
		
	}

}
