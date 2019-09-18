import java.util.List;

/*
 * From p. 262
 *
 * """
 * We could have introduced a second type variable, say S, to use instead
 * of the wildcard to achieve the same affect.
 * """
 *
 * In this case One#foo is preferable to Two#foo because a wildcard
 * achieves the same affect and it does so more succinctly
 *
 */

class One {
    <T> void foo(List<T> t, List<? extends T> u) {}
}

class Two {
    <T, U extends T> void foo(List<T> t, List<U> u) {}
}

