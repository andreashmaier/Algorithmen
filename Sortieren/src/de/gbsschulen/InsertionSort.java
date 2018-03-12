package de.gbsschulen;

public class InsertionSort {

    public static void main(String[] args) {
        int[] zahlen = {5, 7, 4, 9, 7};
        int[] bspZahlen = {5, 7, 0, 3, 4, 2, 6, 1};
        // Aufgabe 1: Geben Sie die Permutation an, die zu der Inversionenfolge 0 0 0 3 3 3 3 3 passt.
        int[] loseungAufgabe1 = {5, 6, 7, 0, 1, 2, 3, 4};

//         druckeArray(zahlen);
        int[] v = sort(loseungAufgabe1);
//        druckeArray(zahlen);
        System.out.println("Inversionenfolge:");
        druckeArray(v);
    }

    public static void druckeArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%3d ", a[i]);
        }
//        System.out.println();
//        for (int i = 0; i < a.length; i++) {
//            System.out.printf("%3d ", i);
//        }
        System.out.println();
//        System.out.println("------------------------------------");
    }


    public static int[] sort(int[] a) {
        int[] v = new int[a.length];
        druckeArray(a);
        for (int i = 1; i < a.length; i++) {
            int count = 0;
            int j = i;
            int t = a[j];
            while (j > 0 && t < a[j - 1]) {
                a[j] = a[j - 1];
                j--;
                count++;
            }
            a[j] = t;
            druckeArray(a);
            v[i] = count;
        }
        return v;
    }
}
