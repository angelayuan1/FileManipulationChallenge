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
        File file4 = new File("JavaFileSystem/Backup/backup.txt");
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file4))) {
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file1))) {
                String s;
                while ((s = bufferedReader.readLine()) != null) {
                    bufferedWriter.write(s);
                    bufferedWriter.newLine();
                }
            }
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file2))) {
                String s;
                while ((s = bufferedReader.readLine()) != null) {
                    bufferedWriter.write(s);
                    bufferedWriter.newLine();
                }
            }
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file3))) {
                String s;
                while ((s = bufferedReader.readLine()) != null) {
                    bufferedWriter.write(s);
                    bufferedWriter.newLine();
                }
            }
        }
        // g. List all files in both directories
        for (File f : dir.listFiles()) System.out.println(f.getName());
        for (File f : dir2.listFiles()) System.out.println(f.getName());

        // Activity 3
        debugFileOperation();
    }

    public static void debugFileOperation() {
        try {
            // Creating a file with an invalid name (forward slash is invalid for file names on many OS)
            File file = new File("fileName.txt");
            
            // Attempting to write to the invalid file
            FileWriter writer = new FileWriter(file); // the FileNotFoundException is thrown because there is a forward slash before the name, which is invalid since it means trying to go into the root folder, which is read-only, so the program can't write anything there, making it throw an error.
            writer.write("Will this fail?");
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace(); 
        }
    }
}