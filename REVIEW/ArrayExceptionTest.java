interface Calculator {
		int calculate(int a);
	}

public class ArrayExceptionTest{
	
	
	
	public static int check(Calculator c){
		return c.calculate(2);
	}
	
	
	
    public static void main(String[] args) {
		check(x -> x * 2);
		
		int[] nums = new int[] { 1, 4, 6};
		Object p = nums;
		int[] two = (int[]) p;
		System.out.println(two);
		//System.out.println(two[two.length]);
    }
}