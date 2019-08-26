
/*
 * From p. 87
 *
 * """
 * The actual class of the object, not the type of the reference,
 * governs which version of the method is called.
 *
 * ...
 *
 * This occurs whether `show` is invoked externally (as in the example)
 * or internally within another method of either `ExtendShow` or
 * `SuperShow`.
 * """
 *
 * I suppose this is why the template method design pattern is possible.
 *
 */

class Base {
    void print() {
        System.out.println("Printing from Base.");
    }

    void callPrint() {
        print();
    }
}

class Derived extends Base {
    void print() {
        System.out.println("Printing from Derived.");
    }
}

class Main {
    public static void main(String[] args) {
        new Base().callPrint();
        new Derived().callPrint();
    }
}

