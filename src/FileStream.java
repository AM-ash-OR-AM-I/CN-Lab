
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileStream {
  public static void main(String[] args) throws IOException {
    String fileName = "/home/ashucoder/logs/amd-gpu-error2.txt";
    // writeToFile(fileName);
    // appendToFile(fileName, "Hello World!\n");
    readFromBufferedFile(fileName);
    readFromFile(fileName);
  }

  public static void writeToFile(String fileName) throws IOException {
    FileOutputStream fos = new FileOutputStream(fileName);
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("Enter a string: ");
      fos.write(sc.nextLine().getBytes());
    } finally {
      System.out.println("Done writing to file.");
      fos.close();
    }
  }

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

  // Append String to file
  public static void appendToFile(String fileName, String str) throws IOException {
    FileOutputStream fos = new FileOutputStream(fileName, true);
    fos.write(str.getBytes());
    fos.close();
  }
}
