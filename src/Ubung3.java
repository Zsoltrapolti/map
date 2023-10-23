public class Ubung3 {
    public static int[] add(int[] num1, int[] num2) throws IllegalAccessException {
        if(num1.length == 0) {
            throw new IllegalAccessException("empty array");

        }
        if(num2.length == 0) {
            throw new IllegalAccessException("empty array");
        }
        int carry = 0;
        int n = num1.length;
        int[] result = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            int sum = num1[i] + num2[i] + carry;
            result[i] = sum % 10;
            carry = sum / 10;
        }

        if (carry > 0) {
            int[] extendedResult = new int[n + 1];
            extendedResult[0] = carry;
            System.arraycopy(result, 0, extendedResult, 1, n);
            return extendedResult;
        }

        return result;
    }

    public static int[] subtract(int[] num1, int[] num2) throws IllegalAccessException {
        if(num1.length == 0) {
            throw new IllegalAccessException("empty array");

        }
        if(num2.length == 0) {
            throw new IllegalAccessException("empty array");
        }
        int borrow = 0;
        int n = num1.length;
        int[] result = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            int diff = num1[i] - num2[i] - borrow;
            if (diff < 0) {
                diff += 10;
                borrow = 1;
            } else {
                borrow = 0;
            }
            result[i] = diff;
        }

        return result;
    }

    public static int[] multiply(int[] num1, int digit) throws IllegalAccessException {
        if(num1.length == 0) {
            throw new IllegalAccessException("empty array");

        }
        int n = num1.length;
        int carry = 0;
        int[] result = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            int product = num1[i] * digit + carry;
            result[i] = product % 10;
            carry = product / 10;
        }

        if (carry > 0) {
            int[] extendedResult = new int[n + 1];
            extendedResult[0] = carry;
            System.arraycopy(result, 0, extendedResult, 1, n);
            return extendedResult;
        }

        return result;
    }

    public static int[] divide(int[] num1, int digit) throws IllegalAccessException {
        if(num1.length == 0) {
            throw new IllegalAccessException("empty array");

        }
        int n = num1.length;
        int remainder = 0;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            int dividend = num1[i] + remainder * 10;
            result[i] = dividend / digit;
            remainder = dividend % digit;
        }

        return result;
    }




}
