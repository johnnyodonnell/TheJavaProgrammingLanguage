
/*
 * From p. 391
 *
 * """
 * there are no attempts to prevent a similar infinite recursion with
 * class types.
 * """
 *
 * The loop doesn't even have a chance to run
 *
 */

class Main {
    private final Main field = new Main();

    public static void main(String[] args) {
        Main main = new Main();

        for (int i = 0; i < 25; ++i) {
            System.out.println("Inspecting the previous object's field:");
            System.out.println("id: " + main);
            System.out.println();

            main = main.field;
        }
    }
}

