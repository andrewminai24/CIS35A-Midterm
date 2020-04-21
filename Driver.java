
/*Author: Andrew Minai
Description:This program is a Burger menu for De Anza that gives user the input for which burger
they would like and asks if they are a student or staff because staff receives a 9 percent tax and 
student receives none.In the end it gives the result 
food items,
quantities,
cost of them,
total before tax,
Tax amount and the total price after tax.
*/
package BurgerMenu;
public class Driver {
   
    public static void main(String args[]) {

        // Order ord = new Order(); <= Cannot instantiate the type Order because Order is an abstract class                  

    	OrderBurger order1 = new OrderBurger();

    	

	      //Displays the menu
	      order1.displayMenu();
	      
	      //menu method is within getInputs method
	      order1.getInputs();
	      
	      //calculate cost
	      order1.calculate();
	      
	      //Print the bill
	      order1.printBill();
	      
	      order1.saveBillToFile();          //saves the bill in a text file

    }
}

/* END RESULT:
STAFF:
Are you a student or Staff?
1.student
2. Staff
2
De Anza Burger  ---- quantity: 1 Price:$5.25
Bacon Cheese  ---- quantity: 1 Price:$5.75
Sub Total:$11.0
Total percentages:9.0%
Taxes:$0.99
Total DUE:$11.99
STUDENT:
Are you a student or Staff?
1.student
2. Staff
1
De Anza Burger  ---- quantity: 1 Price:$5.25
Bacon Cheese  ---- quantity: 1 Price:$5.75
Sub Total:$11.0
Total percentages:0.0%
Taxes:$0.0
Total DUE:$11.0

NEGATIVE INPUT:
1. De Anza Burger 5.25
2. Bacon Cheese 5.75
3. Mushroom Swiss 5.95
4. Western Burger 5.95
5. Don Cali Burger 5.95
6.Exit to see your recipt
Please choose your choice
10
Invalid
Incorrect input please input numbers 1-6
1. De Anza Burger 5.25
2. Bacon Cheese 5.75
3. Mushroom Swiss 5.95
4. Western Burger 5.95
5. Don Cali Burger 5.95
6.Exit to see your recipt
Please choose your choice

NEGATIVE INPUT:
1. De Anza Burger 5.25
2. Bacon Cheese 5.75
3. Mushroom Swiss 5.95
4. Western Burger 5.95
5. Don Cali Burger 5.95
6.Exit to see your recipt
Please choose your choice
100
Invalid
Incorrect input please input numbers 1-6
1. De Anza Burger 5.25
2. Bacon Cheese 5.75
3. Mushroom Swiss 5.95
4. Western Burger 5.95
5. Don Cali Burger 5.95
6.Exit to see your recipt
Please choose your choice

POSITIVE INPUT:
STAFF:
Are you a student or Staff?
1.student
2. Staff
2
De Anza Burger  ---- quantity: 1 Price:$5.25
Bacon Cheese  ---- quantity: 1 Price:$5.75
Sub Total:$11.0
Total percentages:9.0%
Taxes:$0.99
Total DUE:$11.99
STUDENT:
Are you a student or Staff?
1.student
2. Staff
1
De Anza Burger  ---- quantity: 1 Price:$5.25
Bacon Cheese  ---- quantity: 1 Price:$5.75
Sub Total:$11.0
Total percentages:0.0%
Taxes:$0.0
Total DUE:$11.0

*/


