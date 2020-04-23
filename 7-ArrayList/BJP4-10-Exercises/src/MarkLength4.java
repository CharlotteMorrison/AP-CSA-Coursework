import java.util.ArrayList;

public class MarkLength4 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("this");
        words.add("is");
        words.add("lots");
        words.add("of");
        words.add("fun");
        words.add("for");
        words.add("every");
        words.add("Java");
        words.add("programmer");
        System.out.println(words);
        markLength4(words);
    }
    public static void markLength4(ArrayList<String> wordList){
        // iterate through arraylist
        // for each iteration
            // check the length of the string
            // if the length is 4, insert a string "****"
        String marker = "****";
        for(int i = 0; i < wordList.size(); i++){
            System.out.println(wordList.size());
            if(wordList.get(i).length() == 4){
               wordList.add(i, marker);
               i++;
            }
        }
        System.out.println(wordList);
    }
}
