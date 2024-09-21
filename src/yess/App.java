package yess;
import java.util.Scanner;

public class App {
	 public static void beginCatRun() {
		 int money = 10;
	     Cat cat = new Cat();
	       
	     System.out.println("What do you want your cat to be named?");
	     Scanner option = new Scanner(System.in);
	     cat.name = option.nextLine();

	     System.out.println("Congrats on your new cat, " + cat.name +  "!");
	     
		 while(cat.alive){
	            
	            System.out.println("What do you want to do?");
	            System.out.println("Type 1 to ask your cat for rent");
	            System.out.println("Type 2 to feed your cat ($2)");
	            System.out.println("Type 3 to give your cat water($1)");
	            System.out.println("Type 4 to view stats");
	            
	            Scanner choiceSelector = new Scanner(System.in);
	            String choice = option.nextLine();
	            if(choice.equals("1")){
	                int max = 3;
	                int min = 1;
	                int range = max - min + 1;
	                int random = (int)(Math.random() * range);
	                if(random == 2){
	                    money = money + cat.age;
	                    System.out.println("Your cat gave you money!");
	                }
	                else {
	                	System.out.println("Your cat didn't give you anything, try again later!");
	                }
	                cat.tick();
	            }
	            else if (choice.equals("2")){
	            	if(money >= 2) {
	            		money = money - 2;
	            		cat.hunger++;
	            		System.out.println("Your cat was fed!");
	            		System.out.println(cat.name + " now has "+ cat.hunger + " hunger");
	            		System.out.println("You have now $" + money);

	            	}
	            	else {
	            		System.out.println("You don't have enough money! Ask your cat for rent!");
	            	}
	            	cat.tick();
	            }
	            else if (choice.equals("3")){
	            	if(money >= 1) {
	            		money = money - 1;
	            		cat.thirst++;
	            		System.out.println("Your cat was given water!");
	            		System.out.println(cat.name + " now has "+ cat.thirst + " thirst");
	            		System.out.println("You have now $" + money);

	            	}
	            	else {
	            		System.out.println("You don't have enough money! Ask your cat for rent!");
	            	}
	            	cat.tick();

	            }
	            else if (choice.equals("4")){
	                System.out.println(cat.name + "'s stats");
	                System.out.println(cat.name +"'s Food Amount: " + cat.hunger);
	                System.out.println(cat.name + "'s Hydration Amount: " + cat.thirst);
	                System.out.println("Your Money: " + money);
	            	cat.tick();


	            }
	            else{
	                System.out.println("Try again and select an actual option");

	            }
	        }
	 }
	 public static void main(String[] args) {
		 	System.out.println("Starting a cat run...");
	        beginCatRun();	        
	 }
	

}
 