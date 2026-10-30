import java.beans.BeanInfo;

import java.beans.Introspector;
import java.beans.MethodDescriptor;
import java.beans.PropertyDescriptor;

public class IntrospectorDemo {
    public static void main(String[] args) {
        try {
            BeanInfo beanInfo = Introspector.getBeanInfo(StudentBean.class);

            System.out.println("=== PROPERTIES OF StudentBean ===");
            for (PropertyDescriptor pd : beanInfo.getPropertyDescriptors()) {
                System.out.println("Property: " + pd.getName() + " | Type: " + pd.getPropertyType());
            }

            System.out.println("
=== METHODS OF StudentBean ===");
            for (MethodDescriptor md : beanInfo.getMethodDescriptors()) {
                System.out.println("Method: " + md.getName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
