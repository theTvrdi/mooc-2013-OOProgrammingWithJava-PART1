
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4};
        int[] copied = copy(original);

        // change the copied
        copied[0] = 99;

        // print both
        System.out.println("original: " + Arrays.toString(original));
        System.out.println("copied: " + Arrays.toString(copied));
    }

    public static int[] copy(int[] array) {
        int[] novi = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            novi[i] = array[i];
        }
        return novi;
    }

    public static int[] reverseCopy(int[] array) {
        int[] test = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            test[i] = array[array.length - i - 1];
        }
        return test;
    }
}