public class Customer extends Person
   {
   private String customerNumber;
	private Boolean mailingList;
     
   public Customer(String n, String a, String p, String c, Boolean m)
      {
         super(n,a,p);
         customerNumber = c;
         mailingList = m;
      }

   public String getCustomerNumber()
      {
         return this.customerNumber;
      }
   
   public Boolean getMailingList()
      {
         return this.mailingList;
      }
   }