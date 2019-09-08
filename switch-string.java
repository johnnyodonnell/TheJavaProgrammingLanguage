
/*
 * From p. 232
 *
 * """
 * The expression must either be of an integer type (char, byte, short,
 * or int, or corresponding wrapper class) or an enum type.
 * """
 *
 * It looks like starting in Java SE 7, Strings have become an acceptable
 * type in the switch expression.
 *
 */

class Main {
    public static void main(String[] args) {
        switch (new String()) {
            default:
                System.out.println("Hello World");
        }
    }
}

