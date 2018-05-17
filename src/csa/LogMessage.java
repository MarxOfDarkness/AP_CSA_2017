package csa;

public class LogMessage {
    private String machineID;
    private String description;
    public LogMessage(String message){
        machineID = message.substring(0, message.indexOf(':'));
        description = message.substring(message.indexOf(':'));
    }

    private boolean containsWord(String str){
        if (description.contains(str) && ((description.substring(description.indexOf(str) + 1).equals(' ') || description.indexOf(str) + str.length() == description.length()) || (description.indexOf(str) == 0 || description.substring(description.indexOf(str), description.indexOf(str) + str.length()).equals(" ")))){
            return true;
        }
        return false;
    }
}
