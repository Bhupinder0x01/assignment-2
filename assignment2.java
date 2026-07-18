// UCampus Cafeteria Management System Assignment

// Problem Statement
// UCampus has one central cafeteria that serves students and staff. Every food item belongs to the same cafeteria, and the cafeteria has a common service charge that applies to all food items. Develop a Java program to manage the cafeteria menu.

// Create a class named FoodItem.
// Instance Variables
// - int itemId
// - String itemName- double price
// Static Variables
// - String cafeteriaName = "UCampus Cafeteria"
// - double serviceCharge = 10.0 - int totalFoodItems = 0
// Instance Methods
// 1. addFoodItem(int id, String name, double price)
// • Assign values to the instance variables.
// • Increase totalFoodItems by 1 whenever a new food item is added.
// 2. calculateFinalPrice()
//  • Final Price = Price + (Price × Service Charge / 100)

// 3. displayItemDetails()
//  • Display Item ID, Item Name, Original Price, and Final Price.

// Static Methods
// 1. changeServiceCharge(double newCharge)
//  • Update the service charge for the cafeteria.

// 2. displayCafeteriaDetails()
//  • Display Cafeteria Name, Current Service Charge, and Total Food Items.

// Sample Driver Code
// FoodItem item1 = new FoodItem();
// FoodItem item2 = new FoodItem(); FoodItem item3 = new FoodItem();

// item1.addFoodItem(101, "Veg Sandwich", 80); item2.addFoodItem(102, "Cold Coffee", 120); item3.addFoodItem(103, "Paneer Wrap", 150); FoodItem.displayCafeteriaDetails();

// item1.displayItemDetails(); item2.displayItemDetails(); item3.displayItemDetails(); FoodItem.changeServiceCharge(15); System.out.println("After Updating Service Charge");
// item1.displayItemDetails(); item2.displayItemDetails(); item3.displayItemDetails();
 
 
// answer :
public class assignment2 {
 
   int itemId;
   String itemName;
   double price;
 
   static String cafeteriaName = "UCampus Cafeteria";
   static double serviceCharge = 10.0;
   static int totalFoodItems = 0;
 
 
   void addFoodItem(int id, String name, double price) {
       this.itemId = id;
       this.itemName = name;
       this.price = price;
       totalFoodItems++;
   }
 
   double calculateFinalPrice() {
       return price + (price * serviceCharge / 100);
   }
 
   void displayItemDetails() {
       System.out.println("Item ID       : " + itemId);
       System.out.println("Item Name     : " + itemName);
       System.out.println("Original Price: " + price);
       System.out.println("Final Price   : " + calculateFinalPrice());
       System.out.println();
   }
 
   static void changeServiceCharge(double newCharge) {
       serviceCharge = newCharge;
   }
 
   static void displayCafeteriaDetails() {
       System.out.println("Cafeteria Name     : " + cafeteriaName);
       System.out.println("Service Charge (%) : " + serviceCharge);
       System.out.println("Total Food Items   : " + totalFoodItems);
       System.out.println();
   }
 
   public static void main(String[] args) {
 
       assignment2 item1 = new assignment2();
       assignment2 item2 = new assignment2();
       assignment2 item3 = new assignment2();
 
       item1.addFoodItem(101, "Veg Sandwich", 80);
       item2.addFoodItem(102, "Cold Coffee", 120);
       item3.addFoodItem(103, "Paneer Wrap", 150);
 
       assignment2.displayCafeteriaDetails();
 
       item1.displayItemDetails();
       item2.displayItemDetails();
       item3.displayItemDetails();
 
       assignment2.changeServiceCharge(15);
 
       System.out.println("After Updating Service Charge\n");
 
       item1.displayItemDetails();
       item2.displayItemDetails();
       item3.displayItemDetails();
   }
}
 