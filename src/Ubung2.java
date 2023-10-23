public class Ubung2 {
    //a1
    public static int max(int[] array) throws IllegalAccessException {
        if (array.length == 0) {
            throw new IllegalAccessException("empty array");
        }
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;

    }

    //a2
    public static int min(int[] array) throws IllegalAccessException {
        if (array.length == 0) {
            throw new IllegalAccessException("empty array");
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;

    }

    //    a3
    public static int max_Sum(int[] array) throws IllegalAccessException {
        if (array.length == 0) {
            throw new IllegalAccessException("empty array");
        }
        int min = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[min]) {
                min = i;
            }
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (i != min) {
                sum = sum + array[i];
            }
        }
        return sum;

    }

    //a4
    public static int min_Sum(int[] array) throws IllegalAccessException {
        if (array.length == 0) {
            throw new IllegalAccessException("empty array");
        }
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[max]) {
                max = i;
            }
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (i != max) {
                sum = sum + array[i];
            }
        }
        return sum;

    }


}
