import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una palabra en minúsculas: ");
        String palabra = sc.nextLine();

        int vocales = 0, consonantes = 0;

        for (char c : palabra.toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                vocales++;
            } else if (c >= 'a' && c <= 'z') {
                consonantes++;
            }
        }

        System.out.println("Número de vocales: " + vocales);
        System.out.println("Número de consonantes: " + consonantes);
    }
}
