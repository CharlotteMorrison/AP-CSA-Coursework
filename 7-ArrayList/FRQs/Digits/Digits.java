import java.util.*;
// average points earned 4.10
public class Digits {
    // the private list of digits for this class
    private ArrayList<Integer> digitList;

    // constructs the digit list object
    // precondition num >= 0
    public Digits(int num){
        if(num == 0){
            digitList.add(0, new Integer(0));
        }
        while(num > 0){

            digitList.add(0, new Integer(num % 10));
            num /= 10;
        }
    }
    // returns true if the digits are in strictly increasing order, false if not
    public Boolean isStrictlyIncreasing(){
        // loop through the list compare the value at the current index, with the next index
        // if current value is > = the next value return false
        for(int i = 0; i < digitList.size() - 1; i++){
            if(digitList.get(i) >= digitList.get(i+1)){
                return false;
            }
        }
        return true;
    }
}
