public class Coffee {
  private String syrup;
  private String size;
  private String type;

  public Coffee(char size, int type, String syrup) {
    // TODO STUDENT CODE
    switch (size) {
      case ('s'):
        this.size = "small";
        break;
      // TODO: Finish remaining Sizes
    }
    // TODO: Write Switch Case for "type"
    
    // TODO: Assign Syrup
  }

  public String getSize() {
    return "";
  }

  public String getType() {
    return "";
  }

  public String getSyrup() {
    return "";
  }

  public void setType(int type) {
    // TODO: Finish
  }

  public void setSize(String size) {
    // TODO: Finish
  }

  public void setSyrup(String syrup) {
    // TODO: Finish
  }

  public double calculatePrice() {
    double price = 0.0;
    // Set Initial Price based on Size, Small=3, Medium=4, Large = 5

    // Check if blended and add 0.5 if it is

    // Check Syrup flavor and adjust cost
    return price;
  }

  public static void main(String[] args) {
  }
}
