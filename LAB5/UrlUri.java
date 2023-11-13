package LAB5;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Scanner;
import java.io.BufferedReader;

public class UrlUri {
  public static void main(String[] args) {

    String url = "https://www.google.com?Hello+World";
    try {
      getURI(url);
    } catch (URISyntaxException e) {
      e.printStackTrace();
    }

    // try {
    // getURL(url);
    // } catch (MalformedURLException e) {
    // e.printStackTrace();
    // } catch (IOException e) {
    // e.printStackTrace();
    // }
  }

  private static void getURI(String url) throws URISyntaxException {
    URI uri = new URI(url);
    System.out.printf("Scheme: %s\nHost: %s\nPort: %d\nPath: %s\nQuery: %s\nFragment: %s\n", uri.getScheme(),
        uri.getHost(), uri.getPort(), uri.getPath(), uri.getQuery(), uri.getFragment());
  }

  private static void getURL(String websiteUrl) throws MalformedURLException, IOException {
    URL url = new URL(websiteUrl);
    // Get web page content (source code) from URL
    try (Scanner sc = new Scanner(url.openStream())) {
      while (sc.hasNext()) {
        System.out.println(sc.nextLine());
      }
    }

    // Get web page content (source code) from URL using BufferedReader
    try (BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()))) {
      String line;
      while ((line = br.readLine()) != null) {
        System.out.println(line);
      }
    }

    // Get class name of URL object
    Object obj = url.getContent();
    System.out.println("Class name of URL object: " + obj.getClass().getName());
  }
}
