package de.gbsschulen;

public class BubbleSorter {
    private int[] a;

    public BubbleSorter(int[] a) {
        this.a = a;
        sort();
    }

    private void sort() {
        boolean getausch;
        do {
            getausch = false;
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i + 1]) {
                    int tmp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = tmp;
                    getausch = true;
                }
            }
        } while (getausch);
    }

    @Override
    public String toString() {
        String result = "";
        for (int i : a) {
            result += i + " ";
        }
        return result;
    }

    public static void main(String[] args) {
        int[] zahlen = {5, 7, 0, 3, 4, 2, 6, 1};
        BubbleSorter bubbleSorter = new BubbleSorter(zahlen);
        System.out.println(bubbleSorter);
    }
}

