package ASSIGN4;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Enumeration;
import java.util.Scanner;

public class LocalHost {
  public static void main(String[] args) {

    try {
      getIPAddress();
      getHostAddress();
      checkIPVersion();
      networkDevices();
    } catch (UnknownHostException e) {
      e.printStackTrace();
    } catch (SocketException e) {
      e.printStackTrace();
    }
  }

  private static void getIPAddress() throws UnknownHostException {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("Enter domain name: ");
      String domain = sc.nextLine();
      InetAddress ipAddress = InetAddress.getByName(domain);
      System.out.printf("IP Addresses of %s: %s\n", domain, ipAddress.getHostAddress());
    }
  }

  private static void getHostAddress() throws UnknownHostException {
    InetAddress ip;
    ip = InetAddress.getLocalHost();
    System.out.printf("Host Name: %s, ip address: %s\n", ip.getHostName(), ip.getHostAddress());
  }

  // Input IP Address in either IPv4 or IPv6, check if it's v4 or v6 and show
  // output accordingly.
  private static void checkIPVersion() throws UnknownHostException {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter IP Address: ");
      String ipAddress = sc.nextLine();
      InetAddress ip = InetAddress.getByName(ipAddress);
      System.out.println("Host Name: " + ip.getHostName());
      if (ip instanceof java.net.Inet4Address) {
        System.out.printf("IP Address: %s is IPv4\n", ipAddress);
      } else if (ip instanceof java.net.Inet6Address) {
        System.out.printf("IP Address: %s is IPv6\n", ipAddress);
      } else {
        System.out.printf("IP Address: %s is neither IPv4 nor IPv6\n", ipAddress);
      }
    }
  }

  public static void networkDevices() throws SocketException {
    Enumeration<NetworkInterface> networkDevices = NetworkInterface.getNetworkInterfaces();
    while (networkDevices.hasMoreElements()) {
      NetworkInterface ni = networkDevices.nextElement();
      System.out.println(ni);
    }
  }
}
