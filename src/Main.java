import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //-------------------------Arrays-------------------------

        //task 1
        {
            int[] a = {1, 2, 3, 4, 5, 10, 25, 101, 105};
            int k = 5;
            int result = Arrays.stream(a).distinct().filter(x -> x % k == 0).sum();
            System.out.println("Arrays task 1:\n" + result);
        }

        //task 2
        {
            int[] a = {1, 10, 2, 9, 3, 8, 5, 5};
            int z = 5;
            int count = 0;
            for (int i = 0; i < a.length; i++) {
                if (a[i] > z) {
                    count++;
                    a[i] = z;
                }
            }
            System.out.println("Arrays task 2:\n" + "new array: " + Arrays.toString(a) + " replacements: " + count);
        }

        //task 3
        {
            int[] a = {-1, 10, 2, 9, -3, 8, 5, 5, 0, 0};
            int pos = 0;
            int neg = 0;
            int z = 0;
            for (int i = 0; i < a.length; i++) {
                if (a[i] > 0) {
                    pos++;
                } else if (a[i] < 0) {
                    neg++;
                } else {
                    z++;
                }
            }
            System.out.println("Arrays task 3:\n" + "positives: " + pos + " negatives: " + neg + " zeroes: " + z);
        }

        //task 4
        {
            int[] a = {-1, 10, 2, 9, -3, 8, 5, 5, 0, 0};
            int min = a[0];
            int max = a[0];
            int iMax = 0;
            int iMin = 0;
            for (int i = 0; i < a.length; i++) {
                if (a[i] > max) {
                    max = a[i];
                    iMax = i;
                }
                if (a[i] < min) {
                    min = a[i];
                    iMin = i;
                }
            }
            int temp = min;
            a[iMin] = max;
            a[iMax] = temp;
            System.out.println("Arrays task 4:\n" + "new array: " + Arrays.toString(a));
        }

        //task 5
        {
            ArrayList<Integer> a = new ArrayList<>(Arrays.asList(0, 2, 3, 1, 4, 2, 10, 10, 5));
            for (int i = 0, j = 0; i < a.size(); i++, j++) {
                if (a.get(i) <= j) {
                    a.remove(i);
                    i--;
                }
            }
            System.out.println("Arrays task 5:\n" + "new array: " + a);
        }
    }
}