
class Ubung2_Test {


    public void max() throws IllegalAccessException {
        int[] array = new int[]{2, 3, 5, 1, 2};
        assert Ubung2.max(array) == 5;
        int[] array2 = new int[]{};
        try {
            Ubung2.max(array2);
            assert false;
        } catch (IllegalAccessException e) {
            assert true;
        }


    }


    public void min() throws IllegalAccessException {
        int[] array = new int[]{2, 3, 5, 1, 2};
        assert Ubung2.min(array) == 1;
        int[] array2 = new int[]{};
        try {
            Ubung2.min(array2);
            assert false;
        } catch (IllegalAccessException e) {
            assert true;
        }
    }


    public void max_Sum() throws IllegalAccessException {
        int[] array = new int[]{2, 3, 5, 1, 2};
        assert Ubung2.max_Sum(array) == 12 ;
        int[] array2 = new int[]{};
        try {
            Ubung2.max_Sum(array2);
            assert false;
        } catch (IllegalAccessException e) {
            assert true;
        }
    }


    public void min_Sum() throws IllegalAccessException {
        int[] array = new int[]{2, 3, 5, 1, 2};
        assert Ubung2.min_Sum(array) == 8;
        int[] array2 = new int[]{};
        try {
            Ubung2.min_Sum(array2);
            assert false;
        } catch (IllegalAccessException e) {
            assert true;
        }

    }
}