
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

    }

    public static int smallest(int[] niz) {
        int smallest = niz[0];
        for (int i = 1; i < niz.length; i++) {
            if (smallest > niz[i]) {
                smallest = niz[i];
            }
        }
        return smallest;
    }

    public static int indexOfTheSmallest(int[] niz) {
        int smallest = niz[0];
        int temp = 0;
        for (int i = 1; i < niz.length; i++) {
            if (smallest > niz[i]) {
                smallest = niz[i];
                temp = i;
            }
        }
        return temp;
    }

    public static int indexOfTheSmallestStartingFrom(int[] niz, int index) {
        int smallest = niz[index];
        int temp = index;
        for (int i = index; i < niz.length; i++) {
            if (smallest > niz[i]) {
                smallest = niz[i];
                temp = i;
            }
        }
        return temp;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] niz){
        for(int i =0;i<niz.length;i++){
            swap(niz, i, indexOfTheSmallestStartingFrom(niz, i));
        }
    }
}
