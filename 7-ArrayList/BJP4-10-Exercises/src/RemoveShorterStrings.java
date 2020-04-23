import java.util.ArrayList;

public class RemoveShorterStrings {
    public static void main(String[] args){
        ArrayList<String> words = new ArrayList<>();
        words.add("four");
        words.add("score");
        words.add("and");
        words.add("seven");
        words.add("years");
        words.add("ago");
        removeShorterStrings(words);
    }
    public static void removeShorterStrings(ArrayList<String> wordList){
        // compare string lengths of i and i + 1
        // remove the shorter one
        // move to the next pair
        for(int i = 0; i < wordList.size() - 1; i++){
            if(wordList.get(i).length() <= wordList.get(i+1).length()){
                wordList.remove(i);
            }else{
                wordList.remove(i+1);
            }
        }
        System.out.print(wordList);
    }
}
