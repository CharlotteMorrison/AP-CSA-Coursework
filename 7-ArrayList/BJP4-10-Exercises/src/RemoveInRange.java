import java.util.ArrayList;
public class RemoveInRange {
    public static void main(String[] args) {
        // [0, 0, 2, 0, 4, 0, 6, 0, 8, 0, 10, 0, 12, 0, 14, 0, 16]
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(0);
        nums.add(0);
        nums.add(2);
        nums.add(0);
        nums.add(4);
        nums.add(0);
        nums.add(6);
        nums.add(0);
        nums.add(8);
        nums.add(0);
        nums.add(10);
        nums.add(0);
        nums.add(12);
        nums.add(0);
        nums.add(14);
        nums.add(0);
        nums.add(16);
        nums.add(0);
        nums.add(0);
        nums.add(0);
        removeInRange(nums, 0, 5, 13);
    }
    public static void removeInRange(ArrayList<Integer> numList, int removeVal, int lowBound, int upperBound){
        // iterate from the lower bound until the upperbound and remove all the occurances of a value
        for(int i = lowBound; i < upperBound; i++){
            // System.out.println(numList.get(i));
            if(numList.get(i) == removeVal){
                numList.remove(i);
                // System.out.println("The number " + removeVal + " from index " + i);
            }
        }
        System.out.print(numList);

    }
}
