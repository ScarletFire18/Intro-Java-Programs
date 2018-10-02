/**
 * Customer Class
 *
 **/

public class Customer extends Person
{
	private String idCustomer;
	private Boolean isInMailingList;


	/*
	 * The no-argument constructor of the object Customer
	 */
	public Customer() {
		idCustomer = "";
		isInMailingList = false;
	}

	/*
	 * The constructor with parameters 
	 * idCustomer, isMailingList
	 */
	public Customer(String id, Boolean isMailing) {
		setIdCustomer(id);
		setIsInMailingList(isMailing);
	}

	/*
	 * This constructor initializes the object with
	 * a name, address, phone, idCustomer, isInMailingList
	 * @param mame
	 * @param address
	 * @param phone
	 * @param idCustomer
	 * @param isInMailingList
	 */
	public Customer(String name, String address, String phone, String idCustomer,
		       	Boolean isInMailingList) {
		
      super.setName(name);
      super.setAddress(address);
      super.setPhone(phone);
      setIdCustomer(idCustomer);
		setIsInMailingList(isInMailingList);
	}

	/*
	 * The setter setIdCustomer to set the field idCustomer
	 */
	public void setIdCustomer(String id) {
		idCustomer = id;
	}

	/*
	 * The getter getCustomerNumber to return the field idCustomer
	 */
	public String getCustomerNumber() {
		return idCustomer;
	}

	/*
	 * The Setter setIsInMailingList to set the field isInMailingList
	 */
	public void setIsInMailingList(Boolean isMailing) {
		isInMailingList = isMailing;
	}

	/*
	 * The Getter getIsInMailingList to return the field isInMailingList
	 */
	public Boolean getMailingList() {
		return isInMailingList;
	}

}

