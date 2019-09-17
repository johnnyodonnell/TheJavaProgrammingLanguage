import java.util.List;
import java.util.ArrayList;

/*
 * From p. 268
 *
 * """
 * You cannot create an array whose element type is a parameterized type
 * """
 *
 * """
 * any attempt to return some less specific array type (say `List[]`)
 * would result in an "unchecked" warning
 * """
 *
 * So, it's somewhat possible to create a parameterized array, but it
 * will cause a compiler warning.
 *
 */

class Main {
    public static void main(String[] args) {
        List<String>[] listArray = new List[10];
        listArray[0] = new ArrayList<String>();
    }
}

