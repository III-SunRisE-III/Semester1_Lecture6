import java.util.Random;
import java.util.Scanner;

public class Main {
    public static int[] fill_array(int[] array) {
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(-100, 101);
        }
        return array;
    }

    public static void print_array(int[] array) {
        for (int elem: array) {
            System.out.print(elem + " ");
        }
        System.out.println();
    }

    public static int[] bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if (array[i] < array[j]) {
                    int t = array[j];
                    array[j] = array[i];
                    array[i] = t;
                }
            }
        }
        return array;
    }

    public static int[] sortMin(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int t = array[i];
                    array[i] = array[j];
                    array[j] = t;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        final int n = s.nextInt();
        int[] arr = fill_array(new int[n]);
        print_array(arr);
        print_array(sortMin(arr));
        print_array(bubbleSort(arr));
    }
}
