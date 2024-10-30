package tests;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import org.junit.jupiter.api.Test;
/**
 * this class contain unit test for the filemean functionalty
 * 
 */
class FileMeanTest {

    @Test
    void writeScoreFile() {
        String fileName = "src/ScoreFile.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
        	 // Write scores to file
            writer.write("45.5\n");
            writer.write("78.2\n");
            writer.write("60.0\n");
            writer.write("91.4\n");
            writer.write("32.0\n");
            
            //print if success
            System.out.println("Scores written to " + fileName);
        } catch (IOException e) {
        	//validate to error
            System.out.println("An error occurred while writing the file.");
            e.printStackTrace();
        }
    }
}
