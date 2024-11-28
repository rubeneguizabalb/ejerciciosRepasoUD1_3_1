package ejerciciosRepasoUD1_3_1;

public class S05 {
	/** 
	 * [String-1 > theEnd] Define una función que reciba dos parámetros de entrada, un String y un Boolean. En caso de que el booleano sea verdadero, devolverá el primer caracter del String y en caso contrario devolverá el último carácter del String. 
	 * theEnd("Hello", true) → "H"
	 * theEnd("Hello", false) → "o"
	 * theEnd("oh", true) → "o"
	 * */
	
	public static String theEnd(String str, boolean first) {
        //Verifica que la cadena no sea vacía
        if (str == null || str.isEmpty()) {
            return "La cadena no puede estar vacía";
        }
        
        //Retorna el primer o último carácter según el valor del booleano
        return first ? str.substring(0, 1) : str.substring(str.length() - 1);
    }
	
	public static void main(String[] args) {
        //Pruebas de la función
        System.out.println(theEnd("Hello", true));  // "H"
        System.out.println(theEnd("Hello", false)); // "o"
        System.out.println(theEnd("oh", true));     // "o"
        System.out.println(theEnd("", true));     // "o"
    }


}
