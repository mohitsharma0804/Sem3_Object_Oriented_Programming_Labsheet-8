import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class MessageSender {
    public static void main(String[] args) {
        String message = "Ping";
        int port = 6000;
        try (DatagramSocket socket = new DatagramSocket()) {
            byte[] buffer = message.getBytes();
            InetAddress address = InetAddress.getByName("localhost");
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length, address, port);
            
            socket.send(packet);
            System.out.println("Sent UDP message: '" + message + "' to port " + port);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
