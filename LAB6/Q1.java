package LAB6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.net.HttpCookie;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Scanner;

// WAP to show a simple Cookie Policy that blocks cookies from .gov domains, but allows others

// WAP to download a web page with the correct character set with URL connection.

class Q1 {
  public static void main(String[] args) throws URISyntaxException, IOException {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the domain name: ");
    String domain = sc.nextLine();

    CookieManager cm = new CookieManager();
    sc.close();

    if (domain.endsWith(".gov") || domain.endsWith(".gov.in")) {
      cm.setCookiePolicy(CookiePolicy.ACCEPT_NONE);
      System.out.println("Cookies are blocked");
    } else {
      cm.setCookiePolicy(CookiePolicy.ACCEPT_ALL);
      System.out.println("Cookies are allowed");
    }

    // Download a web page with the correct character set with URL connection.
    CookieHandler.setDefault(cm);

    URL url = new URI(domain).toURL();
    System.out.println("URL: " + url);

    BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));

    String line;
    while ((line = br.readLine()) != null) {
      // System.out.println(line);
    }

    br.close();

    // System.out.println("Cookies: " + cm.getCookieStore().getCookies());
    for (HttpCookie cookie : cm.getCookieStore().getCookies()) {
      System.out.println("Cookie: " + cookie);
    }
  }
}