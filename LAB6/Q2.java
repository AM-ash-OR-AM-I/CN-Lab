package LAB6;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Scanner;

// WAP to download a web page with the correct character set with URL connection.
public class Q2 {
  public static void main(String[] args) throws MalformedURLException, URISyntaxException {
    // Download a web page with the correct character set with URL connection.

    System.out.print("Enter the url: ");
    Scanner sc = new Scanner(System.in);
    String website = sc.nextLine();
    sc.close();
    URL url = new URI(website).toURL();
    String encoding = "ISO-8859-1";

    System.out.println("URL: " + url);

    

  }
}
