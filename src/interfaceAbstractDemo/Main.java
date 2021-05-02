package interfaceAbstractDemo;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		
		
		Customer customer = new Customer(1,"Skyman","Sky","19192132287",new Date(2000,6,28));
		Customer customer2 = new Customer(3,"AD","SOYAD","TCNO",new Date(1900,1,12));
		
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(customer);
		customerManager.save(customer2);
		
        
    }
		
}


