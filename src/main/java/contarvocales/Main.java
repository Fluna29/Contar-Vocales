package contarvocales;

import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        try (sc) {
            String resultado = noEspaciosBlanco();
            contarVocales(resultado);
        }
    }

    private static String noEspaciosBlanco() {
        String cadena;
        do {
            System.out.println("Introduzca una cadena de texto:");
            cadena = sc.nextLine().trim(); // Elimina espacios al inicio y al final
        } while (cadena.isEmpty()); // Verifica si la cadena está vacía después de eliminar espacios
        return cadena.toLowerCase();
        
    }

    public static void contarVocales(String cadena) {
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == 'a' || cadena.charAt(i) == 'e' || cadena.charAt(i) == 'i' || cadena.charAt(i) == 'o' || cadena.charAt(i) == 'u') {
                contador++;
            }
        }
        System.out.println("La cadena de texto tiene " + contador + " vocales");
    }
    
}