package ejerciciosRepasoUD1_3_1;

public class S19 {
	/**
	 * [String-3 > notReplace] Define una función que reciba un parámetro de entrada de tipo String. La función devolverá la misma String sustituyendo todas las apariciones de “is” por “is not”. La aparición de “is” no debe ir precedida o seguida de una letra. 
		notReplace("is test") → "is not test"
		notReplace("is-is") → "is not-is not"
		notReplace("This is right") → "This is not right" 
	 * */
	
    public static String notReplace(String str) {
        StringBuilder resultado = new StringBuilder();
        boolean esPrecedidoPorLetra;
        boolean tieneUnaLetraDespues;
        
        //Recorre la cadena para encontrar las ocurrencias de "is"
        for (int i = 0; i < str.length(); i++) {
            //Verifica si encontramos "is"
            if (i + 1 < str.length() && str.charAt(i) == 'i' && str.charAt(i + 1) == 's') {
                //Verifica que "is" no esté precedido ni seguido por una letra
                esPrecedidoPorLetra = i > 0 && Character.isLetter(str.charAt(i - 1));
                tieneUnaLetraDespues = i + 2 < str.length() && Character.isLetter(str.charAt(i + 2));
                
                if (!esPrecedidoPorLetra && !tieneUnaLetraDespues) {
                    //Si no está precedido ni seguido por una letra, reemplaza "is" por "is not"
                    resultado.append("is not");                    
                } else {
                    //Si está precedido o seguido por una letra, solo agrega "is"
                    resultado.append("is");
                }
                
                i++; //Tanto si esta precedido por letras o no, tenemos que saltar una posicion mas para pasar el "is" por completo
            } else {
                //Si no es "is", agrega el carácter actual
                resultado.append(str.charAt(i));
            }
        }
        
        return resultado.toString();
    }

    public static void main(String[] args) {
        //Pruebas
        System.out.println(notReplace("is test"));       //→ "is not test"
        System.out.println(notReplace("is-is"));         //→ "is not-is not"
        System.out.println(notReplace("This is right")); //→ "This is not right"
    }
}
