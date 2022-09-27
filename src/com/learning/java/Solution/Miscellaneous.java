package com.learning.java.Solution;

public class Miscellaneous {

    public static int addBinary(int first, int second) {
        int sum = convertToDecimal(first) + convertToDecimal(second);
        return toBinary(sum);
    }

    private static int convertToDecimal(int n) {
        int num = n, sum = 0;
        int count = 0;
        while (num != 0) {
            int r = num % 10;
            int val = r * power(2, count);
            sum += val;
            count++;
            num = num / 10;
        }
        return sum;
    }

    private static int power(int x, int y) {
        int res = 1;
        while (y != 0){
            res = x * res;
            y--;
        }
        return res;
    }

    private static int toBinary(int n) {
        int digit = 0, multiplier = 1;
        int num = n;
        while (num != 0) {
            int rem = num % 2;
            digit += multiplier * rem;
            multiplier *= 10;
            num = num / 2;
        }
        return digit;
    }

    public static String convertToHex(int  n) {
        String digit = "";
        char[] hex = new char[]{'0','1','2','3','4','5','6','7','8','9','A', 'B', 'C', 'D', 'E', 'F'};
        while (n != 0) {
            int rem = n % 16;
            digit = hex[rem] + digit;
            n = n / 16;
        }
        return digit;
    }

    public static int nSequenceSum(int n){
        int total = 0, mult =1, sum = 0 ;
        for (int i = 0; i < 3; i++) {
            sum += n * mult;
            total += sum;
            mult *= 10;
        }
        return total;
    }

    private static int stringToInt(String str){
        return Integer.parseInt(str);
    }
    public static String secondToHMS(int seconds){
        int hour = seconds / 3600;
        int rem = seconds % 3600;
        int minutes = rem / 60;
        int sec = rem % 60;
        return (hour+"H:"+minutes+"M:"+sec+"S");
    }
}
