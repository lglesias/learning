package src.main.java.com.lg.oop.ClassRoster;

/**
 * TODO：功能描述
 *
 * @author lglesias
 * @version 1.0
 * @BelongsProject javseProjectAi
 * @BelongsPackage src.main.java.com.lg.oop.ClassRostet
 * @since 2026-06-05  15:22
 */
public class ClassRosterTest {
    public static void main(String[] args) {
        //create 10 student
        Student[] allStudents = new Student[10];
        allStudents[0] = new Student("张三", 'M', 98);
        allStudents[1] = new Student("李四", 'M', 85);
        allStudents[2] = new Student("王五", 'M', 70);
        allStudents[3] = new Student("赵六", 'M', 60);
        allStudents[4] = new Student("孙红", 'F', 90);
        allStudents[5] = new Student("赵敏", 'F', 90);
        allStudents[6] = new Student("王刚", 'F', 88);
        allStudents[7] = new Student("李凯", 'F', 77);
        allStudents[8] = new Student("周芷若", 'F', 90);
        allStudents[9] = new Student("金凯", 'M', 100);

        //Can print all class student information
        //can print the average score of all students in the class
        ClassData classData = new ClassDataImpl2(allStudents);
        classData.printaverageScore();
        classData.printAllStudentInformation();


        //Can print all class student information
        //(Print the number of male and female students in the class)
        //can print the average score of all students in the class
        //(Print the average score after removing the highest and lowest scores)

    }
}
