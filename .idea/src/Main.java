import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String bookFile = "book.txt";
        BealeCipherImplementation.generateBookFile(bookFile);

        ArrayList<String> bookWords = BealeCipherImplementation.loadBook(bookFile);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Mesazhi: ");
        String mesazhi = scanner.nextLine();
        System.out.println();

        Interaktiv.menyra(mesazhi, bookWords);
    }
}
class Interaktiv{
    public static void menyra(String message, ArrayList<String> bookWords){
        Scanner scanner = new Scanner(System.in);
        String encryptedMessage ="";
        while (true){
            menu();
            System.out.print("Zgjedhja juaj:");
            int choice = scanner.nextInt();
            System.out.println();
            scanner.nextLine();

            if (choice ==1){
                System.out.println("Enkriptimi");
                System.out.println("-----------");
                encryptedMessage = Encryption.encrypt(message, bookWords);
                System.out.println("Encrypted Message: " + encryptedMessage);
                System.out.println(" ");
            }
            else if(choice == 2){
                System.out.println("Dekriptimi");
                System.out.println("------------");
                String decryptedMessage=Decryption.decrypy(encryptedMessage,bookWords);
                System.out.println("Decrypted Message: " + decryptedMessage);
                System.out.println(" ");
            }
            else if(choice == 3){
                System.out.print("Mesazhi: ");
                message = scanner.nextLine();
                System.out.println();
            }
            else if(choice == 4){
                System.out.println("Programi ndaloi");
                break;
            }
            else{
                System.out.println("Perzgjedhja e gabuar, shiko menun dhe zgjedh perseri!!");
            }
        }
    }
    public static void menu()
    {
        System.out.println("1.Enkritpim.");
        System.out.println("2.Dekriptim.");
        System.out.println("3.Zgjedh nje mesazh te ri.");
        System.out.println("4.Ndalo programin");
        System.out.println();
    }
}