package LAB5;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class GetWebpage {

  static void getWebpage(String websiteUrl) throws MalformedURLException, IOException {
    URL url = new URL(websiteUrl);
    // Get web page content (source code) from URL
    try (Scanner sc = new Scanner(url.openStream())) {
      while (sc.hasNext()) {
        System.out.println(sc.nextLine());
      }
    }

    // Get class name of URL object
    Object obj = url.getContent();
    // url.openConnection().
    
    System.out.println("Class name of URL object: " + obj.getClass().getName());
  }

}
