/*Crea un array de caracteres que contenga de la ‘A’ a la ‘Z’ (solo las mayúsculas).
Después, ve pidiendo posiciones del array por teclado y si la posición es correcta, se
añadirá a una cadena que se mostrara al final, se dejará de insertar cuando se
introduzca un -1.
Por ejemplo, si escribo los siguientes números
0 //Añadirá la ‘A’
5 //añadirá la ‘F’
25 //Añadirá la ‘Z’
50 //Error, inserte otro numero
-1 //fin
Cadena resultante: AFZ*/

import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            char[] caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
            StringBuilder cadenaResultante = new StringBuilder();

            System.out.println("Introduce números (0-25) para añadir letras a la cadena. Introduce -1 para finalizar.");

            int posicion;

            do {
                System.out.print("Posición: ");
                posicion = scanner.nextInt();

                if (posicion >= 0 && posicion <= 25) { // Si la posición es válida, añadimos a la cadena
                    char caracter = caracteres[posicion];
                    cadenaResultante.append(caracter);
                } else if (posicion != -1) {
                    System.out.println("Error, introduce otro número entre 0 y 25.");
                }

            } while (posicion != -1);

            System.out.println("Cadena resultante: " + cadenaResultante.toString());

            scanner.close();
        }
    }
