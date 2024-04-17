package bd3;


import java.io.*;

public class bd3 {
    public static void deleteLine(String filename, int lineNumber) {
        // Create a temporary file
        File inputFile = new File(filename);
        File tempFile = new File("kj.txt");

        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

            String currentLine;
            int lineCounter = 0;

            // Read each line from the original file and write to the temporary file,
            // skipping the line to be deleted
            while ((currentLine = reader.readLine()) != null) {
                lineCounter++;
                if (lineCounter != lineNumber) {
                    writer.write(currentLine + System.getProperty("line.separator"));
                }
            }

            writer.close();
            reader.close();

            // Delete the original file
            if (!inputFile.delete()) {
                System.out.println("Failed to delete the original file.");
                return;
            }

            // Rename the temporary file to the original filename
            if (!tempFile.renameTo(inputFile)) {
                System.out.println("Failed to rename the temporary file.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String filename = "kj";
        int lineNumberToDelete = 1; // Specify the line number to delete
        deleteLine(filename, lineNumberToDelete);
    }
}
