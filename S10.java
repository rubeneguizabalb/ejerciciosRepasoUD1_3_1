package ejerciciosRepasoUD1_3_1;

public class S10 {
	/** 
	 * [String-2 > catDog] Define una función que reciba por parámetro un String. Devolverá verdadero en caso de que los Strings “cat” y “dog” aparezcan el mismo número de veces, y falso en caso contrario. 
		catDog("catdog") → true
		catDog("catcat") → false
		catDog("1cat1cadodog") → true
	 */
	
	public static boolean catDog(String str) {
        int catCount = 0;
        int dogCount = 0;

        for (int i = 0; i < str.length() - 2; i++) { //Recorrer hasta str.length() - 2 para evitar desbordes
            //Verifica si los caracteres actuales son "cat"
            if (str.substring(i, i + 3).equals("cat")) {
                catCount++;
            }
            //Verifica si los caracteres actuales son "dog"
            if (str.substring(i, i + 3).equals("dog")) {
                dogCount++;
            }
        }
        //Compara los contadores de "cat" y "dog"
        return catCount == dogCount;
    }

    public static void main(String[] args) {
        //Pruebas
        System.out.println(catDog("catdog"));         // → true
        System.out.println(catDog("catcat"));         // → false
        System.out.println(catDog("1cat1cadodog"));   // → true
    }
}
