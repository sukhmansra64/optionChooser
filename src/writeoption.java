import java.io.*;
public class writeoption {
    private FileWriter fw;
    private PrintWriter outputfile;
    private File file;
    public writeoption() throws IOException{
        this.fw= new FileWriter("text");
        this.outputfile = new PrintWriter(fw);
        this.file = new File("text");
    }
    public void toWrite(String s) throws IOException{
        outputfile.println(s);
    }
    public void close(){
        outputfile.close();
    }
    public void firstWrite(String s){
        outputfile.print(s);
    }
}
