import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileDownloader {
    public static void main(String[] args) {
        String fileURL = "https://www.example.com/sample.txt";
        String savePath = "sample.txt";

        try {
            URL url = new URL(fileURL);
            URLConnection connection = url.openConnection();
            connection.setRequestProperty("User-Agent", "Mozilla/5.0");

            try (InputStream in = connection.getInputStream()) {
                Files.copy(in, Paths.get(savePath), StandardCopyOption.REPLACE_EXISTING);
                System.out.println("File downloaded successfully to: " + savePath);
            }
        } catch (Exception e) {
            System.err.println("Download failed: " + e.getMessage());
        }
    }
}
