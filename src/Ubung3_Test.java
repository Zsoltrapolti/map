import java.util.Arrays;

public class Ubung3_Test {
    public void add() throws IllegalAccessException {
        int[] num1 = new int[]{1, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] num2 = new int[]{8, 7, 0, 0, 0, 0, 0, 0, 0};
        int[] result = new int[]{1,0, 0, 0, 0, 0, 0, 0, 0, 0};
        assert Arrays.equals(Ubung3.add(num1, num2), result);
        int[] num3 = new int[]{};
        try{
            Ubung3.add(num3, num2);
            assert false;
        } catch (IllegalAccessException e) {
            assert true;
        }
    }
    public void subtract() throws IllegalAccessException {
        int[] num1 = new int[]{1, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] num2 = new int[]{8, 7, 0, 0, 0, 0, 0, 0, 0};
        int[] result = new int[]{7, 4, 0, 0, 0, 0, 0, 0, 0};
        assert Arrays.equals(Ubung3.subtract(num2, num1), result);
        int[] num3 = new int[]{};
        try {
            Ubung3.subtract(num3, num2);
            assert false;
        } catch (IllegalAccessException e) {
            assert true;
        }
    }
    public void multiply() throws IllegalAccessException {
        int[] num1 = new int[]{1, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] result = new int[]{2, 6, 0, 0, 0, 0, 0, 0, 0};
        assert Arrays.equals(Ubung3.multiply(num1, 2), result);
        int[] num3 = new int[]{};
        try {
            Ubung3.multiply(num3, 2);
            assert false;
        } catch (IllegalAccessException e) {
            assert true;
        }
    }
    public void divide() throws IllegalAccessException {
        int[] num1 = new int[]{1, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] result = new int[]{0, 6, 5, 0, 0, 0, 0, 0, 0};
        assert Arrays.equals(Ubung3.divide(num1, 2), result);
        int[] num3 = new int[]{};
        try {
            Ubung3.divide(num3, 2);
            assert false;
        } catch (IllegalAccessException e) {
            assert true;
        }
    }
}
