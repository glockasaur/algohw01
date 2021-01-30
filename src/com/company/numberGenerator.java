package com.company;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class numberGenerator {

  static void generateRandom(int numEntered) throws IOException {

    if (numEntered == 10) {
      File out = new File("10keys.txt");
      FileWriter fw = null;
      // Try block: Most stream operations may throw IO exception
      try {
        // Create file writer object
        fw = new FileWriter(out);
        // Wrap the writer with buffered streams
        BufferedWriter writer = new BufferedWriter(fw);
        int line;
        Random random = new Random();
        while (numEntered > 0) {
          // Randomize an integer and write it to the output file
          line = random.nextInt(1000);
          writer.write(line + "\n");
          numEntered--;
        }
        // Close the stream
        writer.close();
      } catch (IOException e) {
        e.printStackTrace();
        System.exit(0);
      }

    } else if (numEntered == 100) {
      File out = new File("100keys.txt");
      FileWriter fw = null;
      // int n = 512;
      // Try block: Most stream operations may throw IO exception
      try {
        // Create file writer object
        fw = new FileWriter(out);
        // Wrap the writer with buffered streams
        BufferedWriter writer = new BufferedWriter(fw);
        int line;
        Random random = new Random();
        while (numEntered > 0) {
          // Randomize an integer and write it to the output file
          line = random.nextInt(1000);
          writer.write(line + "\n");
          numEntered--;
        }
        // Close the stream
        writer.close();
      } catch (IOException e) {
        e.printStackTrace();
        System.exit(0);
      }
    } else if (numEntered == 1000) {
      File out = new File("1000keys.txt");
      FileWriter fw = null;
      // int n = 512;
      // Try block: Most stream operations may throw IO exception
      try {
        // Create file writer object
        fw = new FileWriter(out);
        // Wrap the writer with buffered streams
        BufferedWriter writer = new BufferedWriter(fw);
        int line;
        Random random = new Random();
        while (numEntered > 0) {
          // Randomize an integer and write it to the output file
          line = random.nextInt(1000);
          writer.write(line + "\n");
          numEntered--;
        }
        // Close the stream
        writer.close();
      } catch (IOException e) {
        e.printStackTrace();
        System.exit(0);
      }
    } else if (numEntered == 10000) {
      File out = new File("10000keys.txt");
      FileWriter fw = null;
      // int n = 512;
      // Try block: Most stream operations may throw IO exception
      try {
        // Create file writer object
        fw = new FileWriter(out);
        // Wrap the writer with buffered streams
        BufferedWriter writer = new BufferedWriter(fw);
        int line;
        Random random = new Random();
        while (numEntered > 0) {
          // Randomize an integer and write it to the output file
          line = random.nextInt(1000);
          writer.write(line + "\n");
          numEntered--;
        }
        // Close the stream
        writer.close();
      } catch (IOException e) {
        e.printStackTrace();
        System.exit(0);
      }
    }
    else if (numEntered == 100000) {
      File out = new File("100000keys.txt");
      FileWriter fw = null;
      // int n = 512;
      // Try block: Most stream operations may throw IO exception
      try {
        // Create file writer object
        fw = new FileWriter(out);
        // Wrap the writer with buffered streams
        BufferedWriter writer = new BufferedWriter(fw);
        int line;
        Random random = new Random();
        while (numEntered > 0) {
          // Randomize an integer and write it to the output file
          line = random.nextInt(1000);
          writer.write(line + "\n");
          numEntered--;
        }
        // Close the stream
        writer.close();
      } catch (IOException e) {
        e.printStackTrace();
        System.exit(0);
      }
    }
    else if (numEntered == 1000000) {
      File out = new File("1000000keys.txt");
      FileWriter fw = null;
      // int n = 512;
      // Try block: Most stream operations may throw IO exception
      try {
        // Create file writer object
        fw = new FileWriter(out);
        // Wrap the writer with buffered streams
        BufferedWriter writer = new BufferedWriter(fw);
        int line;
        Random random = new Random();
        while (numEntered > 0) {
          // Randomize an integer and write it to the output file
          line = random.nextInt(1000);
          writer.write(line + "\n");
          numEntered--;
        }
        // Close the stream
        writer.close();
      } catch (IOException e) {
        e.printStackTrace();
        System.exit(0);
      }
    }
  }
}
