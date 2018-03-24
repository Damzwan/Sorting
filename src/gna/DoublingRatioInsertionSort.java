package gna;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.Stopwatch;

import java.util.concurrent.ThreadLocalRandom;

public class DoublingRatioInsertionSort {

    /**
     * Creates an array of given size and fills it with random numbers
     * @param size the size of the array
     * @return a new list containing random numbers
     */
    public static Comparable[] list(int size) {

        Comparable[] anArray = new Integer[size];
        for(int i=0;i<anArray.length;i++)
        {
            anArray[i] = ThreadLocalRandom.current().nextInt(-999999999, 999999999);;
        }
        return anArray;
    }

    /**
     * Computes the running time for InsertionSort
     * @param N The size of the array
     * @return the time required to sort an array of given size
     */
    public static double timeTrial(int N){
        InsertionSort insertionSort = new InsertionSort();
        Comparable[] arrayTest = list(N);
        Stopwatch timer = new Stopwatch();
        insertionSort.sort(arrayTest);
        return timer.elapsedTime();
    }

    /**
     * Prints the results of DoublingRatio experiment
     */
    public static void main(String[] args) {
        double prev = timeTrial(125);
        for (int N = 250; true; N+=N){
            double time = timeTrial(N);
            StdOut.printf("%6d %7.1f ", N, time);
            StdOut.printf("%5.1f\n", time/prev);
            prev = time;
        }
    }
}
