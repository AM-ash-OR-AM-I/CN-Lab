package ASSIGN2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Q1 {
  public static void main(String[] args) throws IOException {
    String fileName = "/home/ashucoder/Downloads/file.txt";
    writeToFile(fileName);
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
}