import java.util.ArrayList;

public class Delimiters {
    /* The open and close delimiters */
    private String openDel;
    private String closeDel;

    /* Constructs a Delimiters object where open is the open delimiter and close is the close delimeter
     * Precondition: open and close delimiter are non-empty strings.
     */
    public Delimiters(String open, String close) {
        openDel = open;
        closeDel = close;
    }
    /* Returns an ArrayList of delimiters from the array tokens, as described in part (a). */
    public ArrayList<String> getDelimitersList (String[] tokens){
        // implemented in part a
        //loop through the list, if it is a delimiter, add to arraylist
        ArrayList<String> delims = new ArrayList<String>();
        for(int i = 0; i < tokens.length; i++) {
            if (tokens[i].equals(openDel)) {
                delims.add(tokens[i]);
            } else if (tokens[i].equals(closeDel)) {
                delims.add(tokens[i]);
            }

            // a more simplified way...
            if (tokens[i].equals(openDel) || tokens[i].equals(closeDel)) {
                delims.add(tokens[i]);
            }
        }
        return(delims);
    }

    /* Returns true if the delimiters are balanced and false otherwise as described in part (b).
     * Precondition: delimiters contains only valid open and close delimiters.
     */
    public Boolean isBalanced(ArrayList<String> delimiters){
        // implemented in part b
        // store a count of open/close delimiters
        int openNum = 0;
        int closeNum = 0;
        // loop through the list increment the counters
        for(int i = 0; i < delimiters.size(); i++){
            // check if value at i is delimiter
            if(delimiters.get(i).equals(openDel)){
                openNum++;
            }else if (delimiters.get(i).equals(closeDel)){
                closeNum++;
            }
            // each loop test to see if the # of open is greater than close
            if(openNum < closeNum){
                return false;
            }
        }
        // if open is greater than close, end- not balanced
        if(openNum > closeNum){
            return false;
        }else {
            // at the end check if both counts are equal in length
            return true;
        }
    }
    // there may be instance variables, constructors and methods not shown.
}
