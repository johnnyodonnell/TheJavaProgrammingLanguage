
/*
 * From p. 126
 *
 * """
 * If two inherited methods differ only in return type where one
 * where one type is not a subtype of the other, you will get a
 * compile-time error.
 * """
 *
 * This is pretty obvious, but wanted to see it fail in practice
 *
 */

interface First {
    String getValue();
}

interface Second {
    int getValue();
}

interface Third extends First, Second {
}

