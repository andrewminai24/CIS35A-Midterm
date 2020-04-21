package BurgerMenu;

public interface OrderInterface {
	
	 void displayMenu();        // displays the menu         
     void getInputs();          //gets inputs         
     void calculate();          //calculates the cost
     void printBill();          //prints the bill
	
	
	 void saveBillToFile();   
}
