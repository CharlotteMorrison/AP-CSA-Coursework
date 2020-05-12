// average score 2.94

public class LogMessage {
    private String machineID;
    private String description;

    //constructor part a
    public LogMessage(String message){
        // ap solution
        int colon = message.indexOf(":");
        machineID = message.substring(0, colon);
        description = message.substring(colon + 1);
        // Jatyn's suggestion
        String[] words = message.split(":");
        machineID = words[0];
        description = words[1];

    }
    // part b
    public boolean containsWord(String keyword){
        // keyword must be a substring
        // keyword is either the first word, or has a space before it
        // keyword is either last word or has a space after it
        if(description.equals(keyword)){
            return true;
        }
        //disk is in the drive
        if(description.indexOf(keyword + " ") == 0){
            return true;
        }
        // i have a disk i need
        if(description.indexOf(" " + keyword + " ") != -1){
            return true;
        }
        if (description.length() > keyword.length()){
            // there is no disk
            if(description.substring(description.length() - keyword.length() - 1).equals(" " + keyword)){
                return true;
            }
        }
        return false;
    }
    public String getMachineID(){
        return machineID;
    }
    public String getDescription(){
        return description;
    }

}
