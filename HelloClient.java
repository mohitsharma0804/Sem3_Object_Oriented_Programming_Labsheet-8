import java.io.PrintWriter;
import java.net.Socket;

public class HelloClient {
    public static void main(String[] args) {
        String host = "localhost";
        int port = 5000;
        try (Socket socket = new Socket(host, port)) {
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            out.println("Hello Server");
            System.out.println("Message sent to server: Hello Server");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
