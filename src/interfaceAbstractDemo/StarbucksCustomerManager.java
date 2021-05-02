package interfaceAbstractDemo;

public class StarbucksCustomerManager extends BaseCustomerManager{

	private CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService personCheckService) {
		
		this.customerCheckService = personCheckService;
	}

	@Override
	public void save(Customer customer) {
		if(customerCheckService.checkIfRealPerson(customer)) {
			System.out.println("Saved to Starbucks db: "+customer.getFirstName());
		}else {
			System.out.println("Not a valid person");
		}
			
	}
}
