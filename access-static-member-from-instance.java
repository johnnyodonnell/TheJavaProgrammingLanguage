
/*
 * From p. 46
 *
 * """
 * A static member may also be accessed using a reference to an object of
 * that class
 *
 * ...
 *
 * You should avoid this form because it gives the false impression that
 * `nextID` is a member of the object `mercury`, not a member of the class
 * `Body`
 * """
 *
 * From p. 224
 *
 * Page 224 mentions that it's possible to access a static member
 * from a null instance.
 *
 */

class Base {
    public static String field = "Hello from Base.";

    public static String getField() {
        return field;
    }
}

class Derived extends Base {
    public static String field = "Hello from Derived.";

    public static String getField() {
        return field;
    }
}

class Main {
    public static
        void main(String[] args) {
            Derived derived = new Derived();
            Base base = derived;

            System.out.println(base.field);
            System.out.println(base.getField());

            System.out.println(derived.field);
            System.out.println(derived.getField());

            // Access static member from null instance
            base = null;
            derived = null;
            System.out.println(base.field);
            System.out.println(derived.field);
        }
}

