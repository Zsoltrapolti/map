
class Ubung2_Test {


    public void max() {
        int[] array = new int[]{2, 3, 5, 1, 2};
        int n = 4;
        assert Ubung2.max(array, n) == 5;


    }


    public void min() {
        int[] array = new int[]{2, 3, 5, 1, 2};
        int n = 4;
        assert Ubung2.min(array, n) == 1;
    }


    public void max_Sum() {
        int[] array = new int[]{2, 3, 5, 1, 2};
        int n = 4;
        assert Ubung2.max_Sum(array, n) == 5;
    }


    public void min_Sum() {
        int[] array = new int[]{2, 3, 5, 1, 2};
        int n = 4;
        assert Ubung2.min_Sum(array, n) == 5;
    }
}