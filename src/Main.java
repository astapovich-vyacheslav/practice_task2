import utils.Primes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

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

        //task 6
        {
            double[] a = {1.123, 2.222, 3.3, 1.55, 2.0, 3.9, 1.1, 2.2, 2.2, 2.3, 2.5, 10.0};
            double sum = 0;
            for (int i = 0; i < a.length; i++) {
                if (Primes.isPrime(i)) {
                    sum += a[i];
                }
            }
            System.out.println("Arrays task 6:\n" + sum);
        }

        //task 7
        {
            int[] a = {1, 2, 3, 4, 5, 6, 8, 8, 9, 10, 0, 9};
            int len = a.length;
            int value = a[0] + a[len - 1];
            for (int i = 1; i < len / 2; i++) {
                int t = a[i] + a[len - 1 - i];
                if (t > value) {
                    value = t;
                }
            }
            System.out.println("Arrays task 7:\n" + value);
        }
        //task 8
        {
            int[] a = {2, 3, 4, 5, 6, 1, 8, 8, 9, 10, 1, 9, 1, 1};
            int len = a.length;
            int min = a[0];
            for (int i = 1; i < len; i++) {
                if (a[i] < min) {
                    min = a[i];
                }
            }
            ArrayList<Integer> b = new ArrayList<>();
            for (int j : a) {
                if (j > min) {
                    b.add(j);
                }
            }
            System.out.println("Arrays task 8:\n" + Arrays.toString(b.toArray()));
        }

        //task 8
        {
            int[] a = {9, 1, 2, 1, 2, 3, 3, 3, 1, 9};
            int len = a.length;
            int prevCount = 0;
            int prevValue = a[0];
            for (int i = 0; i < len; i++) {
                int count = 1;
                int value = a[i];
                for (int j = i + 1; j < len; j++) {
                    if (a[j] == value) {
                        count++;
                    }
                }
                if (count > prevCount || count == prevCount && value < prevValue) {
                    prevValue = value;
                    prevCount = count;
                }
            }
            System.out.println("Arrays task 9:\n" + prevValue);
        }

        //task 10


        //-------------------------Arrays of arrays-------------------------

        //task 1
        {
            System.out.println("Arrays of arrays task 1:");
            int[][] m = {{1, 2, 3, 4, 5},
                         {1, 2, 3, 4, 5},
                         {1, 2, 3, 4, 5},
                         {1, 2, 3, 4, 5},
                         {0, 2, 3, 4, 4},};
            int h = m.length;
            int w = m[0].length;
            for (int i = 0; i < w; i += 2) {
                if (m[0][i] > m[h - 1][i]) {
                    for (int[] ints : m) {
                        System.out.print(ints[i] + " ");
                    }
                    System.out.println();
                }
            }
        }

        //task 2
        {
            System.out.println("Arrays of arrays task 2:");
            int[][] m = {{1, 2, 3, 4, 5},
                         {1, 2, 3, 4, 5},
                         {1, 2, 3, 4, 5},
                         {1, 2, 3, 4, 5},
                         {0, 2, 3, 4, 4}};
            int a = m.length;
            for (int i = 0; i < a; i++) {
                System.out.print(m[i][i] + " ");
            }
            System.out.println();
        }

        //task 3
        {
            System.out.println("Arrays of arrays task 3:");
            int[][] m = {{1, 2, 3, 4, 5},
                         {1, 2, 3, 4, 5},
                         {1, 2, 3, 3, 5},
                         {1, 2, 3, 4, 5},
                         {0, 2, 3, 4, 4}};
            int k = 0;
            int p = 3;

            for (int i = 0; i < m[k].length; i++) {
                System.out.print(m[k][i] + " ");
            }
            System.out.println();
            for (int i = 0; i < m.length; i++) {
                System.out.print(m[i][p] + " ");
            }
            System.out.println();
        }

        //task 4
        {
            System.out.println("Arrays of arrays task 4:");
            int n = 6;
            int[][] m = new int[n][n];
            for (int i = 0; i < n; i += 2) {
                for (int j = 0; j < n; j++) {
                    m[i][j] = j + 1;
                    m[i + 1][j] = n - j;
                }
            }
            Arrays.stream(m).forEach(r -> System.out.println(Arrays.toString(r)));
        }

        //task 5
        {
            System.out.println("Arrays of arrays task 5:");
            int n = 5;
            int[][] m = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n - i; j++) {
                    m[i][j] = i + 1;
                }
            }
            Arrays.stream(m).forEach(r -> System.out.println(Arrays.toString(r)));
        }

        //task 6
        {
            System.out.println("Arrays of arrays task 6:");
            int n = 6;
            int[][] m = new int[n][n];
            for (int i = 0; i < n / 2; i++) {
                for (int j = i; j < n - i; j++) {
                    m[i][j] = 1;
                }
            }
            for (int i = n / 2; i < n; i++) {
                for (int j = n - i - 1; j < i + 1; j++) {
                    m[i][j] = 1;
                }
            }
            Arrays.stream(m).forEach(r -> System.out.println(Arrays.toString(r)));
        }

        //task 7
        {
            System.out.println("Arrays of arrays task 7:");
            int n = 6;
            double[][] m = new double[n][n];
            int posCount = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    m[i][j] = Math.sin((i * i - j * j) / (double) n);
                    if (m[i][j] > 0) {
                        posCount++;
                    }
                }
            }
            Arrays.stream(m).forEach(r -> System.out.println(Arrays.toString(r)));
            System.out.println("Number of positives: " + posCount);
        }

        //task 8
        {
            System.out.println("Arrays of arrays task 8:");
            int ind1 = 3;
            int ind2 = 4;
            int[][] m = {{1, 2, 3, 4, 5},
                         {1, 2, 3, 4, 5},
                         {1, 2, 3, 3, 5},
                         {1, 2, 3, 4, 5},
                         {0, 2, 3, 4, 4}};

            for (int i = 0; i < m.length; i++) {
                int temp = m[i][ind2];
                m[i][ind2] = m[i][ind1];
                m[i][ind1] = temp;
            }
            Arrays.stream(m).forEach(r -> System.out.println(Arrays.toString(r)));
        }

        //task 9
        {
            System.out.println("Arrays of arrays task 9:");
            int[][] m = {{1, 2, 3, 4, 5},
                         {1, 2, 3, 4, 5},
                         {1, 2, 3, 3, 5},
                         {1, 2, 3, 4, 5},
                         {0, 2, 3, 4, 4}};
            int[] sums = new int[m[0].length];
            int max = 0; //matrix of positives
            int indMax = 0;
            for (int i = 0; i < m[0].length; i++) {
                for (int j = 0; j < m.length; j++) {
                    sums[i] += m[j][i];
                }
                if (sums[i] > max) {
                    max = sums[i];
                    indMax = i;
                }
            }
            System.out.println(Arrays.toString(sums) + "\nColumn with max sum: " + indMax);
        }

        //task 10
        {
            System.out.println("Arrays of arrays task 10:");
            int[][] m = {{1, 2, 3, 4, 5},
                         {1, 2, 3, 4, 5},
                         {1, 2, -3, 3, 5},
                         {1, 2, 3, 4, 5},
                         {0, 2, 3, 4, -4}};
            for (int i = 0; i < m.length; i++) {
                if (m[i][i] > 0) {
                    System.out.print(m[i][i] + " ");
                }
            }
            System.out.println();
        }

        //task 11
        {
            System.out.println("Arrays of arrays task 11:");
            int h = 10;
            int w = 20;
            int[][] m = new int[h][w];
            Random random = new Random();
            for (int i = 0; i < h; i++) {
                int fiveCount = 0;
                for (int j = 0; j < w; j++) {
                    m[i][j] = random.nextInt(16);
                    if (m[i][j] == 5) {
                        fiveCount++;
                    }
                }
                if (fiveCount >= 3) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
            Arrays.stream(m).forEach(r -> System.out.println(Arrays.toString(r)));
        }

        //task 12
        {
            System.out.println("Arrays of arrays task 12:");
            int[][] m = {{1, 2, 3, 9, 5},
                         {1, -2, 3, 4, 5},
                         {3, -2, -3, 3, 3},
                         {1, 2, 3, 4, 5},
                         {0, 2, 3, 4, -4}};
            int h = m.length;
            int w = m[0].length;
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    for (int k = 0; k < w - 1 - j; k++) {
                        if (m[i][k] > m[i][k + 1]) {
                            int t = m[i][k];
                            m[i][k] = m[i][k + 1];
                            m[i][k + 1] = t;
                        }
                    }
                }
            }
            System.out.println("Ascending order:");
            Arrays.stream(m).forEach(r -> System.out.println(Arrays.toString(r)));
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    for (int k = 0; k < w - 1 - j; k++) {
                        if (m[i][k] < m[i][k + 1]) {
                            int t = m[i][k];
                            m[i][k] = m[i][k + 1];
                            m[i][k + 1] = t;
                        }
                    }
                }
            }
            System.out.println("Descending order:");
            Arrays.stream(m).forEach(r -> System.out.println(Arrays.toString(r)));
        }

        //task 13
        {
            System.out.println("Arrays of arrays task 13:");
            int[][] m = {{1, 2, 3, 9, 5},
                    {9, -2, 3, 4, 4},
                    {3, -2, -3, 3, 3},
                    {1, 2, 0, 4, 5},
                    {0, 2, 3, 4, -4}};
            int h = m.length;
            int w = m[0].length;
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    for (int k = 0; k < w - 1 - j; k++) {
                        if (m[k][i] > m[k + 1][i]) {
                            int t = m[k][i];
                            m[k][i] = m[k + 1][i];
                            m[k + 1][i] = t;
                        }
                    }
                }
            }
            System.out.println("Ascending order:");
            Arrays.stream(m).forEach(r -> System.out.println(Arrays.toString(r)));
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    for (int k = 0; k < w - 1 - j; k++) {
                        if (m[k][i] < m[k + 1][i]) {
                            int t = m[k][i];
                            m[k][i] = m[k + 1][i];
                            m[k + 1][i] = t;
                        }
                    }
                }
            }
            System.out.println("Descending order:");
            Arrays.stream(m).forEach(r -> System.out.println(Arrays.toString(r)));
        }

        //task 14
        {
            System.out.println("Arrays of arrays task 14:");
            int m = 7;
            int n = 5;
            int[][] a = new int[m][n];
            Random random = new Random();
            for (int i = 0; i < n; i++) {
                int oneCount = 0;
                while (oneCount < i) {
                    int ind = random.nextInt(m);
                    if (a[ind][i] == 0) {
                        oneCount++;
                        a[ind][i] = 1;
                    }
                }
            }
            Arrays.stream(a).forEach(r -> System.out.println(Arrays.toString(r)));
        }

        //task 15
        {
            System.out.println("Arrays of arrays task 15:");
            int[][] m = {{1, 2, 3, 9, 5},
                    {9, 2, 3, 4, 4},
                    {3, 2, 3, 3, 3},
                    {1, 2, 0, 4, 5},
                    {10, 2, 3, 4, 4}};

            int h = m.length;
            int w = m[0].length;
            int max = m[0][0];
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (m[i][j] > max) {
                        max = m[i][j];
                    }
                }
            }
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (m[i][j] % 2 == 1) {
                        m[i][j] = max;
                    }
                }
            }
            Arrays.stream(m).forEach(r -> System.out.println(Arrays.toString(r)));
        }

        //task 16
        {
            System.out.println("Arrays of arrays task 16:");

            int n = 4;
            int[][] m = new int[n][n];

            int num = 1;
            int row = 0;
            int col = n / 2;

            while (num <= n * n) {
                m[row][col] = num;
                num++;

                int newRow = (row - 1 + n) % n;
                int newCol = (col + 1) % n;

                if (m[newRow][newCol] != 0) {
                    row = (row + 1) % n;
                } else {
                    row = newRow;
                    col = newCol;
                }
            }
            Arrays.stream(m).forEach(r -> System.out.println(Arrays.toString(r)));
        }
    }
}