import java.util.ArrayList;

public class StutterMain {
    public static void main(String[] args) {
        // ["how", "are", "you?"]
        ArrayList<String> wordList = new ArrayList<>();
        wordList.add("how");
        wordList.add("are");
        wordList.add("you?");
        stutter(wordList, 5);

    }
    public static void stutter(ArrayList<String> words, int k){
        // k is the times the word will be repeated.

        // iterate through the list, add k more instances of each word
        // when I am adding in words it shifts the rest of the array right- work from the last element and count down.
        for(int i = words.size() - 1; i >= 0; i--){
            for(int j = 0; j < k; j++){
                words.add(i, words.get(i));
            }
        }
        System.out.println(words);

    }
}
