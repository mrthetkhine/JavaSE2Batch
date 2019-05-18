
public class Calendar {

	public static void main(String args[])
	{
		String days[] = {"Sun","Mon","Tue","Wed","Thur","Fri","Sat"};
		int daysInMonth[]= { 31,28,31,30,31, 30, 31 ,31 ,30,31,30,31};
		
		int year = 2019;
		int month = 5;
		int day = 5;
		
		int dayInPreviousMonth = 0;
		
		for(int i=0;i < month-1 ;i++)
		{
			dayInPreviousMonth += daysInMonth[i];
		}
		double total = year * 365.25f + dayInPreviousMonth + day;
		int reminder = (int)(total +5) % 7;
		System.out.println("Total "+ total +" reminder "+ reminder);
		System.out.println("Days "+ days[reminder]);
		
	}
}
