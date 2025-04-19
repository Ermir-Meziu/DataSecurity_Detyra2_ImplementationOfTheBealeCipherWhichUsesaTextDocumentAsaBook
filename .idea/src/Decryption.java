import java.util.ArrayList;

public class Decryption {
    public Decryption(){
    }
    public static String decrypy(String cipherText, ArrayList<String> bookWords){
        String[] numbers = cipherText.split(" ");
        StringBuilder message = new StringBuilder();
        String[] var4 = numbers;
        int var5 = numbers.length;

        for(int var6 = 0; var6 < var5; ++var6){
            String num = var4[var6];
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
