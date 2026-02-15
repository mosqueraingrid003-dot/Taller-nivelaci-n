import java.util.Scanner;

public class Invertir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una cadena: ");
        String cadena = sc.nextLine();

        String invertida = new StringBuilder(cadena).reverse().toString();

        System.out.println("Cadena invertida: " + invertida);
    }
}
