import java.util.function.BinaryOperator;

public class BinaryOperatorTest {
	public static void main(String[] args){
		Calculate c = new Calculate();
		BinaryOperator<Integer> b1 = c::calculate;
		BinaryOperator<Integer> b2 = (a, b) -> a + b;
		
		System.out.println(b1.apply(3, 6));
		System.out.println(b2.apply(6, 8));
	}
}

class Calculate {
	int calculate(int n1, int n2){
		return n1 + n2;
	}
}