import java.io.*;

public class FileManipulation {
    public static void main(String[] args) {
        String fileName = "example.txt";
        String data = "Hello! This is a sample text.\nWelcome to Java file handling.";

        // Write to file
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(data);
            System.out.println("Data written to file successfully.");
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }

        // Read from file
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            System.out.println("\nContents of the file:");
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
