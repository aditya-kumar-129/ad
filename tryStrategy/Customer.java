package tryStrategy;

public abstract class Customer {
	String id, name, typeOfCustomer;
	Discount d;

	public Customer(String id, String name) {
		this.id = id;
		this.name = name;
	}

	void printBill(float amt) {
		System.out.println("\nID: " + id);
		System.out.println("Name: " + name);
		System.out.println("Type of Customer: " + typeOfCustomer);
		System.out.println("Gross Amount: " + amt);
		System.out.println("Discount: " + d.calcDiscount(amt));
		System.out.println("Amount Payable: " + (amt - d.calcDiscount(amt)));
	}
}