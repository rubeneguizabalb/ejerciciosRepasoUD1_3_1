package ejerciciosRepasoUD1_3_1;

public class S13 {
	/** 
	 * [String-2 > wordEnds] Define una función que reciba dos parámetros de tipo String como entrada. La función deberá devolver una String compuesta por el carácter que está justo antes y justo después de cada aparición del segundo parámetro en el primer parámetro. 
		wordEnds("abcXY123XYijk", "XY") → "c13i"
		wordEnds("XY123XY", "XY") → "13"
		wordEnds("XY1XY", "XY") → "11"
	 */
	
	public static String wordEnds(String str, String strDelanteDetras) {
        StringBuilder resultado = new StringBuilder();
        
        for (int i = 0; i < str.length() - strDelanteDetras.length() + 1; i++) {
            //Comprobar si la subcadena coincide con el "target"
            if (str.substring(i, i + strDelanteDetras.length()).equals(strDelanteDetras)) {
                // Si hay un carácter antes de la palabra "target", lo agregamos
                if (i > 0) {
                    resultado.append(str.charAt(i - 1));
                }
                // Si hay un carácter después de la palabra "target", lo agregamos
                if (i + strDelanteDetras.length() < str.length()) {
                    resultado.append(str.charAt(i + strDelanteDetras.length()));
                }
            }
        }
        
        return resultado.toString();
    }

    public static void main(String[] args) {
        //Pruebas
        System.out.println(wordEnds("abcXY123XYijk", "XY"));  // → "c13i"
        System.out.println(wordEnds("XY123XY", "XY"));        // → "13"
        System.out.println(wordEnds("XY1XY", "XY"));          // → "11"
    }
}
