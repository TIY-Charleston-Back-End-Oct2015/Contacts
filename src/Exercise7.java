import java.util.*;

/**
 * Created by zach on 10/29/15.
 */
public class Exercise7 {
    public static void main(String[] args) {
        String[] names = {"Alice", "Smith", "Bob", "Brown", "Charlie", "Jones", "Hi"};
        // Reverse the array
        List<String> newNames = Arrays.asList(names);
        Collections.reverse(newNames);

        /*
        ArrayList<String> newNames2 = new ArrayList();
        for (int i = names.length - 1; i >= 0; i--) {
            newNames2.add(names[i]);
        }
        */

        // Convert the array into a HashMap
        HashMap m = new HashMap();
        for (int i = 0; i < names.length; i+=2) {
            m.put(names[i], names[i+1]);
        }

        System.out.println(m);
        // {"Jones":"Charlie", "Brown":"Bob", "Smith":"Alice"}
    }
}
