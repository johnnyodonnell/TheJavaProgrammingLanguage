import java.lang.reflect.Type;
import java.lang.reflect.ParameterizedType;

/*
 * From p. 427
 *
 * Example of `ParameterizedType` in practice on p. 402 - 404
 *
 * Other examples of getting `ParameterizedType`:
 * http://tutorials.jenkov.com/java-reflection/generics.html
 *
 * SO questions about how this seems to violate the nature of type erasure:
 * https://stackoverflow.com/q/58467802/5832619
 * https://stackoverflow.com/q/2320658/5832619
 *
 */

class GenericBase<T> {};

class Generic<T> extends GenericBase<T> {};

class NonGeneric extends GenericBase<Integer> {};

class Main {
    public static void main(String[] args) {
        print(NonGeneric.class.getGenericSuperclass());
        print(new NonGeneric().getClass().getGenericSuperclass());

        print(Generic.class.getGenericSuperclass());
        print(new Generic<String>().getClass().getGenericSuperclass());
    }

    private static void print(Type type) {
        ParameterizedType parameterizedType = (ParameterizedType) type;

        for (Type typeArg : parameterizedType.getActualTypeArguments()) {
            System.out.println(typeArg);
        }
    }
}

