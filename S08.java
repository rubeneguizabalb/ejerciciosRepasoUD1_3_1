package ejerciciosRepasoUD1_3_1;

public class S08 {
	/** [String-2 > doubleChar] Define una función que reciba un parámetro de entrada de tipo String. La función devolverá otra String que contenga cada uno de los caracteres duplicados. 
	doubleChar("The") → "TThhee"
	doubleChar("AAbb") → "AAAAbbbb"
	doubleChar("Hi-There") → "HHii--TThheerree"
	 */
	
    public static String doubleChar(String str) {
        //Verifica que la cadena no sea null
        if (str == null) {
            return "La cadena no puede ser null";
        }

        //Construcción de la cadena resultado
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);  //Obtiene el carácter actual
            result += currentChar;             //Lo agrega una vez
            result += currentChar;             //Lo agrega otra vez
        }
        return result;
    }
	
	public static void main(String[] args) {
        //Pruebas de la función
        System.out.println(doubleChar("The"));        // "TThhee"
        System.out.println(doubleChar("AAbb"));       // "AAAAbbbb"
        System.out.println(doubleChar("Hi-There"));   // "HHii--TThheerree"
        System.out.println(doubleChar(""));           // ""
        System.out.println(doubleChar(null));         // null
    }


}
