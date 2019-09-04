
/*
 * From p. 217
 *
 * Copied from example in the book.
 *
 * Shows that precision loss happens when converting from `long`
 * to `float` even though the compiler doesn't warn about this
 * conversion.
 *
 */

class Main {
    public static void main(String[] args) {
        long lng = 0xa1ffffffffff0fffL;
        float flt = lng;
        long lng2 = (long) flt;

        System.out.println(lng);
        System.out.println(flt);
        System.out.println(lng2);
    }
}

