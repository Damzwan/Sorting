package gna;

/**
 * Performs sort by using the Quick Sort algorithm.
 *
 */
public class QuickSort extends SortingAlgorithm{
	/**
	 * Sorts the given array using quick sort.
	 * 
	 * @see super
	 */

	private long counter = 0;

	public long sort(Comparable[] array) throws IllegalArgumentException {
		if (array == null) {
			throw new IllegalArgumentException("argument 'array' must not be null.");
		}
		this.counter = 0;
	     return sort(array, 0, array.length - 1);

	}

    public long sort(Comparable[] array, int lo, int hi) throws IllegalArgumentException {
	    if(lo >= hi) return 0;

	    int pivotLocation = partition(array, lo, hi);
	    sort(array, lo, pivotLocation - 1);
	    sort(array, pivotLocation + 1, hi);

        return counter;

    }


    public int partition(Comparable[] array, int lo, int hi){
	    int down = lo;
	    int up = hi + 1;
	    Comparable pivot = array[lo];
	    while (true){
	        while (Compare.less(array[++down], pivot)){
	            counter++;
	            if(down == hi) break;
            }
            counter++;
	        while (Compare.less(pivot, array[--up])){
	            counter++;
	            if(up == lo) break;
            }
            counter++;
	        if(down >= up) break;
	        Compare.exch(array, down, up);
        }
        Compare.exch(array, lo, up);
	    return up;
    }

	/**
	 * Constructor.
	 */
	public QuickSort() {
	}
}
