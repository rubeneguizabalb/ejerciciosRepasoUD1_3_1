package ejerciciosRepasoUD1_3_1;

public class S15 {
	/**
	 * [String-3 > countTriple] Define una función que reciba un String como parámetro de entrada. Dicha función devolverá el número de tripletas que contiene el parámetro. Diremos que una tripleta es cuando el mismo carácter aparece tres veces seguidas. 
		countTriple("abcXXXabc") → 1
		countTriple("xxxabyyyycd") → 3
		countTriple("a") → 0
	 */
	
	public static int countTriple(String str) {
        int count = 0;

        //Recorre el String hasta la tercera última posición para evitar desbordes
        for (int i = 0; i < str.length() - 2; i++) {
            //Verifica si el carácter actual es igual al siguiente y al siguiente siguiente
            if (str.charAt(i) == str.charAt(i + 1) && str.charAt(i) == str.charAt(i + 2)) {
                count++; //Si es un grupo de tres caracteres iguales, incrementa el contador
            }
        }

        return count; //Devuelve el número de grupos de tres encontrados
    }

    public static void main(String[] args) {
        //Pruebas
        System.out.println(countTriple("abcXXXabc"));   // → 1
        System.out.println(countTriple("xxxabyyyycd")); // → 3
        System.out.println(countTriple("a"));           // → 0
    }
}
