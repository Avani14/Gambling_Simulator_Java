
public class GamblingSimulator {
	public static byte initialValue  = 100;
	public static byte bet  = 1;
	public static byte day  = 20;
	public static byte month  = 1;
	public static void everyDayGamble()
	{
		byte temp = initialValue;
		byte result;
		while(initialValue>0)
		{
			result = (byte)(Math.random()*10);
			
			if(result >= 5)
			{
				initialValue+=1;
				if(initialValue == 127 || initialValue == (byte)(temp + temp/2))
				{
					break;
				}
			}
			else 
			{
				initialValue-=1;
				if(initialValue == (byte)temp/2)
				{
					break;
				}
			}
			day++;
			if(day>30)
			{
				day = 1;
				if(month>12)
				{
					month=1;
				}
				else {
				month++;
				}
			}
			if(day>20)
			{
				if(initialValue>temp)
				{
					System.out.println("You won on day "+day+" of month "+month+" the current balance is $"+initialValue);
					
				}
				else
				{
					System.out.println("You lost on day "+day+" of month "+month+" the current balance is $"+initialValue);
					
				}
			}
		}

		System.out.println("-------The Final Result ---------");
		if(initialValue>temp)
		{
			System.out.println("You won $"+initialValue);
		}
		else
		{
			System.out.println("You lost your current balance is "+initialValue);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is a Gambling Simulator!!");
		everyDayGamble();
	}

}
