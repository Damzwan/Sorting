package gna;

/**
 * Performs sort by using the Insertion Sort algorithm.
 */
public class InsertionSort extends SortingAlgorithm {
    /**
     * Sorts the given array using insertion sort.
     *
     * @see super
     */
    public long sort(Comparable[] array) throws IllegalArgumentException {
        if (array == null) {
            throw new IllegalArgumentException("argument 'array' must not be null.");
        }
        long counter = 0;
        int length = array.length;
        for (int i = 0; i < length; i++) {
            for (int j = i; j > 0 && Compare.less(array[j], array[j - 1]); j--) {
                counter++;
                Compare.exch(array, j, j - 1);
            }
        }
        return counter;
    }

    /**
     * Constructor.
     */
    public InsertionSort() {
    }
}
