import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class MessageReceiver {
    public static void main(String[] args) {
        int port = 6000;
        try (DatagramSocket socket = new DatagramSocket(port)) {
            System.out.println("UDP MessageReceiver listening on port " + port + "...");
            byte[] buffer = new byte[1024];
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
            
            socket.receive(packet);
            String received = new String(packet.getData(), 0, packet.getLength());
            System.out.println("Received UDP message: " + received);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
