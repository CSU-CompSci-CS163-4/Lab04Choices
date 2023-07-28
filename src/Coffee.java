public class Coffee {
    private String[] syrups;
    private String size;
    private String typeVal;

    public Coffee(char size, int type, String[] syrups){
        //TODO STUDENT CODE
        //This is where you will put your switch statements for size and type
      
         //provided
        this.syrups = new String[syrups.length];
        for(int i = 0; i < syrups.length; i++){
            this.syrups[i] = syrups[i];
        }
    }

  //this function returns the size of the drink
    public String getSize(){
      //student code
        return "";
    }

   //this function returns the type of the drink
    public String getType(){
      //student code
        return "";
    }

   //this function returns the syrups in the drink
    public String[] getSyrups(){
      //student code
        return null;
    }

   //this function sets the type of the drink
    public void setType(String typ){
        //student code
    }

  //this function sets the size of the drink
   public void setSize(String siz){
      //student code
    }

  //this function sets the syrups for the drink
  public void setSyrups(String[] syrup){  
        this.syrups = new String[syrup.length];
        for(int i = 0; i < syrup.length; i++){
            this.syrups[i] = syrup[i];
        }
    }

  //This function will return the total price of the drink, considering size, type, and syrups
  public double calculatePrice() {
        double price = 0.0;
        //student code--your if statements should go here

        for (String syrup : syrups) {
            //TODO STUDENT CODE
        }
        return price;
    }


    public static void main(String[] args){ }
}
