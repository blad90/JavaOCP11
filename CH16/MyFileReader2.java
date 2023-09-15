public class MyFileReader2 implements AutoCloseable {
	private String tag;
	
	public MyFileReader2(String tag){
		this.tag = tag;
	}
	
	@Override
	public void close(){
		System.out.println("Closed: " + tag);
	}
	
	public static void main(String[] args){
		try(var bookReader = new MyFileReader2("1");
		    var movieReader= new MyFileReader2("2");
			var tvReader = new MyFileReader2("3")){
			System.out.println("Try Block");
		} finally {
			System.out.println("Finally Block");
		}
	}
}