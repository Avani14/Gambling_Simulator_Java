
public class GamblingSimulator {
	public static byte initialValue  = 100;
	public static byte bet  = 1;
	
	public static void everyDayGamble()
	{
		byte temp = initialValue;
		byte result;
		while(initialValue>0)
		{
			result = (byte)(Math.random()*10);
			if(result>5)
			{
				initialValue+=1;
			}
			else 
			{
				initialValue-=1;
			}
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is a Gambling Simulator!!");
		
	}

}
