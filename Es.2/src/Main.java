import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner per leggere l'input da tastiera
        System.out.print("Inserisci un numero intero: "); // Chiede all'utente di inserire un numero intero
        int numero = scanner.nextInt(); // Legge il numero intero inserito dall'utente

        // Switch per gestire i casi da 0 a 3
        switch (numero) {
            case 0:
                System.out.println("zero"); // Stampa "zero" se il numero è 0
                break;
            case 1:
                System.out.println("uno"); // Stampa "uno" se il numero è 1
                break;
            case 2:
                System.out.println("due"); // Stampa "due" se il numero è 2
                break;
            case 3:
                System.out.println("tre"); // Stampa "tre" se il numero è 3
                break;
            default:
                System.out.println("Errore: numero non compreso tra 0 e 3."); // Messaggio di errore
        }
    }
}
