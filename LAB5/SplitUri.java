package LAB5;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Scanner;

public class SplitUri {

  static void splitURI() throws URISyntaxException {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter a URL: ");
      String url = sc.nextLine();
      URI uri = new URI(url);
      System.out.println("URI: " + uri.toASCIIString());

      System.out.printf("Scheme: %s\nHost: %s\nPort: %d\nPath: %s\nQuery: %s\nFragment: %s\n",
          uri.getScheme(),
          uri.getAuthority(), uri.getPort(), uri.getPath(), uri.getQuery(), uri.getFragment());
    }
  }

}
