# Lab04Choices
Data Type/Control Flow Application Lab

Today we will be practicing if statements, switch statements, and practicing our getters/setters in Java by designing an automated coffee shop order system.

# Step 1: Setting the coffee information - the coffee constructor Coffee(char size, int type, String syrup)
The first thing we need to make for our Coffee class is the Coffee constructor. To make the constructor, find `Coffee(char size, int type, String syrup)`. Set the instance variables size, type, and syrup to the appropriate information. To do this, use if statements to set the variables size and typeVal.
 
Size will either be: 
 ```
's', which should set the class variable size to "small"
'm', which should set the class variable size to "medium"
'l', which should set the class variable size to "large"
Your default size should be "medium"
 ``` 
Type will either be:
 ```
 1, which should set the class variable typeVal to "iced"
 2, which should set the class variable typeVal to "blended"
 3, which should set the class variable typeVal to "hot"
 Your default type should be "hot"
  ```
Syrup will be directly assigned and no switch statements are needed for this section.

   Ex: 
   ```java
   String syrup = "chocolate";
   Coffee myOrder = new Coffee('s', 1, syrup);
   System.out.println("TESTING CONSTRUCTOR SIZE: " + myOrder.size); // should return "small" 
```
# Step 2: Getters and Setters -- getSize(), getType(), getSyrups(), setSize(String siz), setType(String typ), setSyrup(String syrup)
Another basic part of most Java classes are getters and setters. getters get the values of variables and setters set the values of variables. In Coffee, we have three class variables: size, type, syrups. Keep in mind that private variables can ONLY be accessed outside of the class by getters and setters. 

For these functions:
```
1. Make getSize() return the size of the drink
2. Make getType() return the type of drink
3. Make getSyrup() return the current syrup.
4. Make setSize(String size) set the instance variable size to function variable size via following the same rules as the constructor, note that the size will be the first character of the function variable "size" (this will not return anything)
5. Make setType(int type) set the instance variable type using the function variable type via following the same rules as the constructor (this will not return anything)
6. Make setSyrup(String syrup) set the instance variable syrup to the function variable syrup (this will not return anything)
```

  Ex: 
  ```java
   String syrup = "chocolate";
   Coffee myOrder = new Coffee('s', 1, syrup);
   System.out.println("TESTING CONSTRUCTOR SIZE: " + myOrder.getSize()); // should return "small" 
   myOrder.setSize("medium");
   System.out.println("TESTING GET SIZE: " + myOrder.getSize()); // should return "medium"
```
# Step 3: Calculating the Order Price -- calculatePrice()
Things like size, type of drink, and syrups can have an effect on the total price of a coffee order. For the   `calculatePrice() ` method, use either switch or if statements to make the following checks:

 ```
 1. If the size is small, the base price is 3.0. 
 2. If the size is medium, the base price is 4.0. 
 3. If the size is large, the base price is 5.0.
 4. If the order is blended, add an extra 0.5 to the price.
 5. Add aditional cost for the syrup. If the flavor is "none" there is no charge, else if the flavor is "chocolate", "vanilla", or "caramel", it is 0.25, else any other flavor, add 0.5.
 ```

  Ex: 
  ```java
  String syrup1 = "chocolate";
  String syrup2 = "mint";
  Coffee order1 = new Coffee('s', 1, syrup1);
  Coffee order2 = new Coffee('m', 2, syrup2);
  System.out.println("TESTING PRICE: " + order1.calculatePrice()); // This should return 3.25
  System.out.println("TESTING PRICE: " + order2.calculatePrice()); // This should return 5.0
```


# Step 4: Turn It In!
  Turn it in Canvas and wait for feedback from RamDesk

# Reminder: Switch Cases
There are some times when the only thing your if statement is checking is the value of a single variable. In these cases, it is easier to use a *switch statement*. All cases in a switch statement should be terminated by a break, or they will walk through into the next case without checking for correctness until they reach a break statement.

Example:
```
switch(i) {
            case(0):
                System.out.println("Zero");
                break;
            case(1):
                System.out.println("One");
            case(2):
                System.out.println("Two");
                break;
            default:
                System.out.println("Number");
            
        }
  ```
  For i = 1, the print would be:
  ```
  One
  Two
  ```
  While i = 0 would print:
  ```
  Zero
  ```
  i = 17 would print:
  ```
  Number
  ```
  because there is no case for 17, so it goes to the default.
