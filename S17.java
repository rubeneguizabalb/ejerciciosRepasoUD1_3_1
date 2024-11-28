package ejerciciosRepasoUD1_3_1;

public class S17 {
	/**
	 * [String-3 > mirrorEnds] Implementa una función que reciba un parametro de entrada de tipo String. La función devolverá un String con aquellos caracteres que coincidan al principio y al final del parámetro de entrada. 
		mirrorEnds("abXYZba") → "ab"
		mirrorEnds("abca") → "a"
		mirrorEnds("aba") → "aba"
	 */
	
	public static String mirrorEnds(String str) {
        int length = str.length();
        int i = 0;

        //Mira extremo a extremo y obtenemos la longitud máxima de coincidencia de caracteres
        while (i < length / 2 && str.charAt(i) == str.charAt(length - 1 - i)) {
            i++;
        }

        //Devuelve la subcadena que tiene la coincidencia
        return str.substring(0, i);
    }

    public static void main(String[] args) {
        //Pruebas
        System.out.println(mirrorEnds("abXYZba"));  // → "ab"
        System.out.println(mirrorEnds("abca"));     // → "a"
        System.out.println(mirrorEnds("aba"));      // → "aba"
    }
}
