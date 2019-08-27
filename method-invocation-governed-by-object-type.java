
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
 * --- EDIT ---
 *
 * From p. 88
 *
 * """
 * If the method is not accessible then it is not inherited,
 * and if it is not inherited it can't be overridden.
 * """
 *
 * When `callPrint` calls `printAgain`, it will always use it's
 * own private method because the `printAgain` in `Derived` does
 * not override `printAgain` in `Base`.
 *
 */

class Base {
    void print() {
        System.out.println("Printing from Base.");
    }

    private void printAgain() {
        System.out.println("Printing again from Base.");
    }

    void callPrint() {
        print();
        printAgain();
    }
}

class Derived extends Base {
    void print() {
        System.out.println("Printing from Derived.");
    }

    void printAgain() {
        System.out.println("Printing again from Derived.");
    }

}

class Main {
    public static void main(String[] args) {
        new Base().callPrint();
        new Derived().callPrint();
    }
}

