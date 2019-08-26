
/*
 * From p. 85
 *
 * """
 * For overriding in a varargs method, ... a sequence parameter of
 * type `T...` is treated the same as a parameter of type `T[]`
 *
 * ...
 *
 * Defining an overriding method that replaces a sequence with
 * an array is allowed, but is strongly discouraged.
 * """
 *
 * Interesting that no compiler warnings printed during compilation
 *
 */

class Base {
    private void print(String[] args) {
        for (int i = 0; i < args.length; ++i) {
            System.out.print(args[i] + " ");
        }
        System.out.println();
    }

    void printArray(String[] args) {
        System.out.println("Printing Array");
        print(args);
    }

    void printVarargs(String... args) {
        System.out.println("Printing Varargs");
        print(args);
    }
}

class Derived extends Base {
    void printArray(String... args) {
        super.printArray(args);
    }

    void printVarargs(String[] args) {
        super.printVarargs(args);
    }
}

class Main {
    public static void main(String[] args) {
        Base base = new Base();
        base.printArray(new String[] {"1", "2", "3"});
        base.printVarargs("1", "2", "3");

        Derived derived = new Derived();
        derived.printArray("1", "2", "3");
        derived.printVarargs(new String[] {"1", "2", "3"});

        // The following method fails on compilation
        // derived.printVarargs("1", "2", "3");
    }
}

