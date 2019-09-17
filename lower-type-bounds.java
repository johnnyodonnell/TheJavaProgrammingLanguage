import java.util.List;

/*
 * From p. 261
 *
 * """
 * Only wildcards can be given a lower type bound
 * """
 *
 * Why is this?
 *
 * https://stackoverflow.com/q/4902723/5832619
 *
 */

class Main {
    public static void main(String[] args) {
    }

    static <T extends String> void method(T[] arr) {
    }

    /*
     * Compile time error
     *
    static <T super String> void method(T[] arr) {
    }
    */
}

