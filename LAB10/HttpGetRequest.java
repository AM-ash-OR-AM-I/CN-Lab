package LAB10;

import java.io.*;
import java.net.*;
import java.util.*;

public class HttpGetRequest {
  public static void main(String[] args) throws Exception {
    System.out.println("Enter the url:");
    Scanner sc = new Scanner(System.in);
    String url = sc.nextLine();
    URL u = new URI(url).toURL();
    HttpURLConnection connection = (HttpURLConnection) u.openConnection();
    connection.setRequestMethod("GET");
    BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
    String line;
    System.out.println("Response:");
    while ((line = reader.readLine()) != null) {
      System.out.println(line);
      System.out.println("\n");
    }
    connection.disconnect();
  }
}