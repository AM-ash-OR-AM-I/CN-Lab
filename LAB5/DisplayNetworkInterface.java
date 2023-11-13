package LAB5;

import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

public class DisplayNetworkInterface {
  public static void main(String[] args) throws SocketException {
    Enumeration<NetworkInterface> networkDevices = NetworkInterface.getNetworkInterfaces();
    while (networkDevices.hasMoreElements()) {
      NetworkInterface ni = networkDevices.nextElement();
      System.out.println(ni);
    }
  }
}
