
/*
 * From p. 391
 *
 * """
 * there are no attempts to prevent a similar infinite recursion with
 * class types.
 * """
 *
 * `main` results in an infinite loop
 *
 * Somewhat surprising that the loop is even able to execute. Part of me
 * would guess that the default field constructor would result in an
 * infinite loop
 *
 */

class Main {
    private static final Main field = new Main();

    public static void main(String[] args) {
        Main main = field;
        while (main != null) {
            System.out.println("Accessing main's field.");
            main = main.field;
        }
    }
}

