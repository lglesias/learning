package src.main.java.com.lg.foundation;

/**
 * TODO：How many times do you need to fold paper to be taller than Mount Everest?
 *
 * @author lglesias
 * @version 1.0
 * @BelongsProject javseProjectAi
 * @BelongsPackage src.main.java.com.lg.main
 * @since 2026-06-03  14:00
 */
public class FoldedPaper {
    public static void main(String[] args) {

        System.out.println("The number of folds is " + folder());
    }

    /**
     *Calculate the number of folds
     * @return
     */
    public static int folder(){
        double peakHeight = 8848860;
        double paperThickness = 0.1;
        int count = 0;
        while (paperThickness < peakHeight){
            count++;
            paperThickness *= 2;
        }
        return count;
    }
}
