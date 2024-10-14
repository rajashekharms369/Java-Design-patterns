package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("**Observer Pattern demonstraction**");
        // we have 4 different observers
        Observer roy = new Employee("Roy");
        Observer kevin = new Employee("Kevin");
        Observer bose = new Customer("Bose");
        Observer jacklin = new Customer("Jacklin");
        System.out.println("Working with the comapny: Abc.ltd\n");

        Company abcltd = new SpecificCompany("ABC Lts.");
        // Registering the observers - Roy, Kevin, Bose
        abcltd.register(roy);
        abcltd.register(kevin);
        abcltd.register(bose);
        System.out.println("ABC Lts.'s current stock price is $5.\n");
        abcltd.setStockPrice(5);
        System.out.println("----------");

        // Kevin doesn't want to get further notification
        System.out.println("\nABC Ltd. is removing Kevin from the observer list now.");

        abcltd.unRegister(kevin);
        // No Notification is sent to kevin anymore

        System.out.println("\n ABC Ltd.'s new stock price is $50.");
        abcltd.setStockPrice(50);
        System.out.println("----------");

        System.out.println("\nKevin registers again to get notification from ABC Ltd.");

        abcltd.register(kevin);

        System.out.println("\n ABC Ltd.'s new stock price is $100.");
        abcltd.setStockPrice(100);
        System.out.println("----------");

        System.out.println("\n Working with another company XYZ Co.");
        // Creating another company

        Company xyz = new SpecificCompany("XYZ Co.");
        // Registering the observers Roy and jacklin
         xyz.register(roy);
         xyz.register(kevin);
        System.out.println("\nXYZ Co. new stock price is $500");
        xyz.setStockPrice(500);
    }
}