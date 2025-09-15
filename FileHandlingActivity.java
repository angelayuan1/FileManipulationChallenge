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
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file1))) {
            bufferedWriter.write("Notes message");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file2))) {
            bufferedWriter.write("Data message");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file3))) {
            bufferedWriter.write("Log message");
        } catch (IOException e) {
            e.printStackTrace();
        }
        // d. Read and display file contents
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file1))) {
            System.out.println(bufferedReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file2))) {
            System.out.println(bufferedReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file3))) {
            System.out.println(bufferedReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        // e. Create backup directory
        File dir2 = new File("JavaFileSystem/Backup");
        dir2.mkdir();
        // f. Copy contents to backup file
        
        // g. List all files in both directories
    }
}