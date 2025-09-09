public class Main {
    public static boolean stringaPariDispari(String s) {
        return s.length() % 2 == 0; // Restituisce true se la lunghezza della stringa è pari
    }

    public static boolean annoBisestile(int anno) {
        if (anno % 4 != 0) {
            return false; // Non è bisestile
        } else if (anno % 100 != 0) {
            return true; // È bisestile
        } else {
            return anno % 400 == 0; // È bisestile solo se divisibile per 400
        }
    }

    public static void main(String[] args) {

        // Stringa pari "true"
        String test1 = "ciao";
        // Stringa pari "false"
        String test2 = "tre";
        // Test stringa pari "true"
        System.out.println("La stringa \"" + test1 + "\" risulta avere un numero di caratteri pari? " + stringaPariDispari(test1));
        // Test stringa pari "false"
        System.out.println("La stringa \"" + test2 + "\" risulta avere un numero di caratteri pari? " + stringaPariDispari(test2));

        // Anno bisestile "true"
        int anno1 = 2020;
        // Anno bisestile "false"
        int anno2 = 2025;
        // Test Anno bisestile "true"
        System.out.println("L'anno " + anno1 + " è bisestile? " + annoBisestile(anno1));
        // Test Anno bisestile "false"
        System.out.println("L'anno " + anno2 + " è bisestile? " + annoBisestile(anno2));
    }
}

/*
Spiegazione:
Il programma contiene due metodi:
stringaPariDispari: restituisce true se la lunghezza della stringa è pari, altrimenti false.
annoBisestile: restituisce true se l'anno è bisestile, altrimenti false.
*/