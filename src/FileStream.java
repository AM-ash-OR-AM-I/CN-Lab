import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileStream {
  public static void main(String[] args) throws FileNotFoundException {
    String fileName = "test.txt";
    writeToFile(fileName);
    readFromFile(fileName);
  }

  private static void writeToFile(String fileName) throws FileNotFoundException {
    try (Scanner sc = new Scanner(System.in)) {
      try (FileOutputStream fos = new FileOutputStream(fileName)) {
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
      do {
        i = fis.read();
        if (i != -1) {
          System.out.print((char) i);
        }
      } while (i != -1);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
