package src.main.java.com.lg.oop.ClassRoster;

/**
 * TODO：功能描述
 *
 * @author lglesias
 * @version 1.0
 * @BelongsProject javseProjectAi
 * @BelongsPackage src.main.java.com.lg.oop.ClassRostet
 * @since 2026-06-05  15:39
 */
public class ClassDataImpl2 implements ClassData {
    private Student[] allStudents;

    public ClassDataImpl2(Student[] allStudents) {
        this.allStudents = allStudents;
    }

    /**
     * Can print all class student information
     * (Print the number of male and female students in the class)
     */
    @Override
    public void printAllStudentInformation() {
        int maleCount = 0;
        System.out.println("All students information:");
        for (int i = 0; i < allStudents.length; i++) {
            Student student = allStudents[i];
            System.out.println("Student " + (i + 1) + ": "
                    + student.getName() + ", "
                    + student.getGender() + ", "
                    + student.getScore());
            //count gender
            if (student.getGender() == 'M') {
                maleCount++;
            }
        }
        System.out.println("Male count: " + maleCount);
        System.out.println("Female count: " + (allStudents.length - maleCount));
    }

    /**
     * can print the average score of all students in the class
     * (Print the average score after removing the highest and lowest scores)
     */
    @Override
    public void printaverageScore() {
        System.out.println("Average score:");
        Student students = allStudents[0];
        double sum = students.getScore();
        double max = students.getScore();
        double min = students.getScore();
        for (int i = 1; i < allStudents.length; i++) {
            Student student = allStudents[i];
            sum += student.getScore();
            //find max
            if (student.getScore() > max) {
                max = student.getScore();
            }
            //find min
            if (student.getScore() < min) {
                min = student.getScore();
            }
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println((sum - max - min) / (allStudents.length - 2));

    }
}
