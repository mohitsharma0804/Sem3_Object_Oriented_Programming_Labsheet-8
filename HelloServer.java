import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class HelloServer {
    public static void main(String[] args) {
        int port = 5000;
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("HelloServer listening on port " + port + "...");
            Socket socket = serverSocket.accept();
            System.out.println("Client connected");

            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String clientMessage = in.readLine();
            if (clientMessage != null) {
                System.out.println("Received from client: " + clientMessage);
            }

            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
