public class customer {
    private int customerID;
    private String name;
    private String address;
    private String phone;

    public customer(int customerID, String name, String address, String phone) {
        this.customerID = customerID;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public int getCustomerID() { 
      return customerID; 
    }
    public String getName() { 
      return name; 
    }
    public String getAddress() { 
      return address; 
    }
    public String getPhone() { 
      return phone; 
    }
}
