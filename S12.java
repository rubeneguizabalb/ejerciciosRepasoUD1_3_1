package ejerciciosRepasoUD1_3_1;

public class S12 {
	/** 
	 * [String-2 > getSandwich] Define una función que reciba por parámetro un String. Dicha función devolverá otra string con la cadena que se encuentre entre la primera aparición de la palabra “bread” y la segunda aparición de la palabra “bread”. En caso de no haber dos “bread” devolverá “” (cadena vacía);
		getSandwich("breadjambread") → "jam"
		getSandwich("xxbreadjambreadyy") → "jam"
		getSandwich("xxbreadyy") → ""
	 * */
	
	public static String getSandwich(String str) {
        //Busca la primera aparición de "bread"
        int primerBread = str.indexOf("bread");
        
        //Si no se encuentra la primera aparición de "bread" o hay menos de dos "bread", devuelve una cadena vacía
        if (primerBread == -1) {
            return "";
        }
        
        //Busca la segunda aparición de "bread" después de la primera
        int segundoBread = str.indexOf("bread", primerBread + 5); // +5 para saltar la primera aparición de "bread"
        
        //Si no se encuentra la segunda aparición de "bread", devuelve una cadena vacía
        if (segundoBread == -1) {
            return "";
        }
        
        //Devuelve la cadena que se encuentra entre las dos apariciones de "bread"
        return str.substring(primerBread + 5, segundoBread);
    }

    public static void main(String[] args) {
        //Pruebas
        System.out.println(getSandwich("breadjambread"));      // → "jam"
        System.out.println(getSandwich("xxbreadjambreadyy"));  // → "jam"
        System.out.println(getSandwich("xxbreadyy"));          // → ""
    }
}
