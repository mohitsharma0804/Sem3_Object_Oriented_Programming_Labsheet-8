import java.io.Serializable;
import java.time.LocalDate;

public class DateBean implements Serializable {
    public DateBean() {}

    // Read-only property (getter only)
    public LocalDate getCurrentDate() {
        return LocalDate.now();
    }

    public static void main(String[] args) {
        DateBean dateBean = new DateBean();
        System.out.println("Today's Date: " + dateBean.getCurrentDate());
    }
}
