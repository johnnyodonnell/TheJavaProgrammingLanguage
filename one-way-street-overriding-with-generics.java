
/*
 * From p. 272
 *
 * """
 * A method without generic types can override a method with generic
 * types, but not the other way around.
 * """
 *
 * This is an interesting section from the book (1) because of the mention
 * of "one-way street" overriding for generics and (2) because of the
 * author's use of same signature vs same erased signature.
 *
 * For example from p. 271:
 * """
 * Two methods have override-equivalent signatures if their signatures
 * are the same, or if the erasures of their signatures are the same.
 * """
 *
 * And from p. 272:
 * """
 * The signature of a sublass method must be the same as that of the
 * superclass method, or it must be the same as the erasure of the
 * signature of the superclass method.
 * """
 *
 * The Java 13 Spec:
 * https://docs.oracle.com/javase/specs/jls/se13/html/jls-8.html#jls-8.4.2
 *
 * The Java 13 confirms this distinction of same signature vs
 * same erased signature.
 *
 */

class Base {
    void print(Integer i) {}
}

class Derived extends Base {
    <I extends Integer> void print(I i) {}
}

