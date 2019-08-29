
/*
 * From p. 125
 *
 * """
 * simple references to multiply-inherited non-hidden fields will be
 * ambigious
 * """
 *
 */

class Base {
    public static String value = "Hello!";
}

interface Interface {
    int value = 123;
}

class Derived extends Base implements Interface {}

class Main {
    public static void main(String[] args) {
        System.out.println(Derived.value);
    }
}

