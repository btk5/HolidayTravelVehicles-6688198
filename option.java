public class option {
  
    private String optionCode;
    private String description;
    private double price;

    public option(String optionCode, String description, double price) {
        this.optionCode = optionCode;
        this.description = description;
        this.price = price;
    }

    public String getOptionCode() { 
      return optionCode; 
    }
    public String getDescription() { 
      return description; 
    }
    public double getPrice() { 
      return price; 
    }
}
