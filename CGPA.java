import java.util.Scanner;

class CGPACalculator {
    private double[] marks;

    public CGPACalculator(double[] marks) {
        this.marks = marks;
    }

    public double calculateCGPA() {
        double totalGradePoints = 0.0;
        for (double mark : marks) {
            double grade = mark / 10.0;
            totalGradePoints += grade;
        }
        return totalGradePoints / marks.length;
    }

    public double calculatePercentage() {
        double cgpa = calculateCGPA();
        return cgpa * 9.5;
    }
}

public class CGPA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of subjects:");
        int n = sc.nextInt();

        double[] marks = new double[n];

        System.out.println("Enter marks:");
        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextDouble();
        }

        CGPACalculator calculator = new CGPACalculator(marks);

        double cgpa = calculator.calculateCGPA();
        System.out.println("CGPA: " + cgpa);

        double percentage = calculator.calculatePercentage();
        System.out.println("Percentage from CGPA: " + percentage);
    }
}