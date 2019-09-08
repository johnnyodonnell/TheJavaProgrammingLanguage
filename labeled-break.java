
/*
 * From p. 242
 *
 * """
 * A labeled break can terminate any labeled statement.
 * """
 *
 * Thus, the following example does not create an infinte loop.
 *
 */

class Main {
    public static void main(String[] args) {
        start:
        switch("Hello") {
            default:
                System.out.println("World");
                break start;
        }
    }
}

