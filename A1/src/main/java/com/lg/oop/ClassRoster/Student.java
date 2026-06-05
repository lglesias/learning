package src.main.java.com.lg.oop.ClassRoster;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * TODO：功能描述
 *
 * @author lglesias
 * @version 1.0
 * @BelongsProject javseProjectAi
 * @BelongsPackage src.main.java.com.lg.oop.ClassRostet
 * @since 2026-06-05  15:23
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    // name
    private String name;
    // gender
    private char gender;
    // score
    private double score;
}
