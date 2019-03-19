import java.util.Scanner;

public class MainRoboClass {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RoboInterface roboImpl=new RoboImplementaion();
		roboImpl.charge();
		
		int ch=0;
		do
		{
			
			
			System.out.println("=============================");
			System.out.println("Press 1 for walk witout Object");
			System.out.println("Press 2 for walk with Object");
			System.out.println("Press 3 for bar code scan");
			System.out.println("Press 4 for exit");
			System.out.println("=============================");
			Scanner sc=new Scanner(System.in);
			ch=sc.nextInt();
			long walking_distance=0;
			int ObjectWeight=0;
		    
		    
			switch(ch)
			{
			  case 1 : 
				       System.out.println("Press enter the walking distance in meters");
				       walking_distance=sc.nextLong();
				       roboImpl.walk(walking_distance, false, 0);
			           break;
			  case 2 :  System.out.println("Press enter the walking distance in meters");
			            walking_distance=sc.nextLong();
			            System.out.println("Press enter the Object weight in KG");
			            ObjectWeight=sc.nextInt();
			  			roboImpl.walk(walking_distance, true, ObjectWeight);
			  			break;
	           
			  case 3 : System.out.println("Press enter the status of barcode true or false");
	                    boolean barcode=sc.nextBoolean();
	                    roboImpl.scan(barcode);
	                    
			  case 4 : break;
			  
	           default: System.out.println("Please enter a valid option");
	                    break;
			
			}
		}while(ch!=4);

		
		
		
		

	}

}
