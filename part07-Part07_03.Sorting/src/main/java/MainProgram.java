
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }

    public static int smallest(int a[]) {
        int m = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < m) {
                m = a[i];
            }
        }
        return m;
    }

    public static int indexOfSmallest(int[] array) {
        // write your code here
        int s = smallest(array);
        int i = 0;
        for (int j = 0; j < array.length; j++) {
            if (s == array[j]) {
                i = j;
                break;
            }
        }
        return i;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        // write your code here 

        int s = table[startIndex];
        int i = 0;
        for (int j = startIndex; j < table.length; j++) {
            if (table[j] < s) {
                s = table[j];
            }
        }
        for (int j =startIndex; j < table.length; j++) {
            if (s == table[j]) {
                i = j;
                break;
            }
        }

        return i;
    }

    public static void swap(int[] array, int index1, int index2) {
        // write your code here
        int t = array[index1];
        array[index1] = array[index2];
        array[index2] = t;

    }

    public static void sort(int[] array) {
        int j = 0;
        int i;
        while (true) {
            System.out.println(Arrays.toString(array));            
            i = indexOfSmallestFrom(array, j);
            swap(array, j, i);
            j++;
            if (j == array.length) {
                break;
            }
        }

    }

}
