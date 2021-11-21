/*Assignment:
Develop the following classes.
Customer with customerId, customerName, customerContact properties
Address with city, state, country properties
Override the following methods;
toString(), 
hashcode(), 
equals() for content comparison.*/

//customer class
class Customer{
	String Customer_Name;
	int Customer_Id ;
	String  Customer_contact ;
	public Customer(String customer_Name, int customer_Id, String customer_contact) {
		super();
		Customer_Name = customer_Name;
		Customer_Id = customer_Id;
		Customer_contact = customer_contact;
	}
	//overriding toString method for customer class
	public String toString() {
		
		return Customer_Name+ " "+Customer_Id+" "+Customer_contact;
	}
	public int hashCode() {
		return Customer_Id;
	}
	public boolean equals(Object o) {
		try {
		Customer c1 = (Customer) o;
		
		if (Customer_Name == c1.Customer_Name && Customer_Id == c1.Customer_Id && Customer_contact == c1.Customer_contact )
		return true;
		else
		return false;
		} catch (ClassCastException e) {
		return false;
		} catch (NullPointerException e) {
		return false;
		}
		}

}
//address class
class Address{
	String city;
	String State;
	String country;
	public Address(String city, String state, String country) {
		
		this.city = city;
		this.State = state;
		this.country = country;
	}
	//overriding toString method for address class
public String toString() {
		
		return city+ " "+State+" "+country;
	}
}
public class testt {

	public static void main(String[] args) {
		Customer c= new Customer("ujjwal",1456,"76543772"); //customer class
		Address a= new Address("LUCKNOW","UP","INDIA"); //address class
		System.out.println("toString method overriding in Address class and Customer class");
		System.out.println("===========================================");
		System.out.println(c.toString());
		System.out.println(a.toString());
		System.out.println(new Customer("vaibhaw",1234,"8763542672"));
		System.out.println(new Address("patna","bihar","INDIA"));
		System.out.println("==========================================");
		System.out.println("HASHCODE FOR CUSTOMER CLASS AND ADDRESS CLASS");
		System.out.println("========================================");
		System.out.println(c.hashCode());//RETURNS CUSTOMER ID USING OVERRIDING
		System.out.println(a.hashCode());// ADRESS OF THE OBJECT
		System.out.println("===================================");
		System.out.println("EQUALS METHOD FOR CONTENT COMPARISON");
		Customer c1 = new Customer("ujjwal",1456,"76543772");
		Customer c2= c1;
		Customer c3 = new Customer("vaibhaw",1234,"8763542672");
		System.out.println(c1.equals(c));
		System.out.println(c2.equals(c));
		System.out.println(c1.equals(c3));
	
		
	
	
	

	}

}
