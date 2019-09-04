
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

        short sh = (short) ch;
        System.out.println("Result: " + (sh + 0));
    }
}

