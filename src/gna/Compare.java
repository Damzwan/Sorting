package gna;

public class Compare {

    public static boolean less(Comparable first, Comparable second){
        return first.compareTo(second) < 0;
    }

    public static void exch(Comparable[] array, int i, int j){
        Comparable t = array[i];
        array[i] = array[j];
        array[j] = t;
    }

}
