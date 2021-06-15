import java.util.Scanner;
import java.io.*;
import java.util.Random;
public class optionChooserDemo {
    public static void main(String[]args)throws IOException{
        Random rand = new Random();
        writeoption write = new writeoption();
        readoption read = new readoption();
        Scanner in = new Scanner(System.in);
        String option ="";
        String writeAnOption;
        int numberOfOptions;
        System.out.println("How many options are you deciding between?");
        numberOfOptions=in.nextInt();
        System.out.println("Enter an option: ");
        writeAnOption = in.nextLine();
        write.firstWrite(writeAnOption);
        for(int i=0;i<numberOfOptions;i++){
            System.out.println("Enter an option: ");
            writeAnOption = in.nextLine();
            write.toWrite(writeAnOption);
        }
        write.close();
        int randomnumber=rand.nextInt(numberOfOptions);
        for (int i=0;i<randomnumber;i++){
            option = read.toRead();
        }
        System.out.println("This is the option I came up with: "+option);
    }
}
