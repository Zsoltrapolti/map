
class Ubung2_Test {


    public void max() {
        int[] array = new int[]{2, 3, 5, 1, 2};
        assert Ubung2.max(array) == 5;


    }


    public void min() {
        int[] array = new int[]{2, 3, 5, 1, 2};

        assert Ubung2.min(array) == 1;
    }


    public void max_Sum() {
        int[] array = new int[]{2, 3, 5, 1, 2};
        assert Ubung2.max_Sum(array) == 5;
    }


    public void min_Sum() {
        int[] array = new int[]{2, 3, 5, 1, 2};
        assert Ubung2.min_Sum(array) == 5;
    }
}