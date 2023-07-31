package task_6;

public class New extends Printer {
    public static String ansi_red = "\u001B[31m";
    public static String ansi_green = "\u001B[32m";
    public static String ansi_blue = "\u001B[34m";

    @Override
    public void print(String value) {
        System.out.println(ansi_red + value);
        System.out.println(ansi_green + value);
        System.out.println(ansi_blue + value);
    }
}
