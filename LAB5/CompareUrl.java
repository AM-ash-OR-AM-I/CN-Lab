package LAB5;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

public class CompareUrl {

  public static void compareURL(String url1, String url2) throws MalformedURLException, URISyntaxException {
    URL urlObj1 = new URL(url1);
    URL urlObj2 = new URL(url2);
  
    if (urlObj1.equals(urlObj2)) {
      System.out.println("URLs are equal");
    } else {
      System.out.println("URLs are not equal");
    }
  
  }
  
}
