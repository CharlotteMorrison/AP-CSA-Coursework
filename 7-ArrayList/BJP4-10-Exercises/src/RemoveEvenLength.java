import java.util.ArrayList;

public class RemoveEvenLength {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Sophia");
        names.add("Mo");
        names.add("Muhadeseh");
        names.add("Ashley");
        names.add("Luca");
        names.add("Jatyn");
        names.add("Sydeny");
        names.add("Jacob");

        // iterate through the ArrayList
        // check each item to see how many characters
        // see if that number of characters is even
        // delete if even
        for (int i = names.size()-1; i >= 0; i--){
            int numChars = names.get(i).length();
            if(numChars % 2 == 0){
                names.remove(i);
            }
        }
        System.out.println(names);
    }
}
