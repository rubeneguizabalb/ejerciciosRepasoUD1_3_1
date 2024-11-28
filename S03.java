package ejerciciosRepasoUD1_3_1;

public class S03 {
	
	/** 
	 * [String-1 > nonStart] Define una función que reciba dos parámetros de entrada de tipo String. 
	 * Dicha función deberá devolver su concatenación, eliminando el primer carácter de cada uno de los parámetros de entrada. 
		nonStart("Hello", "There") → "ellohere"
		nonStart("java", "code") → "avaode"
		nonStart("shotl", "java") → "hotlava"
	 */
	
    public static String nonStart(String str1, String str2) {
        //Verifica que las cadenas tengan al menos un carácter
        if (str1.length() < 1 || str2.length() < 1) {
           return "Las cadenas deben tener al menos un carácter";
        }
        
        //Elimina el primer carácter de cada cadena usando substring y concatena los resultados
        return str1.substring(1) + str2.substring(1);
    }
    
	public static void main(String[] args) {
        //Pruebas de la función
        System.out.println(nonStart("Hello", "There")); // "ellohere"
        System.out.println(nonStart("java", "code"));  // "avaode"
        System.out.println(nonStart("shotl", "java")); // "hotlava"
        
        System.out.println(nonStart("", "java")); // ERROR
    }
}
