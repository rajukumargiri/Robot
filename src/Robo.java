
public class Robo{
	
	static Robo robo;
	
	private Robo()
	{
		
	}
	
	public static Robo getRobo()
	{
		if(robo==null)
		{
		    robo=new Robo();
		    return robo;
		}
		else
			return robo;
	}
	
    private long battery;
    private long distanceWalked;
    private boolean redLight;
    private String displayText;
    
	public long getBattery() {
		return battery;
	}
	public void setBattery(long battery) {
		this.battery = battery;
	}
	public long getDistanceWalked() {
		return distanceWalked;
	}
	public void setDistanceWalked(long distanceWalked) {
		this.distanceWalked = distanceWalked;
	}
	public boolean isRedLight() {
		return redLight;
	}
	public void setRedLight(boolean redLight) {
		this.redLight = redLight;
	}
	public String getDisplayText() {
		return displayText;
	}
	public void setDisplayText(String displayText) {
		this.displayText = displayText;
	}
	
	
	

}
