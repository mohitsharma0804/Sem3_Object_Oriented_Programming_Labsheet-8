import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class AccountBeanTest {
    public static void main(String[] args) {
        AccountBean account = new AccountBean(500.0);

        // Add PropertyChangeListener that prints a message on change
        account.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                System.out.println("Property Changed: " + evt.getPropertyName());
                System.out.println("  Old Balance: $" + evt.getOldValue());
                System.out.println("  New Balance: $" + evt.getNewValue());
            }
        });

        System.out.println("Updating balance to $750.0...");
        account.setBalance(750.0);

        System.out.println("Updating balance to $1200.0...");
        account.setBalance(1200.0);
    }
}
