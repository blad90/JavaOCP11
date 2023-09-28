public class SBExample{
	public static void main(String[] args){
		var sb = new StringBuilder("original string");
		var trade = trade(sb); // orshixyginal stringmaybe 
		var newSb = replace(sb); // or---xyginal stringmaybe
		System.out.println(newSb);
	}
	
	private static StringBuilder trade(StringBuilder original){
		var b = new StringBuilder();
		return original.append("maybe").insert(2, "sh")
			   .insert(5,"xy");
	}
	
	private static StringBuilder replace(StringBuilder original){
		var b = new StringBuilder();
		return original.replace(2, 5, "-");
	}
}