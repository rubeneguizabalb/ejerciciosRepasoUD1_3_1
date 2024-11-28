package ejerciciosRepasoUD1_3_1;

public class S16 {
	/**
	 * [String-3 > sumDigits] Define una función que reciba un String como parámetro de entrada. La función devolverá la suma de todos los dígitos contenidos en dicha cadena. 
		sumDigits("aa1bc2d3") → 6
		sumDigits("aa11b33") → 8
		sumDigits("Chocolate") → 0
	 */
	
	public static int sumDigits(String str) {
        int sum = 0;

        //Recorre cada carácter del String
        for (int i = 0; i < str.length(); i++) {
            //Verifica si el carácter es un dígito
            if (Character.isDigit(str.charAt(i))) {
                //Si es un dígito, convierte el carácter a un número y lo suma
                sum += Character.getNumericValue(str.charAt(i));
            }
        }

        return sum; //Devuelve la suma de los dígitos
    }

    public static void main(String[] args) {
        //Pruebas
        System.out.println(sumDigits("aa1bc2d3"));    // → 6
        System.out.println(sumDigits("aa11b33"));     // → 8
        System.out.println(sumDigits("Chocolate"));   // → 0
    }
}
