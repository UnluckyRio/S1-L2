import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner per leggere l'input
        System.out.print("Inserisci un numero intero: ");
        int numero = scanner.nextInt(); // Legge il numero inserito dall'utente

        // Ciclo per il conto alla rovescia da 'numero' a 0
        for (int i = numero; i >= 0; i--) {
            System.out.println(i); // Stampa il valore corrente di i
        }

        scanner.close(); // Chiude lo scanner
    }
}

/*
Spiegazione:
Il programma chiede all'utente di inserire un numero intero.
Usa un ciclo "for" per contare alla rovescia da quel numero fino a 0,
stampando ogni numero su una nuova riga.
 */