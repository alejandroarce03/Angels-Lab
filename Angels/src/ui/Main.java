package ui;
import java.util.Scanner;
import model.*;

public class Main{
	//atributtes
	Scanner in = new Scanner(System.in);
	Scanner num = new Scanner(System.in);
	Legion legion = null;
	int numArcangels=0;
	//methods
	public Main(){
	 in = new Scanner(System.in);
	 
	 num = new Scanner(System.in);
     legion=null;
	}
	public static void main(String args[]){
		 Main obj = new Main();
		 boolean repet = false;
		 int menu = 0;
         int menuCount= 0;
		 for(int i=0;repet==false;i++){
			 System.out.println("MENU");
			 System.out.println("1. Create legion");
			 System.out.println("2. Register arcangels");
			 System.out.println("3. Count arcangels");
			 System.out.println("4. Search arcangel with his name");
			 System.out.println("5. Search celebration for month");
			 System.out.println("6. Disploy of celebrations");
			 System.out.println("7. Exit");
	
			int option = obj.num.nextInt();
	 
	
	
		switch(option){
			case 1: if(menu==0){
			obj.createLegion();}
			else 
				System.out.println("the legion was already created");
			    repet = false;
				menu++;
			break;
			case 2: if(menu==1){
			
				for( i=0;i<obj.legion.getNumArcangels();i++){
				obj.createArcangels();}
			}
			else{
			    System.out.println("The legion does not exist");}
			    menu++;
				menuCount++;
			    repet = false;
			break;
			case 3: if(menuCount==1){
			System.out.println("The num of arcangels is : "+obj.legion.countArcangels());}
				System.out.println("The arcangels do not exist");
			    repet = false;
			break;
			case 4: if(menu==2){
			     System.out.println("Enter the name of arcangel you want to search");
				 String searchArcangel = obj.in.nextLine();
				 Arcangel search =null;
				 search=obj.legion.searchNameOfArcangel(searchArcangel);
				 if(search==null){
					 System.out.println("This arcangel does not exist");
				 }
				 else
					 System.out.println(search);
				}
				else{
					System.out.println("The legion or arcangels does not exist");
				}
				 repet = false;
				 break;
			case 5: if(menu==2){
				System.out.println("Enter the month. Example 01");
				String searchMonth = obj.in.nextLine();
				System.out.println(obj.legion.searchByDate(searchMonth));
				}
				else{
				System.out.println("The legion or arcangels do not exist");
				}
				repet= false;
		        break;
			case 6: 
			   System.out.println(obj.legion.disployCelebrations());
			   repet = false;
			   break;
			case 7:
			repet = true;
			   
			default:
			
		}
		
	}
	}
	
   /*
    * This method asks for the information necessary to create an archangel
     * pre: the array legion! = null, there must be an archangel method (nameArcangel, prayer, date, photo, power, color, essence, size, luminosity)
	* post: at the end of the method create an object of type Arcangel in the legion array
	*/
	public void createArcangels(){
		if(legion!=null){
		Arcangel arcangel=null;
	  Candle candle = null;
			System.out.println("Enter data for arcangel ");
			System.out.println("Enter name of arcangel. Remember to end in EL");
			String nameArcangel = in.nextLine();
			System.out.println("Enter prayer of arcangel");
			String prayer = in.nextLine();
			System.out.println("Enter date of celebration. day/month. Example 02/05 ");
			String date = in.nextLine();
			System.out.println("Enter name of photo");
			String photo = in.nextLine();
			System.out.println("Enter power of arcangel");
			String power = in.nextLine();
			System.out.println("Set the color of candle");
			String color = in.nextLine();
			System.out.println("Set the essence of candle");
			String essence = in.nextLine();
			System.out.println("Set the size of candle");
			double size = num.nextDouble();
			System.out.println("Set the luminosity of candle");
			double luminosity = num.nextDouble();
			arcangel=legion.arcangel(nameArcangel,prayer,date,photo,power,color,essence,size,luminosity);
			if(arcangel==null){
				System.out.println("It is not posible to create arcangel");
			}
			else 
				System.out.println("Arcangel was created");
		}
		
	}
	/*
	* The next method is the creator of legion
	* pre: know how many archangeles to create
	* post: in the end the method creates an array of type Arcangel called legion
	*/
	public void createLegion(){
	System.out.println("How many arcangels do you want create?");
	 numArcangels = num.nextInt(); 
	legion = new Legion(numArcangels);
      }
	
	}
