
/*
 * From p. 89
 *
 * """
 * Static members within a class - whether fields or methods -
 * cannot be overridden, they are always hidden.
 *
 * ...
 *
 * If a reference is used to access a static member then, as with
 * instance fields, static members are always accessed based on the
 * declared type of the refence, not the type of the object referred
 * to.
 * """
 *
 */

class Base {
    static void print() {
        System.out.println("Printing from Base.");
    }
}

class Derived extends Base {
    static void print() {
        System.out.println("Printing from Derived.");
    }
}

class Main {
    public static void main(String[] args) {
        Derived derived = new Derived();
        derived.print();

        Base base = derived;
        base.print();
    }
}

