import java.io.Serializable;

public class UserBean implements Serializable {
    private String username;
    private String password;

    public UserBean() {}

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    // Write-only property (setter only)
    public void setPassword(String password) {
        this.password = password;
        System.out.println("Password has been set securely.");
    }

    public static void main(String[] args) {
        UserBean user = new UserBean();
        user.setUsername("john_doe");
        user.setPassword("SecretPass123!");
    }
}
