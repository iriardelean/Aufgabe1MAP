import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
        int[] noten = {29, 37, 38, 41, 84, 67};

        System.out.println("Noten: " + Arrays.toString(noten));

        int[] nichtAusreichendeNoten = NotenRechner.getNichtAusreichendeNoten(noten);
        System.out.println("Aufgabe 1 - Nicht ausreichende Noten: " + Arrays.toString(nichtAusreichendeNoten));
    }
}