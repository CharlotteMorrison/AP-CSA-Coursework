import java.util.ArrayList;
import java.util.Collections;
public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        // {"be", "be", "is", "not", "or", "question", "that", "the", "to", "to"}
        words.add("be");
        words.add("be");
        words.add("is");
        words.add("not");
        words.add("or");
        words.add("question");
        words.add("that");
        words.add("the");
        words.add("to");
        words.add("to");
        removeDuplicates(words);
    }
    public static void removeDuplicates(ArrayList<String> wordList){
        Collections.sort(wordList);
        System.out.println(wordList);
        for (int i = 0; i < wordList.size() - 1; i ++){
            if (wordList.get(i).equals(wordList.get(i+1))){
                wordList.remove(i + 1);
                System.out.println("Removed one instance of '" + wordList.get(i) + "' at index " + i);
            }
        }
        System.out.println(wordList);
    }
}
