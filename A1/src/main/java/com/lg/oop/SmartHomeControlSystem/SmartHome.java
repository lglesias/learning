package src.main.java.com.lg.oop.SmartHomeControlSystem;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * TODO：功能描述
 *
 * @author lglesias
 * @version 1.0
 * @BelongsProject javseProjectAi
 * @BelongsPackage src.main.java.com.lg.oop.SmartHomeControlSystem
 * @since 2026-06-05  16:54
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SmartHome implements Switch {
    // name
    private String name;
    //Status: On or Off
    private boolean status; //default off(false)


    @Override
    public void Press() {
        status = !status;
    }
}
