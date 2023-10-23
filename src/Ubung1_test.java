

import java.util.Arrays;

class Ubung1_test {
    public static void averageGrade() throws IllegalAccessException {
        double[] grades = new double[]{1.0, 2.0, 3.0, 4.0, 5.0};
        double[] grades_1 = new double[]{};
        assert ubung_1.averageGrade(grades) == 3.0;
        try {
            ubung_1.averageGrade(grades_1);
            assert false;
        } catch (IllegalAccessException e) {
            assert true;
        }
    }

    public static void getRoundedGrades() throws IllegalAccessException {
        double[] grades = new double[]{2.3, 3.5, 5.0, 1.3, 9.9};
        double[] result = new double[]{2.0, 3.0, 5.0, 1.0, 9.0};
        assert Arrays.equals(ubung_1.getRoundedGrades(grades), result);
        try {
            ubung_1.getRoundedGrades(new double[]{});
            assert false;
        } catch (IllegalAccessException e) {
            assert true;
        }

    }




}








