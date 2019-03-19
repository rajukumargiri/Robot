import java.util.Random;

public class RoboImplementaion implements RoboInterface {
	
	static Random random=new Random();
	
	private Robo b;
	long totalWalk=0;
	
	RoboImplementaion()
	{
		b=Robo.getRobo();
	}

	@Override
	public void walk(long walkedDistance,boolean carry,long weight) {
		// TODO Auto-generated method stub
		
		long remaingCharge = 0;
		
		
		if(walkedDistance>5000)
		{
			System.out.println("5000m Limit crossed for walk");
			return;
		}
		
		else if(b.getBattery()<((5000*15)/100))
		{
			b.setRedLight(true);
			System.out.println("RED LIGHT IS ON AS REMAING CHARGE IS "+(b.getBattery()*100)/5000+"%");
			
		}
		
		if(!carry)
		{
		  if(b.getBattery()>=walkedDistance)
		  {
			  	remaingCharge=b.getBattery()-walkedDistance;
		  		b.setBattery(remaingCharge);
		  		totalWalk=totalWalk+walkedDistance;
		  		System.out.println("Reaming charge : "+(b.getBattery()*100)/5000+"% after walk of "+totalWalk);
		  		
		  }else
			  System.out.println((b.getBattery()*100)/5000+"% charge is Not enough charge for "+walkedDistance+" WALK");
		   
		}else
		{    
			   if(weight>10)
			   {
				   b.setDisplayText(" Overweight");
				   display();
				   return;
			   }
			   else if(b.getBattery()>=(walkedDistance+((walkedDistance*2)/100)))
			   {
			      remaingCharge=b.getBattery()-(walkedDistance+((walkedDistance*2)/100));
			      b.setBattery(remaingCharge);
			      totalWalk=totalWalk+walkedDistance;
			      System.out.println("Reaming charge : "+(b.getBattery()*100)/5000+"% after walk of "+totalWalk);
			   }
			   else
				   System.out.println((b.getBattery()*100)/5000+"% Not enough charge for" +walkedDistance+" WALK");
			   
		}
		
	  
		
	}

	@Override
	public void scan(boolean barcode){
		// TODO Auto-generated method stub
		if(barcode)
		{
			b.setDisplayText("Price of barcode : "+random.nextInt(5000));
		    display();
		}
		else
		{
			b.setDisplayText("Barcode is not readable");
			display();
		}
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(" DISPLAY TEXT "+b.getDisplayText());
	}

	@Override
	public void charge() {
		// TODO Auto-generated method stub
		b.setBattery(5000);
		totalWalk=0;
		System.out.println("Reaming charge : "+100+"%");
		
	}

}
