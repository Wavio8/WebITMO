package doctest;

/**
 * This is a JavaDoc class comment
 * @param <T> This describes my type parameter
 */
public class JavaDocTest<T> {

    /**
     * This is a JavaDoc public field comment
     */
    public static final String HELLO_MESSAGE = "Hello, World!";

    public static void main(String... args) {
        JavaDocTest.greetings();
    }

    /**
     * This is a JavaDoc public method comment
     */
    public static void greetings() {
        System.out.println(HELLO_MESSAGE);
    }

    /**
     * This is a JavaDoc public method comment
     * @param nowCount current value count
     * @return increased by one value
     */
    public int implNewCount(int nowCount) {
        nowCount=nowCount+1;
        // do things
        return nowCount;
    }
}

