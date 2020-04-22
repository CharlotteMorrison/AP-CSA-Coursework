import java.util.ArrayList;

public class MinToFront {
    public static void main(String[] args) {
        ArrayList<Integer> values = new ArrayList<>();
        values.add(8);
        values.add(2);
        values.add(-5);
        values.add(77);
        values.add(18);
        values.add(17);
        values.add(-17);
        minToFront(values);
    }
    public static void minToFront(ArrayList<Integer> nums){
        // iterate through my ArrayList
        // see if the value at the index is the smallest
        // if it is the smallest, move it to the front
        int min = nums.get(0);
        int index = 0;
        for (int i = 1; i < nums.size(); i++){
            if(nums.get(i) < min){
                min = nums.get(i);
                index = i;
            }
        }
        nums.remove(index);
        nums.add(0, min);
        System.out.println(nums);
    }
}
