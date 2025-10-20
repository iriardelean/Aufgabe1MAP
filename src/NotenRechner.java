public class NotenRechner {
    public static int[] getNichtAusreichendeNoten(int[] noten) {
        int anzahl = 0;
        for (int i = 0; i < noten.length; i++)
            if (noten[i] < 40)
                anzahl++;

        int[] nichtAusreichend = new int[anzahl];

        int index = 0;
        for (int i = 0; i < noten.length; i++)
            if (noten[i] < 40) {
                nichtAusreichend[index] = noten[i];
                index++;
            }
        return nichtAusreichend;
    }
}
