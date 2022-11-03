public class GradeCalculator {

    public String credit3gradeCalculator(String marksStr) {
        double marks = -1;
        try {
            marks = Double.parseDouble(marksStr);
        } catch (NumberFormatException e) {
            throw e;
        }
        if (marks < 0) {
            throw new IllegalArgumentException("Marks out of bound");
        }
        marks = Math.ceil(marks);

        if (marks > 400) {
            throw new IllegalArgumentException("Marks out of bound");
        } else if (marks >= 240) {
            return "A";
        } else if (marks >= 210) {
            return "B";
        } else if (marks >= 180) {
            return "C";
        }
        return "F";
    }

    public String credit4gradeCalculator(String marksStr) {

        double marks = -1;
        try {
            marks = Double.parseDouble(marksStr);
        } catch (NumberFormatException e) {
            throw e;
        }
        if (marks < 0) {
            throw new IllegalArgumentException("Marks out of bound");
        }
        marks = Math.ceil(marks);

        if (marks > 400) {
            throw new IllegalArgumentException("Marks out of bound");
        } else if (marks >= 320) {
            return "A";
        } else if (marks >= 280) {
            return "B";
        } else if (marks >= 240) {
            return "C";
        }
        return "F";

    }
}
