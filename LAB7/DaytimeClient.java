import java.io.*;
import java.net.*;

public class DaytimeClient {
    public static void main(String[] args) throws Exception {
        String serverAddress = "time.nist.gov";
        int serverPort = 13;
        Socket socket = new Socket(serverAddress, serverPort);
        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String response;
        while ((response = reader.readLine()) != null) {
            System.out.println("Server Response: " + response);
        }
        socket.close();
    }
}
