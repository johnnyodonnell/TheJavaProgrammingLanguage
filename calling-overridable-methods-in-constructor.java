
/*
 * From p. 82
 *
 * """
 * Your constructors should avoid invoking overridable methods
 * """
 *
 * When `Base`'s constructor calls `print`, the `print` method
 * from `Derived` is actually executed. And when `print` is called
 * in `Base`'s constructor, `Derived`'s `message` hasn't been
 * initialized yet.
 *
 */

class Base {
    private String message = "Hello from Base!";

    Base() {
        print();
    }

    void print() {
        System.out.println(message);
    }
}

class Derived extends Base {
    private String message = "Hello from Derived!";

    void print() {
        System.out.println(message);
    }
}

class Main {
    public static void main(String[] args) {
        new Derived();
    }
}

