package gna;

import java.util.Arrays;

public class Main {
	/**
	 * Example main function.
	 * 
	 * You can replace this.
	 */
	public static void main(String[] args) {
		Comparable[] mrh = {1, 8, 5, 6, 7, 2};
		QuickSort ok = new QuickSort();
		long bag = ok.sort(mrh);
        System.out.println(bag);
        bag = ok.sort(mrh);
        System.out.println(bag);


	}
}
