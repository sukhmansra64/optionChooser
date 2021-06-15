import java.util.Scanner;
import java.io.*;
public class readoption{
    private File file;
    private Scanner inputfile;
    public readoption()throws IOException{
        this.file=new File("text");
        this.inputfile= new Scanner(file);
    }
    public String toRead(){
        return inputfile.nextLine();
    }

}
