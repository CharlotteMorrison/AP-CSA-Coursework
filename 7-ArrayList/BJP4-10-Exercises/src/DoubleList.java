import java.util.ArrayList;

public class DoubleList {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("how");
        words.add("are");
        words.add("you");
        doubleList(words);
    }
    public static void doubleList(ArrayList<String> doubles){
        // iterate throught the ArrayList
        // copy the item
        // insert the item next to the original
        for (int i = 0; i < doubles.size(); i+=2){
            doubles.add(i + 1, doubles.get(i));
        }
        System.out.println(doubles);
    }
}
