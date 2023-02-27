package functionalInterface;

import jdk.internal.net.http.ResponseSubscribers;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {

// Using Normal java function
        Customer alec_mbano_ = new Customer("Alec Mbano ", "0998383");
        greetCustomer(alec_mbano_);

        // using Consumer Functional interface
        greetCustomerConsumer.accept(alec_mbano_);

        greetCustomerConsumerV2.accept(alec_mbano_,false);
    }


   // Java function
    static void greetCustomer(Customer customer){

        System.out.println("Hello "+ customer.customerName +
                "Thanks for registering phone number "+
                customer.customerPhoneNumber);
    }
// Consumer Function
    static Consumer<Customer> greetCustomerConsumer=
            customer -> System.out.println("Hello : "+
                    customer.customerName+ " Thanks for registering phone number "+
                    customer.customerPhoneNumber + "Using consumer fucntion");

// BiConsumer Function
    static BiConsumer<Customer,Boolean> greetCustomerConsumerV2=
        (customer , showPhoneNumber)-> System.out.println("Hello : "+
                    customer.customerName+ " Thanks for registering phone number Using BiConsumer function : "+
                (showPhoneNumber? customer.customerPhoneNumber : "******* "));


    static class Customer{

        private final String customerName;
        private final String customerPhoneNumber;


        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }

        @Override
        public String toString() {
            return "Customer{" +
                    "customerName='" + customerName + '\'' +
                    ", customerPhoneNumber='" + customerPhoneNumber + '\'' +
                    '}';
        }
    }
}
