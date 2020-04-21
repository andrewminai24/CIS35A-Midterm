package BurgerMenu;

import java.util.*;
import java.io.*;


public class OrderBurger extends Order {
	
	   	Scanner in = new Scanner(System.in); 
		  public double[] price = new double[]{5.25,5.75,5.95,5.95,5.95};
		  public  int[] items = new int[]{};
		  public int[] quantity = new int[]{};
		  public String[] qan = new String[]{"De Anza Burger","Bacon Cheese","Mushroom Swiss", "Western Burger","Don Cali Burger"};
		  public double total_price = 0;
		  public double total_tax = 0;
		  public double t = 9;
		  public double d = 0;
		
		
		  //This the method where I am getting the inputs from the user and pushing the data into a array.
		  public void getInputs(){
		   boolean end = false;
		   boolean flag = true;

		    while(!end){
			    int choice= in.nextInt();
			    
			    if(choice == 1)	{
				      items=push(items,0);
					    in.nextLine();
					    ask();
					    int q = in.nextInt();
					    if(q >= 1){
							quantity = push(quantity,q);
						}else{
							System.out.println("Invalid");
							ask();
						}
					//    in.nextLine();
					    quantity = push(quantity,q);  
					    displayMenu();
				} else if(choice == 2){
				      items=push(items,1);
					    displayMenu();
					    ask();
					    int q = in.nextInt();
					    if(q >= 1){
							quantity = push(quantity,q);
						}else{
							System.out.println("Invalid");
							ask();
						}
					    in.nextLine();
					    quantity = push(quantity,q);   
				} else if(choice == 3){
				     items=push(items,2);
				     ask();
				     int q = in.nextInt();
				     if(q >= 1){
							quantity = push(quantity,q);
						}else{
							System.out.println("Invalid");
							ask();
						}
					    quantity = push(quantity,q);
					    in.nextLine();
					    displayMenu();
				} else if(choice == 4){
				      items=push(items,choice-1);
				      ask();
				      int q = in.nextInt();
				      if(q >= 1){
							quantity = push(quantity,q);
						}else{
							System.out.println("Invalid");
							ask();
						}
					    in.nextLine();
					    quantity = push(quantity,q);   
					    displayMenu();
				} else if(choice == 5){
				      items=push(items,4);
				      ask();
				      
						int q = in.nextInt();
						if(q >= 1){
							quantity = push(quantity,q);
						}else{
							System.out.println("Invalid");
							ask();
						}
						quantity = push(quantity,q);   
					    in.nextLine();
					    displayMenu();
				} else if(choice == 6){
				      end=true;
				} else {    	 
			        System.out.println("Invalid"); 
			        System.out.println("Incorrect input please input numbers 1-6");
			        displayMenu();
				}
			   
			}

		    System.out.println("Are you a student or Staff?");
		    
		    System.out.println("1.student");
		    System.out.println("2. Staff");
		    
	
		    
		    int user = in.nextInt();
		    if (!(user == 1 || (user == 2))) {
		        System.out.println("Invalid. Try Again");
		    	System.out.println("Are you a student or Staff?");
			    
			    System.out.println("1.student");
			    System.out.println("2. Staff");
			     user = in.nextInt();

		    }else {
		    int q = in.nextInt();
		    if(q >= 1){
				quantity = push(quantity,q);
			}else{
				System.out.println("Invalid");
				ask();
			}
		    if(user == 1){
		     t=0;
		    }else{
		  }
		    //calculate();
		    in.close();
		  }
		}
		  
		  public void ask(){
			System.out.println("What is the quantity?");

		  }

		  //calculate the bill with tax included.
		  public void calculate() {
		    for (int i = 0; i < items.length; i++){
		      //add discount below and 
		      total_price+=price[items[i]]*quantity[i];
		      
		    }
		    total_tax = total_price*((t)/100);
		    
		    total_price=total_price+total_tax;
		  } 

		  //prints the bill with all the details using variables we stored
		  public void printBill() {
		    for (int i = 0; i < qan.length; i++){
		      //add discount below and 
		      int totalArrayCount = arrayCount(items,i);
		      if(totalArrayCount!=0){
		        
		        System.out.println(qan[i]+"  ---- quantity: "+totalArrayCount*quantity[i]+" Price:$"+ totalArrayCount*price[i]);
		      }
		    }
		    System.out.println("Sub Total:$"+(total_price-total_tax)+"");
		    System.out.println("Total percentages:"+ t+"%");
		    System.out.println("Taxes:$"+total_tax+"");
		    System.out.println("Total DUE:$"+total_price+"");
		    
		  }

		//counts how many times item occur in the array
		  public static int arrayCount(int[] array, int item) {
		    int amt = 0;
		    for (int i = 0; i < array.length; i++) {
		        if (array[i] == item) {
		            amt++;
		        }
		        else {
		            amt = amt;
		        }
		    }
		    return amt;
		}

		  //push items to the array, so we don't need to use arraylist
		  public static int[] push(int[] array, int push) {
			  
				  int[] longer = new int[array.length + 1];
				    for (int i = 0; i < array.length; i++)
				        longer[i] = array[i];
				    longer[array.length] = push;
				    return longer;
			 
			  
		  } 
		  
	    	//saves the bill in a text file

	    public  void saveBillToFile(){
	    	try{
	    		File file = new File("printBilFile.txt");
	    		PrintWriter writer;
	    		
	    		writer = new PrintWriter(file);
	    		
	    		
	    		 for (int i = 0; i < qan.length; i++){
	   		      //add discount below and 
	   		      int totalArrayCount = arrayCount(items,i);
	   		      if(totalArrayCount!=0){
	   		       
	   		        writer.println(qan[i]+"  ---- quantity: "+totalArrayCount*quantity[i]+" Price:$"+ totalArrayCount*price[i]);
	   		      }
	   		    }
	   		    writer.println("Sub Total:$"+(total_price-total_tax)+"");
	   		    writer.println("Total percentages:"+ t+"%");
	   		    writer.println("Taxes:$"+total_tax+"");
	   		    writer.println("Total DUE:$"+total_price+"");
	   		    
	   		    writer.close();
	   		    
	   		  
	    }
	   catch(FileNotFoundException f){
		   f.printStackTrace();
	   }
	}
}
		  //Get users choice

		  //Display the title of the choose module
		  //calculate()
		//Use array in this method.

	
	
	

