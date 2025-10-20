import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
        int[] noten = {29, 37, 38, 41, 84, 67};

        System.out.println("Noten: " + Arrays.toString(noten));

        // aufgabe 1
        int[] nichtAusreichendeNoten = NotenRechner.getNichtAusreichendeNoten(noten);
        System.out.println("Aufgabe 1 - Nicht ausreichende Noten: " + Arrays.toString(nichtAusreichendeNoten));

        // aufgabe 2
        System.out.print("Aufgabe 2 - Durchschnittswert: ");
        System.out.printf("%.2f \n", NotenRechner.getDurchschnitt(noten));

        // aufgabe 3
        int[] abgerundet = NotenRechner.getAbgerundetenNoten(noten);
        System.out.println("Aufgabe 3 - Abgerundete Noten: " + Arrays.toString(abgerundet));

        // aufgabe 4
        System.out.print("Aufgabe 4 - Maximale abgerundete Note: " + NotenRechner.getMaximalAbgerundeteNote(noten));
    }
}