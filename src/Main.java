
//Scrivere una funzione che restituisca un HashSet riempito
//        Creare un oggetto dello stesso tipo inserito nell'HashSet e popolarlo
//        Verificare che l' elemento sia parte del Set e stampare il risultato


import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> esempioHashSetConOggetto = creaRiempiHashetConOggetto();
        verificaElementoNelSet(esempioHashSetConOggetto, "nuovo elemento");
    }

    public static HashSet<String> creaRiempiHashetConOggetto() {
        HashSet<String> hashSetNuovoElemento = new HashSet<>();

        // Aggiungi elemento nuovo all'HashSet
        hashSetNuovoElemento.add("nuovo elemento");


        return hashSetNuovoElemento;
    }
    public static void verificaElementoNelSet(HashSet<String> hashSet, String elementoDaVerificare) {
        // Verifica se l'elemento è parte dell'HashSet
        boolean contieneElemento = hashSet.contains(elementoDaVerificare);

        // Stampa il risultato
        System.out.println("L'HashSet contiene l'elemento '" + elementoDaVerificare + "': " + contieneElemento);
    }
}
