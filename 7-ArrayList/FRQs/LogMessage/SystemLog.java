import java.util.ArrayList;

public class SystemLog {
    private ArrayList<LogMessage> messageList;

    public ArrayList<LogMessage> removeMessages(String keyword){
        // iterate through the list
        // locate items with the keyword
        // add those items to a new list in same order
        // remove the item from the old list in same order
        ArrayList<LogMessage> removed = new ArrayList<LogMessage>();

        for(int i = 0; i < messageList.size(); i++){
            if(messageList.get(i).containsWord(keyword)){
                removed.add(messageList.get(i));
                messageList.remove(i);
                i--;
            }
        }
    return removed;
    }
}
