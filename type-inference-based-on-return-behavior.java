
/*
 * From p. 263
 *
 * """
 * In the absence of a type argument, the compiler will infer what type
 * to use from the static argument types and the way in which the
 * return type is used.
 * """
 *
 * This is interesting because this is a bit different from how the
 * compiler resolves overloaded methods. For overloaded methods,
 * the compiler doesn't consider how the return type is used.
 *
 */

class Main {
    public static void main(String[] args) {
        Object o = method();

        // This causes a runtime exception
        String str = method();
    }

    static <T> T method() {
        // This causes a compiler warning
        T t = (T) new Object();
        return t;
    }
}

