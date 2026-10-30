import java.net.InetAddress;

public class IPAddressDisplay {
    public static void main(String[] args) {
        try {
            InetAddress localHost = InetAddress.getLocalHost();
            System.out.println("Host Name: " + localHost.getHostName());
            System.out.println("IP Address: " + localHost.getHostAddress());
        } catch (Exception e) {
            System.err.println("Error fetching IP address: " + e.getMessage());
        }
    }
}
