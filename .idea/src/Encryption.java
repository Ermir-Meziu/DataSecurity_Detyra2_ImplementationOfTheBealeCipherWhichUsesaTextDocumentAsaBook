import java.util.ArrayList;

public class Encryption {
    public static String encrypt(String message, ArrayList<String> bookWords){
        message = message.toLowerCase().replaceAll(" ","");
        StringBuilder cipher = new StringBuilder();
        for(char letter:message.toCharArray()){
            boolean found = false;
            for(int i = 0; i < bookWords.size(); i++){
                if(bookWords.get(i).startsWith(String.valueOf(letter))){
                    cipher.append(i+1).append(" ");
                    found = true;
                    break;
                }
            }
            if(!found){
                cipher.append("0 ");
            }
        }
        return cipher.toString();
    }
}
