import java.util.Arrays;
class Ubung1_test {
    void getAverageGrade() {
        double[] grades = new double[]{2.0, 3.0, 5.0, 1.0, 2.0};
        assert ubung_1.getAverageGrade(grades) == 2.6;
    }
    void getRoundedGrades() {
        double[] grades = new double[]{2.4, 3.5, 5.7, 1.9, 2.1};
        double[] rounded = new double[]{2.0, 4.0, 6.0, 2.0, 2.0};
        assert Arrays.equals(ubung_1.getRoundedGrades(grades), rounded);
    }
    void getMaxRoundedGrade() {
        double[] grades = new double[]{2.4, 3.5, 5.7, 1.9, 2.1};
        assert ubung_1.getMaxRoundedGrade(grades) == 6.0;
    }
}
