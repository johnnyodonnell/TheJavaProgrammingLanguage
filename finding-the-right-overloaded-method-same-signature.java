
/*
 * From p. 225
 *
 * See also:
 * finding-the-right-overloaded-method.java
 *
 * Help from:
 * https://stackoverflow.com/questions/57836517/example-of-multiple-maximally-specific-methods-that-does-not-result-in-a-compile
 *
 * This seems to illustrate the statements made in the Java 12 spec:
 * """
 * Otherwise, if all the maximally specific methods have override-equivalent
 * signatures, and all the maximally specific methods are abstract or
 * default, and the declarations of these methods have the same erased
 * parameter types, and at least one maximally specific method is preferred
 * according to the rules below, then the most specific method is chosen
 * arbitrarily among the subset of the maximally specific methods that are
 * preferred.
 * """
 *
 */

interface A {
    Object foo();
}

interface B {
    String foo();
}

abstract class C implements A, B {}

class D extends C {
    public String foo() {
        return "Hello World";
    }
}

class Main {
    public static void main(String[] args) {
        C c = new D();
        String result = c.foo();
        System.out.println(result);
    }
}

