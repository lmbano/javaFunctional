package functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class _Supplier {

    public static void main(String[] args) {
        System.out.println(getDBConnectionUrl());
        System.out.println(getDBConnectionUrlSupplier.get());

        System.out.println(getDBConnectionUrlSupplierList.get());

    }


    // java function
    static String getDBConnectionUrl(){

        return "jdbc://localhost:5432/users";
    }

    static Supplier<String> getDBConnectionUrlSupplier=
            ()->"jdbc://localhost:5432/users";

    static Supplier<List<String>> getDBConnectionUrlSupplierList=
            ()-> Arrays.asList("jdbc://localhost:5432/users","Password ", "port");


}
