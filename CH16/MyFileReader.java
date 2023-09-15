public class MyFileReader implements AutoCloseable {
	private String tag;
	
	public MyFileReader(String tag){
		this.tag = tag;
	}
	
	@Override
	public void close(){
		System.out.println("Closed: " + tag);
	}
	
	public static void main(String[] args){
		try(var bookReader = new MyFileReader("monkey")){
			System.out.println("Try Block");
		} finally {
			System.out.println("Finally Block");
		}
	}
}