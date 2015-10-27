import java.util.ArrayList;

/**
 * Created by zach on 10/27/15.
 */
public class Exercise5 {
    public static void main(String[] args) {
        String s = "To be or not to be, that is the question.";
        // Remove commas and periods
        s = s.replace(",", "").replace(".", "");
        // Make it all lowercase
        s = s.toLowerCase();
        // Split into words
        String[] words = s.split(" ");
        // Remove duplicate words
        ArrayList<String> newWords = new ArrayList();
        for (String word : words) {
            if (!newWords.contains(word)) {
                newWords.add(word);
            }
        }
        // Create a new string without the duplicate words
        String newStr = "";
        for (String newWord : newWords) {
            if (!newStr.isEmpty()) {
                newStr += " ";
            }
            newStr += newWord;
        }
        System.out.println(newStr);
        // to be or not that is the question
    }
}
