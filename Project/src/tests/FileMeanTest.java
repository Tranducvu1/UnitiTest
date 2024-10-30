package tests;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import org.junit.jupiter.api.Test;

class FileMeanTest {

    @Test
    void writeScoreFile() {
        String fileName = "src/ScoreFile.txt"; // Specify the path to the text file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            // Write scores to the file
            writer.write("45.5\n");
            writer.write("78.2\n");
            writer.write("60.0\n");
            writer.write("91.4\n");
            writer.write("32.0\n");
            System.out.println("Scores written to " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while writing the file.");
            e.printStackTrace();
        }
    }
}
