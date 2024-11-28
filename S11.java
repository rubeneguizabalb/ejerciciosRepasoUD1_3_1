package ejerciciosRepasoUD1_3_1;

public class S11 {
	/** 
	 * [String-2 > countCode]Define una función que reciba por parámetro un String. Devolverá el número de veces que la palabra “code” aparece en dicho parámetro. Aceptaremos que la ‘d’ pueda ser sutituida por cualquier otra letra. Por lo que “cope” y “cooe” también contarán. 
		countCode("aaacodebbb") → 1
		countCode("codexxcode") → 2
		countCode("cozexxcope") → 2
	 * */
	public static int countCode(String str) {
        int count = 0;

        for (int i = 0; i < str.length() - 3; i++) { //Recorre hasta str.length() - 3 para evitar desbordes
            //Verifica si la subcadena cumple el patrón "co_e"
            if (str.charAt(i) == 'c' && str.charAt(i + 1) == 'o' && str.charAt(i + 3) == 'e') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        //Pruebas
        System.out.println(countCode("aaacodebbb"));   // → 1
        System.out.println(countCode("codexxcode"));   // → 2
        System.out.println(countCode("cozexxcope"));   // → 2
    }
	
}
