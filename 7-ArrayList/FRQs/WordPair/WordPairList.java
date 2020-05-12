// Mean Score 4.38/9
import java.util.ArrayList;

public class WordPairList {
    // the list of WordPairs
    private ArrayList<WordPair> allPairs = new ArrayList<WordPair>();

    // constructor for WordPairList  (precondition words.length >= 2)
    public WordPairList(String[] words){
        allPairs = new ArrayList<WordPair>();
        for(int i = 0; i < words.length -1; i++){
            for(int j = i + 1; j < words.length ; j++){
                WordPair newWords = new WordPair(words[i], words[j]);
                allPairs.add(newWords);
            }
        }
    }
    // returns the number of matches
    public int NumMatches(){
        int counter = 0;
        // Enhanced loop method
        for (WordPair pair: allPairs){
            if(pair.getFirst().equals(pair.getSecond())){
                counter++;
            }
        }
        // regular for loop method
        for(int i = 0; i < allPairs.size(); i++){
            String word1 = allPairs.get(i).getFirst();
            String word2 = allPairs.get(i).getSecond();
            if(word1.equals(word2)){
                counter++;
            }
        }
        return counter;
    }

}
