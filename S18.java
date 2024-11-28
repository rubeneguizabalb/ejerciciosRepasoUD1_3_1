package ejerciciosRepasoUD1_3_1;

public class S18 {
	/**
	 * [String-3 > maxBlock] Define una función que reciba como parámetro un String. La función devolverá un entero que representa el tamaño del bloque más largo dentro del parámetro de entrada. Diremos que un bloque es la aparición consecutiva de una letra. 
		maxBlock("hoopla") → 2
		maxBlock("abbCCCddBBBxx") → 3
		maxBlock("") → 0
	 */
	
	public static int maxBlock(String str) {
        //Si el string está vacío, devolvemos 0
        if (str.isEmpty()) {
            return 0;
        }

        int maxLargoBloque = 1; //Inicializamos la longitud máxima del bloque en 1
        int largoActual = 1; //Inicializamos la longitud del bloque actual en 1

        //Recorremos el string desde el segundo carácter hasta el final
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                //Si el carácter actual es igual al anterior, incrementamos el bloque
                largoActual++;
            } else {
                //Si no es igual, actualizamos la longitud máxima si es necesario
                if (largoActual > maxLargoBloque) {
                    maxLargoBloque = largoActual;
                }
                //Reiniciamos el contador del bloque actual
                largoActual = 1;
            }
        }

        //Después de salir del bucle, verificamos el último bloque
        if (largoActual > maxLargoBloque) {
            maxLargoBloque = largoActual;
        }

        return maxLargoBloque; //Devolvemos la longitud del bloque más largo
    }

    public static void main(String[] args) {
        //Pruebas
        System.out.println(maxBlock("hoopla"));        // → 2
        System.out.println(maxBlock("abbCCCddBBBxx")); // → 3
        System.out.println(maxBlock(""));              // → 0
    }
}
