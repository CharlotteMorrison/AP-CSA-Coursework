import java.util.ArrayList;

public class FilterRange {
    public static void main(String[] args){
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(4);
        nums.add(7);
        nums.add(9);
        nums.add(2);
        nums.add(7);
        nums.add(7);
        nums.add(5);
        nums.add(3);
        nums.add(5);
        nums.add(1);
        nums.add(7);
        nums.add(8);
        nums.add(6);
        nums.add(7);
        filterRange(nums, 5, 7);
    }
    public static void filterRange(ArrayList<Integer> numList, int min, int max){
        // read through the list
        // check each value to see if it is in the range
        // remove values if in range
        for(int i = 0; i < numList.size(); i++){
            if(numList.get(i) >= min && numList.get(i) <= max){
                numList.remove(i);
                i--;
            }
        }
        System.out.println(numList);
    }
}
