import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int uneseniBroj = 0;

        while (uneseniBroj <= 0) {

            System.out.println("Unesite pozitivan cijeli broj N: ");
            if (scanner.hasNextInt()) {
                uneseniBroj = scanner.nextInt();
                
                if (uneseniBroj <= 0) {
                    System.out.println("Broj mora biti pozitivan. Pokušajte ponovno.");
                }
            } else {
                System.out.println("Unos nije cijeli broj. Pokušajte ponovno.");
            }
        }

        int suma = 0;

        for (int i = 1; i <= uneseniBroj; i++) {
            suma += i;
        }

        System.out.println("Zbroj svih brojeva od 1 do " + uneseniBroj + " je: " + suma);
    }
}
