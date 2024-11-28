package ejerciciosRepasoUD1_3_1;

public class S09 {
	/** 
	 * [String-2 > countHi] Crea una función que reciba como parámetro un String. La función devolverá un entero que indica el número de veces que aparece la cadena “hi” dentro del parámetro de entrada. 
		countHi("abc hi ho") → 1
		countHi("ABChi hi") → 2
		countHi("hihi") → 2
	 * */
	
	 public static int countHi(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            //Verifica si en la posición actual y la siguiente está "hi"
            if (str.charAt(i) == 'h' && str.charAt(i + 1) == 'i') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        //Pruebas
        System.out.println(countHi("abc hi ho")); // → 1
        System.out.println(countHi("ABChi hi"));  // → 2
        System.out.println(countHi("hihi"));      // → 2
    }
}
