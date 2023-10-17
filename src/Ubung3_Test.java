import java.util.Arrays;

public class Ubung3_Test {
    public void add() {
        int[] num1 = new int[]{1, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] num2 = new int[]{8, 7, 0, 0, 0, 0, 0, 0, 0};
        int[] result = new int[]{9, 0, 0, 0, 0, 0, 0, 0, 0};
        assert Arrays.equals(Ubung3.add(num1, num2), result);
    }
    public void subtract() {
        int[] num1 = new int[]{1, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] num2 = new int[]{8, 7, 0, 0, 0, 0, 0, 0, 0};
        int[] result = new int[]{7, 4, 0, 0, 0, 0, 0, 0, 0};
        assert Arrays.equals(Ubung3.subtract(num1, num2), result);
    }
    public void multiply() {
        int[] num1 = new int[]{1, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] result = new int[]{2, 6, 0, 0, 0, 0, 0, 0, 0};
        assert Arrays.equals(Ubung3.multiply(num1, 2), result);
    }
    public void divide() {
        int[] num1 = new int[]{1, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] result = new int[]{6, 5, 0, 0, 0, 0, 0, 0, 0};
        assert Arrays.equals(Ubung3.divide(num1, 2), result);
    }
}
