import java.awt.Dimension;
import java.awt.Toolkit;


public class Class_4 {
    public static void main(String[] args) {
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        int width = (int)size.getWidth();
        int height = (int)size.getHeight();
        System.out.println("Your scree have resolution: " + width + "x" + height);
    }
}