public class StudentResult {

    public int calculateTotal(int mark1, int mark2, int mark3) {
        return mark1 + mark2 + mark3;
    }

    public double calculateAverage(int mark1, int mark2, int mark3) {
        return calculateTotal(mark1, mark2, mark3) / 3.0;
    }

    public String calculateGrade(double average) {
        if (average >= 90) {
            return "A";
        } else if (average >= 75) {
            return "B";
        } else if (average >= 60) {
            return "C";
        } else if (average >= 50) {
            return "D";
        } else {
            return "F";
        }
    }

    public boolean isPassed(double average) {
        return average >= 50;
    }
}