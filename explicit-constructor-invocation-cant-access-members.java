
/*
 * From p. 82
 *
 * """
 * Any expressions evaluated as part of an explicit constructor invocation
 * are not permitted to refer to any of the members of the current
 * object.
 * """
 *
 * This code fails at a compile time. Here is the message I received
 * from the compiler:
 * """
 * error: cannot reference number before supertype constructor has been called
 * """
 *
 * This code compiles successfuly if `number` is changed to a static field.
 *
 */

class MyClass {
    private int number = 10;

    MyClass() {
        this(number);
    }

    MyClass(int number) {
        this.number = number;
    }
}

class Main {
    public static void main(String[] args) {
        new MyClass();
    }
}

