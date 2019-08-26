
/*
 * From p. 86
 *
 * """
 * Fields cannot be overriden; they can only be hidden.
 * """
 *
 * This is interesting behavior. Field access is done by the reference
 * type, whereas method invocation is done by the instance type.
 *
 */

class Base {
    public String message = "This is a String";
}

class Derived extends Base {
    public int message = 100;
}

class Main {
    public static void main(String[] args) {
        Base base = new Base();
        System.out.println(base.message);

        Derived derived = new Derived();
        System.out.println(derived.message);

        base = derived;
        System.out.println(base.message);
    }
}

