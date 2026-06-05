package src.main.java.com.lg.oop.ClassRoster;

/**
 * TODO：功能描述
 *
 * @author lglesias
 * @version 1.0
 * @BelongsProject javseProjectAi
 * @BelongsPackage src.main.java.com.lg.oop.ClassRostet
 * @since 2026-06-05  15:37
 */
public class ClassDataImpl1 implements ClassData {
    private Student[] allStudents;

    public ClassDataImpl1(Student[] allStudents) {
        this.allStudents = allStudents;
    }

    //Can print all class student information
    @Override
    public void printAllStudentInformation() {
        System.out.println("All students information:");
        for (int i = 0; i < allStudents.length; i++) {
            Student student = allStudents[i];
            System.out.println("Student " + (i + 1) + ": "
                    + student.getName() + ", "
                    + student.getGender() + ", "
                    + student.getScore());
        }
    }

    //Can print the average score of all students in the class
    @Override
    public void printaverageScore() {
        System.out.println("Average score:");
        double sum = 0;
        for (int i = 0; i < allStudents.length; i++) {
            Student student = allStudents[i];
            sum += student.getScore();
        }
        System.out.println(sum / allStudents.length);
    }
}
