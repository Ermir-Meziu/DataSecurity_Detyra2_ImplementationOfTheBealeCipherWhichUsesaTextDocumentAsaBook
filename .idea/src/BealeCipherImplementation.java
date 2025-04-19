import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class BealeCipherImplementation {
    public static void generateBookFile(String fileName) {
        try {
            FileWriter fw = new FileWriter(fileName);
            fw.write("apple banana cat dog elephant fox grape house igloo jar kite lion moon nose owl panda queen rose sun tiger umbrella violin whale xylophone yellow zebra");
            fw.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static ArrayList<String> loadBook(String fileName) {
        ArrayList<String> words = new ArrayList<>();
        try {
            File file = new File(fileName);
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String word = sc.next().toLowerCase();
                words.add(word);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return words;
    }
}
