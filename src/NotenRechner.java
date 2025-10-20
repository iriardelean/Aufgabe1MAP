public class NotenRechner {

    // Schreiben Sie eine Methode, die ein Array von Noten bekommen soll.
    // Als Rückgabewert soll die Methode ein Array mit nicht ausreichender Note liefern.
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

    // Schreiben Sie eine Methode, die ein Array von Noten bekommen soll.
    // Als Rückgabewert soll die Methode den Durchschnittswert liefern.
    public static double getDurchschnitt(int[] noten) {
        if (noten.length == 0)
            return 0.0;
        int summe = 0;
        for (int i : noten) {
            summe += i;
        }
        return (double) summe / noten.length;
    }

    // Schreiben Sie eine Methode, die ein Array von Noten bekommen soll.
    // Als Rückgabewert soll die Methode ein Array mit den abgerundeten Noten liefern.
    public static int[] getAbgerundetenNoten(int[] noten) {
        int[] abgerundet = new int[noten.length];
        for (int i = 0; i < noten.length; i++)
            abgerundet[i] = rundeNote(noten[i]);

        return abgerundet;
    }

    // hilfsfunktion
    private static int rundeNote(int note) {
        if  (note < 38)
            return note;

        int rest = note % 5;

        if (rest >= 3)
            return note + (5 - rest);
        else
            return note;
    }
}
