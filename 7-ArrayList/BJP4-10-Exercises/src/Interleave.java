import java.lang.reflect.Array;
import java.util.ArrayList;

public class Interleave {
    public static void main(String[] args){
        ArrayList<Integer> num1 = new ArrayList<>();
        num1.add(10);
        num1.add(20);
        num1.add(30);
        ArrayList<Integer> num2 = new ArrayList<>();
        num2.add(4);
        num2.add(5);
        num2.add(6);
        num2.add(7);
        num2.add(8);
        interleave(num1, num2);
    }
    public static void interleave(ArrayList<Integer> list1, ArrayList<Integer> list2){
        //iterate through both lists, if list 2 has a value at the index, insert it in list 1
        int count1 = 0;
        int count2 = 0;
        while(count2 < list2.size()){
            if(count1 < list1.size()){
                list1.add(count1, list2.get(count2));
                count1+=2;
            }else{
                list1.add(count1, list2.get(count2));
                count1++;
            }
            count2++;
        }
        System.out.println(list1);
    }
}
