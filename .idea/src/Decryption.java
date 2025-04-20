import java.util.ArrayList;

public class Decryption {
    public Decryption(){
    }
    public static String decrypy(String cipherText, ArrayList<String> bookWords){
        String[] numbers = cipherText.split(" ");
        StringBuilder message = new StringBuilder();

        for(String num : numbers){
            int index = Integer.parseInt(num) - 1;
            if(index >= 0 && index < bookWords.size()){
                message.append(((String)bookWords.get(index)).charAt(0));
            } else {
                message.append("?");
            }
        }

        return message.toString();
    }
}
