import java.util.Locale;

public class Class_3 {
    public static void main(String[] args) {
        Locale locale = Locale.getDefault();
        String idiome = locale.getDisplayLanguage();
        System.out.print("Your system is in ");
        System.out.println(idiome);
    }
}