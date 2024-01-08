import java.net.*;

public class DaytimeUDPClient {
  public static void main(String[] args) throws Exception {
    InetAddress address = InetAddress.getByName("localhost");
    DatagramSocket socket = new DatagramSocket();
    socket.send(new DatagramPacket(new byte[1], 1, address, 9876));
    DatagramPacket packet = new DatagramPacket(new byte[1024], 1024);
    socket.receive(packet);
    String received = new String(packet.getData(), 0, packet.getLength());
    System.out.println("Server time: " + received);
  }
}
