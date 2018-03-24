package gna;

/**
 * Performs sort by using the Selection Sort algorithm.
 * 
 */
public class SelectionSort extends SortingAlgorithm {
	/**
	 * Sorts the given array using selection sort.
	 * 
	 * @see super
	 */

	private Comparable a;

	public long sort(Comparable[] array) throws IllegalArgumentException {
		if (array == null) {
			throw new IllegalArgumentException("argument 'array' must not be null.");
		}

		int length = array.length;
        long counter = 0;
        for (int j = 0; j < length; j++){
		    int min = j;
		    for (int k = j + 1; k < length; k++){
		        counter++;
		        if(Compare.less(array[k], array[min])) min = k;
            }
            Compare.exch(array, j, min);
        }
        return counter;
	}


	/**
	 * Constructor.
	 */
	public SelectionSort() {

	}
}
