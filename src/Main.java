import utils.BinarySearch;
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

        //-------------------------One-dimensional arrays, sorts-------------------------

        //task 1
        {
            ArrayList<Integer> a1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
            ArrayList<Integer> a2 = new ArrayList<>(Arrays.asList(111, 7, 8, 9, 10));
            int a1Len = a1.size();
            int a2Len = a2.size();
            int k = 3;
            for (int i = 0; i < a2Len; i++) {
                a1.add(0);
            }
            for (int i = 1; i < a1Len - k; i++) {
                a1.set(a1Len + a2Len - k + i, a1.get(k + i));
            }
            for (int i = 0; i < a2Len; i++) {
                a1.set(k + i + 1, a2.get(i));
            }

            System.out.println("One-dimensional arrays, sorts task 1:\n" + Arrays.toString(a1.toArray()));
        }

        //task 2
        {
            ArrayList<Integer> a1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 11));
            ArrayList<Integer> a2 = new ArrayList<>(Arrays.asList(1, 3, 4, 4, 10, 12));
            int a1Len = a1.size();
            int a2Len = a2.size();
            for (int i = 0; i < a2Len; i++) {
                a1.add(0);
            }
            for (int i = 0, j = 0; i < a2Len + a1Len && j < a2Len; i++) {
                if (a2.get(j) < a1.get(i) || (i == a1Len + j)) {
                    for (int k = a1Len + j; k >= i; k--) {
                        a1.set(k, a1.get(k - 1));
                    }
                    a1.set(i, a2.get(j));
                    j++;
                }
            }

            System.out.println("One-dimensional arrays, sorts task 2:\n" + Arrays.toString(a1.toArray()));
        }

        //task 3
        {
            int[] a = {9, 3, 3, 1, 2, 5, 4, 10, 0};
            for (int i = 0; i < a.length; i++) {
                int max = a[i];
                int maxInd = i;
                for (int j = i + 1; j < a.length; j++) {
                    if (a[j] > max) {
                        max = a[j];
                        maxInd = j;
                    }
                }
                a[maxInd] = a[i];
                a[i] = max;
            }
            System.out.println("One-dimensional arrays, sorts task 3:\n" + Arrays.toString(a));
        }

        //task 4
        {
            int[] a = {9, 3, 3, 1, 2, 5, 4, 10, 0};
            int swaps = 0;
            for (int i = 0; i < a.length; i++) {
                for (int j = 1; j < a.length - i; j++) {
                    if (a[j] < a[j - 1]) {
                        swaps++;
                        int temp = a[j];
                        a[j] = a[j - 1];
                        a[j - 1] = temp;
                    }
                }
            }
            System.out.println("One-dimensional arrays, sorts task 4:\n" + Arrays.toString(a) + " swaps: " + swaps);
        }
        //task 5
        {
            int[] a = {9, 3, 3, 1, 2, 5, 4, 10, 0};
            for (int i = 1; i < a.length; i++) {
                int ind = BinarySearch.search(Arrays.copyOfRange(a, 0, i), a[i]);
                int temp = a[i];
                for (int j = i; j > ind; j--) {
                    a[j] = a[j - 1];
                }
                a[ind] = temp;
            }
            System.out.println("One-dimensional arrays, sorts task 5:\n" + Arrays.toString(a));
        }

        //task 6
        {
            int[] a = {9, 3, 3, 1, 2, 5, 4, 10, 0};
            for (int i = 1; i < a.length;) {
                if (i == 0 || a[i - 1] <= a[i]) {
                    i++;
                } else {
                    int t = a[i];
                    a[i] = a[i - 1];
                    a[i - 1] = t;
                    i--;
                }
            }
            System.out.println("One-dimensional arrays, sorts task 6:\n" + Arrays.toString(a));
        }

        //task 7
        {
            System.out.println("One-dimensional arrays, sorts task 7:");
            int[] a = {1, 5, 10, 12, 13, 13, 15};
            int[] b = {2, 2, 4, 6, 6, 10, 12, 14, 16};
            for (int i = 0; i < b.length; i++) {
                int ind = BinarySearch.search(a, b[i]);
                System.out.print(ind + " ");
            }
            System.out.println();
        }

        //task 8
        {
            System.out.println("One-dimensional arrays, sorts task 8:");
            int[][] m = {{1, 3}, {1, 2}, {3, 5}, {7, 9}, {1, 13}, {23, 26}};
            int lcm = m[0][1];
            for (int i = 1; i < m.length; i++) {
                int currentDenominator = m[i][1];
                int a = lcm;
                int b = currentDenominator;
                while (b != 0) {
                    int temp = b;
                    b = a % b;
                    a = temp;
                }
                lcm = (lcm * currentDenominator) / a;
            }
            for (int[] fraction : m) {
                int newNumerator = fraction[0] * (lcm / fraction[1]);
                fraction[0] = newNumerator;
                fraction[1] = lcm;
            }

            for (int i = 1; i < m.length;) {
                if (i == 0 || m[i - 1][0] <= m[i][0]) {
                    i++;
                } else {
                    int t = m[i][0];
                    m[i][0] = m[i - 1][0];
                    m[i - 1][0] = t;
                    i--;
                }
            }

            Arrays.stream(m).forEach(r -> System.out.println(r[0] + " / " + r[1] + " "));
        }

        //---------------------------Strings---------------------------------

        //task 1
        {
            String[] camelCase = {"myVariable", "someValue", "anotherExample"};
            String[] snakeCase = new String[camelCase.length];

            for (int i = 0; i < camelCase.length; i++) {
                StringBuilder snakeCaseBuilder = new StringBuilder();

                for (char c : camelCase[i].toCharArray()) {
                    if (Character.isUpperCase(c)) {
                        snakeCaseBuilder.append("_");
                        snakeCaseBuilder.append(Character.toLowerCase(c));
                    } else {
                        snakeCaseBuilder.append(c);
                    }
                }

                snakeCase[i] = snakeCaseBuilder.toString();
            }

            System.out.println("String as character array - Task 1:");
            System.out.println("CamelCase: " + Arrays.toString(camelCase));
            System.out.println("SnakeCase: " + Arrays.toString(snakeCase));
        }

        //task 2
        {
            String text = "This is a word and another word";
            String replacedText = text.replaceAll("word", "letter");

            System.out.println("\nString as character array - Task 2:");
            System.out.println("Original text: " + text);
            System.out.println("Replaced text: " + replacedText);
        }

        //task 3
        {
            String text = "Hello123World456";
            int digitCount = 0;

            for (char c : text.toCharArray()) {
                if (Character.isDigit(c)) {
                    digitCount++;
                }
            }

            System.out.println("\nString as character array - Task 3:");
            System.out.println("Text: " + text);
            System.out.println("Digit count: " + digitCount);
        }

        //task 4
        {
            String text = "There are 3 numbers in this sentence: 123, 45, and 6789";
            String[] numbers = text.split("\\D+");

            System.out.println("\nString as character array - Task 4:");
            System.out.println("Text: " + text);
            System.out.println("Number count: " + (numbers.length - 1));
        }

        //task 5
        {
            String text = "   Remove   extra   spaces    from   this   string.   ";
            String trimmedText = text.trim().replaceAll("\\s+", " ");

            System.out.println("\nString as character array - Task 5:");
            System.out.println("Original text: \"" + text + "\"");
            System.out.println("Trimmed text: \"" + trimmedText + "\"");
        }

        //String and StringBuilder

        //task 1
        {
            String text = "This   text    has   multiple    spaces.";
            int maxConsecutiveSpaces = 0;
            int currentConsecutiveSpaces = 0;

            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == ' ') {
                    currentConsecutiveSpaces++;
                    if (currentConsecutiveSpaces > maxConsecutiveSpaces) {
                        maxConsecutiveSpaces = currentConsecutiveSpaces;
                    }
                } else {
                    currentConsecutiveSpaces = 0;
                }
            }

            System.out.println("\nString as String or StringBuilder - Task 1:");
            System.out.println("Text: " + text);
            System.out.println("Max consecutive spaces: " + maxConsecutiveSpaces);
        }

        //task 2
        {
            String text = "abcde";
            StringBuilder modifiedText = new StringBuilder();

            for (int i = 0; i < text.length(); i++) {
                modifiedText.append(text.charAt(i));
                if (text.charAt(i) == 'a') {
                    modifiedText.append('b');
                }
            }

            System.out.println("\nString as String or StringBuilder - Task 2:");
            System.out.println("Original text: " + text);
            System.out.println("Modified text: " + modifiedText);
        }

        //task 3
        {
            String word = "level";
            boolean isPalindrome = true;

            for (int i = 0; i < word.length() / 2; i++) {
                if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                    isPalindrome = false;
                    break;
                }
            }

            System.out.println("\nString as String or StringBuilder - Task 3:");
            System.out.println("Word: " + word);
            System.out.println("Is palindrome: " + isPalindrome);
        }

        //task 4
        {
            String originalWord = "информатика";
            String newWord = originalWord.substring(7, 8) + originalWord.substring(3, 5)
                    + originalWord.substring(7, 8);

            System.out.println("\nString as String or StringBuilder - Task 4:");
            System.out.println("Original word: " + originalWord);
            System.out.println("New word: " + newWord);
        }

        //task 5
        {
            String text = "There are several 'a' characters in this sentence.";
            int count = 0;

            for (char c : text.toCharArray()) {
                if (c == 'a') {
                    count++;
                }
            }

            System.out.println("\nString as String or StringBuilder - Task 5:");
            System.out.println("Text: " + text);
            System.out.println("Count of 'a': " + count);
        }

        //task 6
        {
            String text = "Hello";
            StringBuilder doubledText = new StringBuilder();

            for (int i = 0; i < text.length(); i++) {
                doubledText.append(text.charAt(i));
                doubledText.append(text.charAt(i));
            }

            System.out.println("\nString as String or StringBuilder - Task 6:");
            System.out.println("Original text: " + text);
            System.out.println("Doubled text: " + doubledText);
        }

        //task 7
        {
            String text = "abc cde def";
            StringBuilder uniqueChars = new StringBuilder();

            for (char c : text.toCharArray()) {
                if (c != ' ' && uniqueChars.indexOf(Character.toString(c)) == -1) {
                    uniqueChars.append(c);
                }
            }

            System.out.println("\nString as String or StringBuilder - Task 7:");
            System.out.println("Original text: " + text);
            System.out.println("Modified text: " + uniqueChars);
        }

        //task 8
        {
            String text = "This is a sample sentence with multiple words";
            String[] words = text.split(" ");
            String longestWord = "";

            for (String word : words) {
                if (word.length() > longestWord.length()) {
                    longestWord = word;
                }
            }

            System.out.println("\nString as String or StringBuilder - Task 8:");
            System.out.println("Original text: " + text);
            System.out.println("Longest word: " + longestWord);
        }

        //task 9
        {
            String text = "This is a Sample Text with UPPERCASE and lowercase letters.";
            int lowercaseCount = 0;
            int uppercaseCount = 0;

            for (char c : text.toCharArray()) {
                if (c >= 'a' && c <= 'z') {
                    lowercaseCount++;
                } else if (c >= 'A' && c <= 'Z') {
                    uppercaseCount++;
                }
            }

            System.out.println("\nString as String or StringBuilder - Task 9:");
            System.out.println("Text: " + text);
            System.out.println("Lowercase count: " + lowercaseCount);
            System.out.println("Uppercase count: " + uppercaseCount);
        }

        //task 10
        {
            String text = "This is the first sentence. And here is the second one! What about a third?";
            String[] sentences = text.split("[.!?]+");
            int sentenceCount = sentences.length;

            System.out.println("\nString as String or StringBuilder - Task 10:");
            System.out.println("Text: " + text);
            System.out.println("Sentence count: " + sentenceCount);
        }
    }
}