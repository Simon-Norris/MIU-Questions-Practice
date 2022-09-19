package com.learning.java.Solution;

import static com.learning.java.Solution.Solution9.isSquare;

public class Solution14 {

    public static void doIntegerBasedRounding(int[] a, int n) {
        if ( n <= 0) return;

        for (int i = 0; i < a.length; i++) {
            if (a[i] <= 0) continue;
            int val = (a[i] / n) * n;
            if (Math.abs(a[i] - val) < Math.abs(a[i] - val - n)) a[i] = val;
            else a[i] = val + n;
        }
    }

    public static int isCubePowerful (int n) {
        if ( n <= 0) return 0;
        int sum = 0, num = n;
        while (num != 0) {
            int r = num % 10;
            sum +=  (r * r * r);
            num = num / 10;
        }

        if (sum == n) return 1;
        return 0;
    }

    public static int decodeArray (int[] a) {
        int result =0, mult = 1;

        for (int i = a.length-1; i - 1 >= 0; i--) {
            int diff = Math.abs(a[i-1] - a[i]);
            result += diff * mult;
            mult *= 10;
        }

        if (a[0] < 0) return -result;
        return result;
    }

    public static int isZeroPlentiful(int[] a) {
        if (a == null || a.length == 0) return 0;

        int i = 0, found = 0;
        while (i < a.length) {
            if (a[i] == 0) {
                int j = i;
                int count = 0;
                while (j < a.length && a[j] == 0) {
                    count++;
                    j++;
                }
                if (count < 4) return 0;
                i = j; found++;
            } else {
                i++;
            }
        }

        return found;
    }

    public static int is235Array(int[] a) {
        int by2 = 0, by3 =0, by5 = 0, byNone = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                by2++;
                if (a[i] % 3 == 0) by3++;
                if (a[i] % 5 == 0) by5++;
            } else if (a[i] % 3 == 0) {
                by3++;
                if (a[i] % 2 == 0) by2++;
                if (a[i] % 5 == 0) by5++;
            } else if (a[i] % 5 == 0) {
                by5++;
                if (a[i] % 2 == 0) by2++;
                if (a[i] % 3 == 0) by3++;
            } else byNone++;
        }
        if (by2+by3+by5+byNone == a.length) return 1;
        return 0;
    }

    public static int isTriangular(int n) {
        int sum = 0;
        for (int i = 1; ; i++) {
            sum += i;
            if (sum == n) return 1;
            if (sum > n) break;
        }
        return 0;
    }

    public static int isMercurial(int[] a) {
        int i =0;
        boolean firstOne = false, mid3 = false, lastOne = false;
        while (i < a.length) {
            if (a[i] == 1) {
                firstOne = true;
                break;
            }
            i++;
        }
        if (!firstOne) return 1;

        while (i+1 < a.length) {
            if (a[i] == 3) {
                mid3 = true;
                break;
            }
            i++;
        }
        if (!mid3) return 1;

        while (i+1 < a.length){
            if (a[i+1] == 1) {
                lastOne = true;
                break;
            }
            i++;
        }
        if (lastOne) return 0;
        return 1;
    }

    public static int isFibonacci (int n) {
        if ( n <= 0) return 0;
        if (n == 1) return 1;
        int prev = 1;
        int current = 1;
        for (int i = 0; ; i++) {
            int sum = prev + current;
            if (sum == n) return 1;
            if (sum > n) break;
            prev = current;
            current = sum;
        }
        return 0;
    }

    public static int isVesuvian(int n) {

        int count = 0;
        int first = 1;
        int second = n-1;
        while (first <= second){
            if (isSquare(first) == 1 && isSquare(second) == 1) {
                count++;
                if (count > 1) return 1;
            }
            first++;
            second--;
        }
        return 0;
    }

    public static int isOneBalanced(int[] a) {
        int begin1 = 0, end1= 0, nonZero = 0;
        int i=0;
        while (i < a.length) {
            if (a[i] == 1) {
                begin1++;
                i++;
            } else break;
        }
        while (i < a.length) {
            if (a[i] != 1) {
                nonZero++;
                i++;
            } else break;
        }
        while (i < a.length) {
            if (a[i] == 1) {
                end1++;
                i++;
                for (int j = i; j < a.length; j++) {
                    if (a[j] != 1) return 0;
                }
            } else break;
        }

        if (begin1 + end1 == nonZero) return 1;
        return 0;
    }

    public static int closestFibonacciNumber(int n) {
        if ( n < 1) return 0;
        int prev = 1;
        int current = 1;
        for (int i = 0; i < n; i++) {
            int sum = prev + current;
            prev = current;
            current = sum;
            if (sum >= n) break;
        }
       if (current == n) return current;
       else return prev;
    }

    public static int areAnagrams(char [ ] a1, char [ ] a2){

        int[] count1 = new int[a1.length];
        for (int i = 0; i < a1.length; i++) {
            char ch = a1[i];
            int j = 0;
            int countCharacter = 0;
            while (j < a1.length) {
                if (a1[j] == ch) countCharacter++;
                j++;
            }
            count1[i] = countCharacter;
        }

        int[] count2 = new int[a2.length];
        for (int i = 0; i < a2.length; i++) {
            char ch = a2[i];
            int j = 0;
            int countCharacter = 0;
            while (j < a2.length) {
                if (a2[j] == ch) countCharacter++;
                j++;
            }
            count2[i] = countCharacter;
        }
        for (int i = 0; i < a1.length; i++) {
            char ch = a1[i];
            int chCount = count1[i];
            int chFound = 0;
            for (int j = 0; j < a2.length; j++) {
                char ch2 = a2[j];
                int chCount2 = count2[j];
                if (ch == ch2) {
                    chFound = 1;
                    if (chCount != chCount2) return 0;
                    else break;
                }
            }
            if (chFound == 0) return 0;
        }
        return 1;
    }

    public static int isHodder(int n) {
        if ( n <= 1) return 0;
        if (isPrime(n) == 1) {
            int i =0;
            int calc = power(2, i) - 1;
            while (calc <= n) {
                calc = power(2, i) - 1;
                if (calc == n) return 1;
                i++;
            }
        }
        return 0;
    }

    private static int power(int base, int exp) {
        if (exp == 0) return 1;
        int result = 1;
        while (exp != 0) {
            result = result * base;
            exp--;
        }
        return result;
    }

    private static int isPrime(int n) {
        if ( n <= 1) return 0;
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                return 0;
            }
        }
        return 1;
    }

    public static int largestDifferenceOfEvens(int[ ] a){
        if ( a == null || a.length == 0) return -1;
        int countEvens  = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) countEvens++;
        }
        if (countEvens < 2) return -1;

        int j = 0;
        int minEven = 0;
        int maxEven = 0;
        while (j < a.length) {
            if (a[j] % 2 == 0){
                minEven = a[j];
                maxEven = a[j];
                break;
            }
            j++;
        }
        for (int i = 0; i < a.length; i++) {
            if ( a[i] % 2  == 0) {
                if (a[i] < minEven) {
                    minEven = a[i];
                }
                if (a[i] > maxEven) {
                    maxEven = a[i];
                }
            }
        }
        return maxEven - minEven;
    }

    public static int isFactorialPrime(int n){
        if ( n < 1) return 0;
        if ( isPrime(n) == 1 ){
            for (int i = 1; i < n ; i++) {
                int calc = factorial(i) + 1;
                if (calc == n) return 1;
                if (calc > n) break;
            }
        }
        return 0;
    }

    private static int factorial(int n) {
        if ( n == 1) {
            return 1;
        }
        return n * factorial(n-1);
    }

    public static int systematicallyIncreasing(int[] a) {
        if (a == null || a.length == 0) return 0;
        for (int i = 1; i <= a[a.length-1]; i++) {
            int m = 0;
            for (int j = 1; j <= i; j++) {
                for (int k = 1; k <= j; k++) {
                    if (a[m] != k) return 0;
                    m++;
                }
            }
        }
        return 1;
    }

    public static int[] encodeArray(int n) {
        if ( n == 0) return new int[]{1};
        int digit = n;
        if (digit < 0) {
            digit = Math.abs(digit);
        }
        int count = 0;
        while (digit != 0) {
            int r = digit % 10;
            count += r + 1;
            digit = digit / 10;
        }
        digit = n;
        int[] a;
        if (digit < 0){
            a = new int[count+1];
            a[0] = -1;
            digit = Math.abs(digit);
        } else {
            a = new int[count];
        }
        int k = a.length - 1;
        while (digit != 0) {
            int r = digit % 10;
            a[k] = 1;
            k--;
            while (r != 0) {
                a[k--] = 0;
                r--;
            }
            digit = digit / 10;
        }
        return a;
    }

    public static int isPrimeHappy(int n){
        if ( n < 2) return 0;
        int sumOfAllPrime = 0;
        int flag = 0;
        for (int i = 1; i < n; i++) {
            if (isPrime(i) == 1) {
                flag = 1;
                sumOfAllPrime += i;
            }
        }
        if (flag == 0 || sumOfAllPrime % n != 0) return 0;
        return 1;
    }

    public static int isOnionArray(int[] a){

        int j = 0, k = a.length -1;

        while (j < k) {
            if (a[j] + a[k] > 10) return 0;
            j++;k--;
        }
        return 1;
    }

    public static int decodeArrayAnother(int[] a){
        int multiplier = 1, digit = 0;
        for (int i = a.length-2; i >= 0;) {
            int numZero = 0, j = i;
            while ( j >= 0 && a[j] == 0) {
                numZero++;
                j--;
            }
            digit += multiplier * numZero;
            multiplier *= 10;
            i = j;
            i--;
        }
        return (a[0] < 0) ? -digit : digit;
    }
}
