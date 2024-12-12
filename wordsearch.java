package wordsearch;

public class wordsearch {
    public static void main(String[] args) {
        String sentence = "The quick brown fox";
        String word = "fox";

        boolean result = isWordPresent(sentence, word);
        System.out.println("Expected Output: " + result);
    }

    public static boolean isWordPresent(String sentence, String word) {
        String[] words = sentence.split(" ");


        for (String w : words) {
            if (w.equals(word)) {
                return true;
            }
        }

        return false;
    }
}

