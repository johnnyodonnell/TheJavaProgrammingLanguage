
/*
 * From p. 56
 *
 * """
 * If cycles happen, X's static initializers will have been
 * executed only to the point where Y's method was invoked.
 * When Y, in turn, invokes the X method, that method runs
 * with the rest of the static initializers yet to be executed.
 * Any static fields in X that haven't had their initializers
 * executed will still have their default values
 * """
 *
 * In this case, the static initialization of X is run first and thus,
 * Y.value is set to 10 and X.value is set to 100. If Y were to run
 * first, then X.value would be set to 0 and Y.value would be set to 10.
 *
 * I don't think the order of initialization can be counted on, so this
 * cyclic cycle is probably best to be avoided.
 *
 */

class X {
    private static int value;

    static {
        System.out.println("Static initializing X");
        value = X.getValue() + 10;
    }

    static int getValue() {
        return value;
    }
}

class Y {
    private static int value;

    static {
        System.out.println("Static initializing Y");
        int temp = Y.getValue();
        value = temp * temp;
    }

    static int getValue() {
        return value;
    }

}

class Main {
    public static
        void main(String[] args) {
            System.out.println("X: " + X.getValue());
            System.out.println("Y: " + Y.getValue());
        }
}

