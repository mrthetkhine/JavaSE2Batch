package chapter14;

class Stats<T extends Number>
{
	T[] nums;
	Stats(T[] nums)
	{
		this.nums = nums;
	}
	double average()
	{
		double sum = 0.0;
		for(int i=0; i< this.nums.length;i++)
		{
			sum += this.nums[i].doubleValue();
		}
		return sum / this.nums.length;
	}
	boolean sameAvg(Stats<?> obj)
	{
		if(this.average()== obj.average())
		{
			return true;
		}
		else
		{
			return false;
		}
	} 
}
public class WildCardArgumentDemo {
	public static void main(String[]args)
	{
		Integer []iNums = {10,20,30};
		Double []dNums = {10.0,20.0,30.0};
		
		Stats<Integer> iStats = new Stats<Integer>(iNums);
		Stats<Double> dStats = new Stats<>(dNums);
		
		System.out.println(iStats.sameAvg(dStats));
		
	}

}
