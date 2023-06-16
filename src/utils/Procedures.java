package utils;

import java.util.ArrayList;

public class Procedures {
    //task 1
    public static int findGreatestCommonDivider(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int findLeastCommonMultiple(int a, int b) {
        int gcd = findGreatestCommonDivider(a, b);
        return (a * b) / gcd;
    }

    //task 2
    public static int findGreatestCommonDividerForFour(int a, int b, int c, int d) {
        int gcd1 = findGreatestCommonDivider(a, b);
        int gcd2 = findGreatestCommonDivider(c, d);
        return findGreatestCommonDivider(gcd1 , gcd2);
    }

    //task 3
    public static double findHexagonArea(double a) {
        return 3 * Math.sqrt(3) * a * a / 2;
    }

    //task 4
    public static double findDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }

    public static double[][] furthestPoints(double[][] allPoints) {
        double dist = 0;
        int ind1 = 0;
        int ind2 = 0;
        double[][] resultPair = new double[2][2];
        for (int i = 0; i < allPoints.length - 1; i++) {
            for (int j = i + 1; j < allPoints.length; j++) {
                double currDist = findDistance(allPoints[i][0], allPoints[i][1], allPoints[j][0], allPoints[j][1]);
                if (currDist > dist) {
                    dist = currDist;
                    ind1 = i;
                    ind2 = j;
                }
            }
        }
        resultPair[0] = allPoints[ind1];
        resultPair[1] = allPoints[ind2];
        return resultPair;
    }

    //task 5
    public static int getSecondMax(int[] a) {
        int max = a[0];
        int prevMax = max;
        for (int j : a) {
            if (j > max) {
                prevMax = max;
                max = j;
            }
        }
        return prevMax;
    }

    //task 6
    public static boolean checkIfCoPrime(int a, int b, int c) {
        int gcd = findGreatestCommonDivider(a, b);
        return findGreatestCommonDivider(gcd, c) == 1;
    }

    //task 7
    public static int getOddDigitsFactorialsSum() {
        int result = 1;
        int term = 1;
        for (int i = 3; i <= 9; i += 2) {
            term *= i * (i - 1);
            result += term;
        }
        return result;
    }

    //task 8
    public static int[] getSumsOfThree(int[] a, int k, int m) {
        if (m - k < 2) {
            return new int[]{};
        }
        int[] result = new int[m - k - 1];
        for (int i = 0; i < result.length; i++) {
            result[i] = a[k + i] + a[k + i + 1] + a[k + i + 2];
        }
        return result;
    }

    //task 9
    public static double getArea(int x, int y, int z, int t) {
        double s1 = x * y / 2.0;
        double zt = Math.sqrt(x * x + y * y);
        double p = (z + t + zt) / 2.0;
        double s2 = Math.sqrt(p * (p - z) * (p - t) * (p - zt));
        return s1 + s2;
    }

    //task 10
    public static void flip(ArrayList<Integer> list) {
        int size = list.size();
        for (int i = 0; i < size / 2; i++) {
            Integer temp = list.get(i);
            list.set(i, list.get(size - 1 - i));
            list.set(size - 1 - i, temp);
        }
    }

    public static ArrayList<Integer> splitDigits(int x) {
        ArrayList<Integer> digits = new ArrayList<>();
        while (x > 0) {
            digits.add(x % 10);
            x /= 10;
        }
        flip(digits);
        return digits;
    }

    //task 11
    public static int getMoreSized(int x, int y) {
        while (x > 0 && y > 0) {
            x /= 10;
            y /= 10;
        }
        return y > 0 ? y : x;
    }

    //task 12
    public static ArrayList<Integer> generateArray(int K, int N) {
        ArrayList<Integer> A = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            if (sumOfDigits(i) == K) {
                A.add(i);
            }
        }
        return A;
    }

    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    //task 13
    public static void printTwinPrimes(int n) {
        int start = n;
        int end = 2 * n;

        ArrayList<Integer> twinPrimes = findTwinPrimes(start, end);

        if (twinPrimes.isEmpty()) {
            System.out.println("No twin primes found in the range [" + start + ", " + end + "]");
        } else {
            System.out.println("Twin primes in the range [" + start + ", " + end + "]:");
            for (int i = 0; i < twinPrimes.size(); i += 2) {
                System.out.println(twinPrimes.get(i) + " and " + twinPrimes.get(i + 1));
            }
        }
    }

    public static ArrayList<Integer> findTwinPrimes(int start, int end) {
        ArrayList<Integer> twinPrimes = new ArrayList<>();

        for (int i = start; i <= end - 2; i++) {
            if (isPrime(i) && isPrime(i + 2)) {
                twinPrimes.add(i);
                twinPrimes.add(i + 2);
            }
        }

        return twinPrimes;
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    //task 14
    public static ArrayList<Integer> findArmstrongNumbers(int k) {
        ArrayList<Integer> armstrongNumbers = new ArrayList<>();

        for (int number = 1; number <= k; number++) {
            if (isArmstrongNumber(number)) {
                armstrongNumbers.add(number);
            }
        }

        return armstrongNumbers;
    }

    public static boolean isArmstrongNumber(int number) {
        int sum = 0;
        int originalNumber = number;
        int digits = countDigits(number);

        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, digits);
            number /= 10;
        }

        return sum == originalNumber;
    }

    public static int countDigits(int number) {
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        return count;
    }

    //task 15
    public static ArrayList<Integer> findIncreasingNumbers(int n) {
        ArrayList<Integer> increasingNumbers = new ArrayList<>();

        int minNumber = (int) Math.pow(10, n - 1);
        int maxNumber = (int) Math.pow(10, n) - 1;

        for (int number = minNumber; number <= maxNumber; number++) {
            if (isIncreasing(number)) {
                increasingNumbers.add(number);
            }
        }

        return increasingNumbers;
    }

    public static boolean isIncreasing(int number) {
        int previousDigit = number % 10;
        number /= 10;

        while (number > 0) {
            int currentDigit = number % 10;
            if (currentDigit >= previousDigit) {
                return false;
            }
            previousDigit = currentDigit;
            number /= 10;
        }

        return true;
    }

    //task 16
    public static int findOddDigitSum(int n) {
        int minNumber = (int) Math.pow(10, n - 1);
        int maxNumber = (int) Math.pow(10, n) - 1;
        int sum = 0;

        for (int number = minNumber; number <= maxNumber; number++) {
            if (hasOnlyOddDigits(number)) {
                sum += number;
            }
        }

        return sum;
    }

    public static boolean hasOnlyOddDigits(int number) {
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                return false;
            }
            number /= 10;
        }

        return true;
    }

    public static int countEvenDigits(int number) {
        int count = 0;

        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                count++;
            }
            number /= 10;
        }

        return count;
    }

}
