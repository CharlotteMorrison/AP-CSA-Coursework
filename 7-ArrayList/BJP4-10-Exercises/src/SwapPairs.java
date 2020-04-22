import java.util.ArrayList;

public class SwapPairs {
    public static void main(String[] args) {
        ArrayList<String>  sample  = new ArrayList<>();
        sample.add("four");
        sample.add("score");
        sample.add("and");
        sample.add("seven");
        sample.add("years");
        sample.add("ago");
        System.out.println(sample);
        String temp = "";
        for(int i = 0; i < sample.size() - 1; i+=2){
            temp = sample.get(i);
            sample.set(i, sample.get(i + 1));
            sample.set(i + 1, temp);
        }
        System.out.println(sample);
    }
}
