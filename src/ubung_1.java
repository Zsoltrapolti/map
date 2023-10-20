public class ubung_1 {
    public static double getAverageGrade(double[] grades) {
        if (grades.length == 0) {
            return 0.0;
        }

        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }

        return sum / grades.length;
    }

    public static double[] getRoundedGrades(double[] grades) {
        double[] rounded = new double[grades.length];
        for (int i = 0; i < grades.length; i++) {
            rounded[i] = Math.round(grades[i]);
        }
        return rounded;
    }

    public static double getMaxRoundedGrade(double[] grades) {
        if (grades.length == 0) {
            return 0.0;
        }

        double maxRounded = Math.round(grades[0]);
        for (double grade : grades) {
            double rounded = Math.round(grade);
            if (rounded > maxRounded) {
                maxRounded = rounded;
            }
        }

        return maxRounded;
    }
}


