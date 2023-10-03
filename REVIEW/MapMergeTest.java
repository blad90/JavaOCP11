import java.util.Map;
import java.util.HashMap;

public class MapMergeTest{
	public static void main(String[] args){
		Map<Integer, String> employees = new HashMap<Integer, String>();
		employees.put(1, "Jeff");
		employees.put(2, "Jonas");
		employees.put(3, "Adam");
		employees.put(6, "Ross");
		employees.put(8, "Amanda");

		System.out.println(employees);
		
		employees.merge(9, "Tom", (v1, v2) -> v1 + v2);
		
		System.out.println(employees);
		
	}
}