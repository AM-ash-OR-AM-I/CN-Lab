package ASSIGN2;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Q2 {
  public static void readFromFile(String fileName) throws FileNotFoundException {
    long start = System.currentTimeMillis();
    try (FileInputStream fis = new FileInputStream(fileName)) {
      int i;
      while ((i = fis.read()) != -1) {
        // System.out.print((char) i);
      }
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      System.out.println("\nDone reading from file.");
      long end = System.currentTimeMillis();
      System.out.printf("Time taken: %d ms\n", (end - start));
    }
  }

  public static void readFromBufferedFile(String fileName) throws FileNotFoundException {
    long start = System.currentTimeMillis();
    try (FileInputStream fis = new FileInputStream(fileName)) {
      BufferedInputStream bis = new BufferedInputStream(fis);
      int i;
      while ((i = bis.read()) != -1) {
        // System.out.print((char) i);
      }
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      System.out.println("\nDone reading from file.");
      long end = System.currentTimeMillis();
      System.out.println("Time taken: " + (end - start) + "ms");
    }
  }
}
