import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        String sourceFile = "source.txt";   // Source file name
        String destFile = "destination.txt"; // Destination file name

        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destFile)) {

            int b;
            while ((b = fis.read()) != -1) {
                fos.write(b); // Write byte to destination
            }

            System.out.println("File copied successfully!");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
