package academy.devdojo.javaoneforall.javacore.Kenum.test;

import academy.devdojo.javaoneforall.javacore.Kenum.domain.Customer;
import academy.devdojo.javaoneforall.javacore.Kenum.domain.CustomerType;
import academy.devdojo.javaoneforall.javacore.Kenum.domain.PaymentType;

public class CustomerTest01 {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Tsubasa", CustomerType.INDIVIDUAL, PaymentType.DEBIT);
        Customer customer2 = new Customer("Akira", CustomerType.COMPANY, PaymentType.CREDIT);

        System.out.println(customer1);
        System.out.println(customer2);

        System.out.println(PaymentType.DEBIT.calculateDiscount(100));
        System.out.println(PaymentType.CREDIT.calculateDiscount(100));
        CustomerType customerType = CustomerType.getByDbValue(1);
        System.out.println(customerType);
    }
}
