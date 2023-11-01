
public class ubung_1 {

    public static double averageGrade(double[] grades) throws IllegalAccessException {
        if(grades.length == 0){
            throw new IllegalAccessException("empty array");
        }
        double greats = 0;
        for(int i = 0; i < grades.length; i++){
            greats += grades[i];
        }
        return (double) greats / grades.length;
    }
    public static int round(double note) {
        if (note < 38) {
            return (int) note;
        } else {
            if (note % 5 > 2) {
                return (int) ((int) note + 5 - note % 5);
            } else {
                return (int) note;
            }
        }
    }

    public static double[] getRoundedGrades(double[] grades) throws IllegalAccessException {
        if(grades.length == 0){
            throw new IllegalAccessException("empty array");
        }
        double[] result = new double[grades.length];
        for (int i = 0; i < grades.length; i++) {
            result[i] = round(grades[i]);
        }
        return result;
    }
    public static double getMaxRoundedGrade(double[] grades) throws IllegalAccessException {
        if(grades.length == 0){
            throw new IllegalAccessException("empty array");
        }
        double[] roundedGrades = getRoundedGrades(grades);
        double max = roundedGrades[0];
        for (int i = 1; i < roundedGrades.length; i++) {
            if (roundedGrades[i] > max) {
                max = roundedGrades[i];
            }
        }
        return max;
    }

}
