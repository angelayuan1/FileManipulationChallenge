import java.io.*;

public class FileHandlingActivity {
    public static void main(String[] args) throws IOException {
        // Your code here
        
        // a. Create main directory
        File dir = new File("JavaFileSystem");
        dir.mkdir();
        // b. Create three text files
        File file1 = new File("JavaFileSystem/notes.txt");
        file1.createNewFile();
        File file2 = new File("JavaFileSystem/data.txt");
        file2.createNewFile();
        File file3 = new File("JavaFileSystem/log.txt");
        file3.createNewFile();
        // c. Write messages to files
        
        // d. Read and display file contents
        
        // e. Create backup directory
        
        // f. Copy contents to backup file
        
        // g. List all files in both directories
    }
}