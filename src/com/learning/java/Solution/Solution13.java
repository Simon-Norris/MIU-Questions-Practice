package com.learning.java.Solution;

public class Solution13 {

    public static int isRailRoadTie(int[] a) {
        if ( a == null || a.length <= 1) return 0;

        boolean hasNonZero = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) hasNonZero = true; break;
        }

        if (!hasNonZero) return 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                if ( i == 0) {
                    if (a[i+1] == 0) return 0;
                } else if ( i == a.length -1) {
                    if (a[i-1] == 0) return 0;
                } else {
                    if ((a[i+1] == 0 && a[i-1] == 0) || (a[i+1] != 0 && a[i-1] != 0)) return 0;
                }
            } else {
                if ( i == 0) return 0;
                else if ( i == a.length -1) return 0;
                else {
                    if ((a[i+1] == 0 || a[i-1] == 0)) return 0;
                }
            }
        }
        return 1;
    }

    public static int fullnessQuotient(int n) {
        if ( n < 1) return -1;
        int count = 0;
        for (int i = 2; i <= 9; i++) {
            int num = n;
            boolean zeroFound = false;
            while (num != 0) {
                int rem = num % i;
                if (rem == 0) {
                    zeroFound = true;
                    break;
                }
                num = num / i;
            }
            if (!zeroFound) count++;
        }
        return count;
    }

    public static int isPacked(int[] a) {
        int  i =0;
        while (i < a.length) {
            if (a[i] < 0) return 0;
            int k = i;
            int count = 1;
            while (k+1 < a.length && a[k] == a[k+1]) {
                count++;
                k++;
            }
            if (a[i] != count) return 0;
            i =k+1;
        }
        return 1;
    }

    public static int isOddHeavy(int[] a) {
        if (a == null || a.length == 0) return 0;

        boolean hasOdd = false;

        for (int i = 0; i < a.length; i++) {
           if (a[i] % 2 != 0) {
               hasOdd = true;
               break;
           }
        }
        if (!hasOdd) return 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                for (int j = 0; j < a.length; j++) {
                    if (a[j] % 2 == 0) {
                        if (a[j] > a[i]) return 0;
                    }
                }
            }
        }

        return 1;
    }

    public static int getExponent(int n, int p) {
        if ( p <= 1) return -1;
        int large = 0;
        for (int i = 0;  ; i++) {
            int res = power(p,i);
            if (n % res == 0) {
                large = i;
            }
            if (res > Math.abs(n)) break;
        }
        return large;
    }

    private static int power(int base, int exp) {
        if (exp == 0) return 1;

        int result = 1;
        for (int i = 1; i <= exp; i++) {
            result = result * base;
        }
        return result;
    }

    public static int[] filterArray(int[] a, int n) {
        if (a == null) return null;
        else if (a.length == 0 || n <= 0) return new int[]{};

        int count1 = 0;
        int num = n;
        int j=0;
        while (num != 0) {
            if ( num % 2 == 1) count1++;
            j++;
            num = num / 2;
        }

        if (a.length < j) return null;

        int[] result = new int[count1];
        int k = 0;
        int i=0;
        while (n != 0) {
            if ( n % 2 == 1) result[k++] = a[i];
            i++;
            n=n/2;
        }

        return result;
    }

    public static int checkConcatenatedSum(int n, int catLen){
        int sum = 0, num = n;
        while (n != 0) {
            int rem = n % 10;
            sum += concat(rem, catLen);
            n = n / 10;
        }
        if (sum == num) return 1;
        return 0;
    }

    private static int concat(int num, int len) {
        int multiple = 1, result = 0;
        for (int i = 0; i < len; i++) {
            result += multiple * num;
            multiple *= 10;
        }
        return result;
    }

    public static int isSequencedArray (int[] a, int m, int n) {
        if ( a == null || a.length == 0 || (m == 0 && n== 0) || n < m) return 0;
        int count = 1;
        int prev = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] == prev) continue;
            else {
                if (a[i] < prev) return 0;
                a[count] = a[i];
                prev = a[count];
                count++;
            }
        }
        count = 0;
        for (int i = m; i <= n ; i++) {
           if (count >= a.length || i != a[count]) return 0;
           count++;
        }
        return 1;
    }

    private static int isPrime (int num) {
        if ( num <= 1) return 0;
        int flag = 1;
        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0) {
                flag = 0;
                break;
            }
        }
        return flag;
    }
    public static int largestPrimeFactor (int n) {
        if ( n <= 1) return 0;
        int largest = 1;
        for (int i = 2; i <= n/2; i++) {
            if ( n % i == 0) {
                if (isPrime(i) == 1) largest = i;
            }
        }
        return largest;
    }

    public static int[] encodeNumber(int n) {
        if ( n <= 1) return null;

        int count = 0;
        int num = n;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0 && isPrime(i) == 1) {
                while (num % i == 0) {
                    count++;
                    num = num / i;
                }
            }
        }

        int[] arr = new int[count];
        count = 0;
        num = n;
        for (int i = 1; i <= num ; i++) {
            if (num % i == 0 && isPrime(i) == 1)
                while (num % i == 0) {
                    arr[count++] = i;
                    num = num / i;
                }
        }
        return arr;
    }

    public static int matchPattern(int[] a, int len, int[] pattern, int patternLen) {
        int i = 0, k = 0, matches = 0;
        for (i = 0; i < len; i++) {
            if (a[i] == pattern[k]) {
                matches++;
            } else if (matches == 0 || k == patternLen - 1) {
                return 0;
            } else {
                k++;
                if (a[i] == pattern[k]) matches++;
                else return 0;
            }
        }
        if (i == len && k == patternLen - 1) {
            return 1;
        } else {
            return 0;
        }
    }
}
