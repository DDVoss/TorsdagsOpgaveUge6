package Task1;

import java.util.ArrayList;

public class MainTask1 {
    private static ArrayList <Customer> customersArr = new ArrayList <Customer>();

    public static void main(String[]args){
        customersArr.add(new Customer("Daniel" , "Voss", "DVoss"));
        customersArr.add(new Customer("Lasse" , "Jensen", "LJensen01"));

        printCustomers(customersArr);
    }

    static void printCustomers(ArrayList <Customer> customersArr){
        for (Customer person: customersArr) {
            System.out.println(person);
        }
    }
}
