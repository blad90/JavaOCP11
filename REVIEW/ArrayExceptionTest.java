public class ArrayExceptionTest {
    public static void main(String[] args) {
		int[] nums = new int[] { 1, 4, 6};
		Object p = nums;
		int[] two = (int[]) p;
		System.out.println(two);
		System.out.println(two[two.length]);
		
    }
}