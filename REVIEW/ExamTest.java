interface WritingDevice {}
class Pencil implements WritingDevice {}
abstract class Pen implements WritingDevice {}
class FountainPen extends Pen {}
class ExamTest {
	private WritingDevice x;
	public void setFavorite(Pen v){
		x = v;
	}
	public static void main(String[] args){
		new ExamTest().setFavorite(new FountainPen());
	}
}