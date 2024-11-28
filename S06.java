package ejerciciosRepasoUD1_3_1;

public class S06 {	
	/**
	 * [String-1 > withouEnd2] Define una función que reciba un parámetro de entrada, dicha función devolverá otra String eliminando el primer y último carácter. El String de entrada podrá tener cualquier tamaño. 
	 * withouEnd2("Hello") → "ell"
	 * withouEnd2("abc") → "b"
	 * withouEnd2("ab") → ""
	 * */
	
    public static String withoutEnd2(String str) {
        //Verifica que la cadena tenga al menos dos caracteres
        if (str == null || str.length() < 2) {
        	return "La cadena debe tener al menos dos caracteres";
        }
        
        //Elimina el primer y último carácter usando substring
        return str.substring(1, str.length() - 1);
    }

	public static void main(String[] args) {
        //Pruebas de la función
        System.out.println(withoutEnd2("Hello")); // "ell"
        System.out.println(withoutEnd2("abc"));   // "b"
        System.out.println(withoutEnd2("ab"));    // ""
        System.out.println(withoutEnd2(""));    // ""
    }

}
