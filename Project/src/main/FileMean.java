package main;
//FileMean.java
import java.io.*;
import java.util.Scanner;

public class FileMean {
 public void findMean(String fileName) {
     float sumOfScores = 0.0f;
     int numberOfScores = 0;
     float mean = 0.0f;
     float score;
     
     try {
         File file = new File(fileName);
         Scanner scanner = new Scanner(file);
         
         while (scanner.hasNextFloat()) {
             score = scanner.nextFloat();
            
             if (score > 0.0) {
                 sumOfScores = sumOfScores + score;
                 numberOfScores++;
             }
         }
         
         scanner.close();
         
         if (numberOfScores > 0) {
             mean = sumOfScores / numberOfScores;
             System.out.printf("The mean score is %.2f\n", mean);
         } else {
             System.out.println("No scores found in file\n");
         }
         
     } catch (FileNotFoundException e) {
         System.out.println("Error: File not found");
     }
 }
}