package ejerciciosRepasoUD1_3_1;

public class S14 {
	/** 
	 * [String-3 > gHappy] Define una función que reciba una cadena por parámetro de entrada. La función devolverá verdadero en caso de que todas las apariciones de la letra ‘g’ están acompañadas por otra letra ‘g’ a la derecha o a la izquierda. Devolverá falso en caso contrario. 
		gHappy("xxggxx") → true
		gHappy("xxgxx") → false
		gHappy("xxggyygxx") → false
	 */
	
	 public static boolean gHappy(String str) {
        //Recorre el String buscando las apariciones de 'g'
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'g') {
                //Verifica si la 'g' no está acompañada de otra 'g' a la izquierda o derecha
                if (i > 0 && str.charAt(i - 1) == 'g') {
                    //Si hay una 'g' a la izquierda, continua con la siguiente
                    //continue;
                } else if (i < str.length() - 1 && str.charAt(i + 1) == 'g') {
                    //Si hay una 'g' a la derecha, continua con la siguiente
                    //continue;
                } else {
                    //Si la 'g' no está acompañada de otra 'g', devuelve falso
                    return false;
                }
            }
        }
        // i todas las 'g' están acompañadas, devuelve verdadero
        return true;
    }

    public static void main(String[] args) {
        //Pruebas
        System.out.println(gHappy("xxggxx"));     // → true
        System.out.println(gHappy("xxgxx"));      // → false
        System.out.println(gHappy("xxggyygxx"));  // → false
        System.out.println(gHappy("xxggyyggxx")); // → true
    }
}
