import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;

public class AccountBean implements Serializable {
    private double balance;
    private PropertyChangeSupport pcs = new PropertyChangeSupport(this);

    public AccountBean() {}

    public AccountBean(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double newBalance) {
        double oldBalance = this.balance;
        this.balance = newBalance;
        pcs.firePropertyChange("balance", oldBalance, newBalance);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        pcs.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        pcs.removePropertyChangeListener(listener);
    }
}
