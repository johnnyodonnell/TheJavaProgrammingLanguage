
/*
 * From p. 162
 *
 * From p. 165
 *
 * """
 * Characters that look the same, or nearly the same, can be confused.
 * For example, the Latin capital letter n "N" and the Greek capital
 * letter v "Ν" look alike but are different characters
 * """
 *
 * Java supports Unicode for source code characters. However, some
 * Unicode characters look strikingly similar. The o's in the first
 * method are different than the o's in the second method
 *
 */

class Main {
    private static void foo() {
        System.out.println("First");
    }

    private static void fоо() {
        System.out.println("Second");
    }

    public static void main(String[] args) {
        foo();
        fоо();
    }
}

