public class Student {
    public String name;
    public double grade1;
    public double grade2;
    public double grade3;

    public double FinalGrade() {
        return grade1 + grade2 + grade3;
    }

    public double MissingPoints() {
        if (FinalGrade() < 60.0) {
            return 60.0 - FinalGrade();
        } else {
            return 0.0;
        }
    }
}
