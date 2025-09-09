import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner per leggere l'input
        String input;

        while (true) { // Ciclo infinito finché non si inserisce ":q"
            System.out.print("Inserisci una stringa (o ':q' per uscire): ");
            input = scanner.nextLine(); // Legge la stringa inserita dall'utente

            if (input.equals(":q")) { // Controlla se l'utente vuole uscire
                break; // Esce dal ciclo
            }

            for (int i = 0; i < input.length(); i++) { // Scorre ogni carattere della stringa
                System.out.print(input.charAt(i)); // Stampa il carattere
                if (i < input.length() - 1) {
                    System.out.print(","); // Aggiunge la virgola tra i caratteri
                }
            }
            System.out.println(); // Va a capo dopo aver stampato tutti i caratteri
        }

        scanner.close(); // Chiude lo scanner
        System.out.println("Programma terminato."); // Messaggio di fine programma
    }
}

/*
Spiegazione:
Il programma usa un ciclo "while" per chiedere all'utente di inserire una stringa.
Se la stringa non è :q, la suddivide in caratteri separati da virgola e li stampa.
Il ciclo termina solo quando l'utente inserisce :q.
 */
