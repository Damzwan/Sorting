package gna;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static Comparable[] list(int size) {

        Comparable[] anArray = new Integer[size];
        for(int i=0;i<anArray.length;i++)
        {
            anArray[i] = ThreadLocalRandom.current().nextInt(1, 1000);;
        }
        return anArray;
    }

	public static void main(String[] args) {


	}
}
