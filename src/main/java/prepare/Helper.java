package prepare;

public class Helper {
    public static <U extends Exception> void printException(U u) {
        System.out.println(u.getMessage());
    }

    public static void main(String[] args) {
        Helper.<NullPointerException>printException(new NullPointerException("D"));
    }
}
