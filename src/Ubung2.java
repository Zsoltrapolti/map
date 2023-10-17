public class Ubung2 {
    //a1
    public static int max(int[] array, int n) {
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;

    }

    //a2
    public static int min(int[] array, int n) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;

    }

    //    a3
    public static int max_Sum(int[] array, int n) {
        int min = 0;
        for (int i = 1; i < n; i++) {
            if (array[i] < array[min]) {
                min = i;
            }
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (i != min) {
                sum = sum + array[i];
            }
        }
        return sum;

    }

    //a4
    public static int min_Sum(int[] array, int n) {
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] > array[max]) {
                max = i;
            }
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (i != max) {
                sum = sum + array[i];
            }
        }
        return sum;

    }
    public void main(String[] args) {
        int[] array = new int[]{2, 3, 5, 1, 2};
        int n = 4;
        System.out.println(max(array, n));
        System.out.println(min(array, n));
        System.out.println(max_Sum(array, n));
        System.out.println(min_Sum(array, n));
    }

}
