import java.net.*;
import java.time.*;

public class DaytimeUDPServer {
  public static void main(String[] args) throws Exception {
    DatagramSocket socket = new DatagramSocket(9876);
    System.out.println("Server is running...");
    DatagramPacket packet = new DatagramPacket(new byte[1], 1);
    socket.receive(packet);
    String dateTime = LocalDateTime.now().toString();
    byte[] data = dateTime.getBytes();
    packet = new DatagramPacket(data, data.length, packet.getAddress(), packet.getPort());
    socket.send(packet);
  }
}
