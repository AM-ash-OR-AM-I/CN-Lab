import java.io.*;
import java.net.*;

class DatagramExample {
  public static void main(String[] args) {
    String s = "This is a test.";
    try {
      byte[] data = s.getBytes("UTF-8");
      InetAddress ia = InetAddress.getByName("www.ibiblio.org");
      int port = 7;
      DatagramSocket socket = new DatagramSocket(0);
      DatagramPacket outgoing = new DatagramPacket(data, data.length, ia, port);
      socket.send(outgoing);
      System.out.println("This packet is addressed to " + outgoing.getAddress() + " on port " + outgoing.getPort());
      System.out.println("There are " + outgoing.getLength() + " bytes of data in the packet");
      String test = new String(outgoing.getData(), outgoing.getOffset(), outgoing.getLength(), "UTF-8");
      System.out.println(test);
    } catch (Exception ex) {
      System.err.println(ex);
    }
  }
}
