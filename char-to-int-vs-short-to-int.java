
/*
 * From p. 216
 *
 * This example shows that the rules for converting a `char` to an `int`
 * are different from the rules for converting a `short` to an `int`.
 *
 * In this example both `ch` and `sh` have the same bit value, but
 * when they are converted to an `int` they have different bit values
 *
 */

class Main {
    public static void main(String[] args) {
        char ch = '\uffff';
        System.out.println("Result: " + (ch + 0));

        // Ideally we could set a short like in the commented out code
        // below; however, 0xffff is read as the int 65535, instead
        // of the value -1. -1 can fit in a short, but 65535 cannot
        // and thus a compiler-time error is thrown.
        // short sh = 0xffff;
        short sh = (short) ch;
        System.out.println("Result: " + (sh + 0));
    }
}

