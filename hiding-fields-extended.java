
/*
 * This example extends the example `hiding-fields.java`
 *
 * From p. 147
 *
 * The example on page 147 shows a good example of a subclass hiding
 * a inner class rather than overriding it. In this example, I am
 * hiding a field rather than overriding it.
 *
 * The explanation from p. 86 doesn't seem sufficient:
 * """
 * When you invoke a method through an object reference, the actual
 * class of the object governs which implementation is used. When
 * you access a field, the declared type of the reference is used.
 * """
 *
 * The example here seems to break the explanation from p. 86
 * because in this case there really is no declared reference
 * type. And if there was a declared reference type, it would
 * probably default to `Derived`. Luckily, the quote from p. 88
 * clears things up:
 * """
 * Inside a method, such as `show`, a reference to a field always
 * refers to the field declared in which the method is declared,
 * or else to an inherited field if there is not declaration in
 * that class.
 * """
 *
 * Rather than keeping these two rules in mind. It might be easier
 * to think in terms of the names given to the behavior of these
 * two types of inheritance - overriding and inheriting. Only
 * methods can be overriden. Everything else is hidden.
 * If the current execution environment doesn't know anything
 * about the subclass, then only overriding can change the default
 * behavior.
 *
 * Slightly more info on this on p. 223
 *
 */

class Base {
    String message = "Hi from Base.";

    String generateMessage() {
        return "Generated: " + message;
    }

    void print() {
        System.out.println(message);
        System.out.println(generateMessage());
    }
}

class Derived extends Base {
    String message = "Hi from Derived.";

    String generateMessage() {
        return "Generated: " + message;
    }

}

class Main {
    public static void main(String[] args) {
        new Derived().print();
    }
}

