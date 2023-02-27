package functionalInterface;

import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {

        System.out.println(isPhoneNumberValid("07000000000"));
        System.out.println(isPhoneNumberValid("0700000000"));
        System.out.println(isPhoneNumberValid("09000980000"));
        System.out.println(" Using Predicate : "+  isPhoneNumberValidPredicate.test("07000000000"));
        System.out.println(" Using Predicate : "+  isPhoneNumberValidPredicate.test("0700000000"));
//// using and
        System.out.println(" is phone number valid and contains 3 =" + isPhoneNumberValidPredicate
                .and(contains3).test("07000030000"));
// Using or
        System.out.println(" is phone number valid and contains 3 =" + isPhoneNumberValidPredicate
                .or(contains3).test("07000000000"));


    }

    /// Java function
    static boolean isPhoneNumberValid(String phoneNumber){

        return phoneNumber.startsWith("07" ) && phoneNumber.length()==11;
    }

    // Java Predicate Function

    static Predicate<String> isPhoneNumberValidPredicate=
            phoneNumber ->
                    phoneNumber.startsWith("07")&&
                            phoneNumber.length()==11;

    static Predicate<String> contains3=
            phoneNumber->
                    phoneNumber.contains("3");
}
