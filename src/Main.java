import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws FileNotFoundException {
    String fileName = "test.txt";
    writeToFile(fileName);
    readFromFile(fileName);
  }

  private static void writeToFile(String fileName) throws FileNotFoundException {
    try (Scanner sc = new Scanner(System.in)) {
      FileOutputStream fos = new FileOutputStream(fileName);
      try {
        fos.write(sc.nextLine().getBytes());
        fos.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }

  private static void readFromFile(String fileName) throws FileNotFoundException {
    try (FileInputStream fis = new FileInputStream(fileName)) {
      int i;
      while ((i = fis.read()) != -1) {
        System.out.print((char) i);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
