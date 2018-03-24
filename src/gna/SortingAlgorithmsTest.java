package gna;

import static org.junit.Assert.*;
import libpract.SortingAlgorithm;

import org.junit.Test;

/**
 * Tests that test whether the implementations of the sorting algorithms do sort.
 */
public class SortingAlgorithmsTest {

    public static boolean isSorted(Comparable[] array){
        for (int i = 1; i < array.length; i++){
            if(Compare.less(array[i], array[i-1])) return false;
        }
        return true;
    }

	@Test
	public void selectionTest1() {
	    Comparable[] arrayToTest = {5, 8, 9, 7};
	    SelectionSort ok = new SelectionSort();
	    ok.sort(arrayToTest);
	    assert isSorted(arrayToTest);
	}

    @Test
    public void selectionTest2() {
        Comparable[] arrayToTest = {};
        SelectionSort ok = new SelectionSort();
        ok.sort(arrayToTest);
        assert isSorted(arrayToTest);
    }

    @Test
    public void insertionTest1() {
        Comparable[] arrayToTest = {5, 8, 9, 7};
        InsertionSort ok = new InsertionSort();
        ok.sort(arrayToTest);
        assert isSorted(arrayToTest);
    }

    @Test
    public void insertionTest2() {
        Comparable[] arrayToTest = {};
        InsertionSort ok = new InsertionSort();
        ok.sort(arrayToTest);
        assert isSorted(arrayToTest);
    }

    @Test
    public void quickSortTest1() {
        Comparable[] arrayToTest = {5, 8, 9, 7};
        QuickSort ok = new QuickSort();
        ok.sort(arrayToTest);
        assert isSorted(arrayToTest);
    }

    @Test
    public void quickSortTest2() {
        Comparable[] arrayToTest = {5, 8, 9, 7};
        QuickSort ok = new QuickSort();
        ok.sort(arrayToTest);
        assert isSorted(arrayToTest);
    }



}
