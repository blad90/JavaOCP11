public class ColorPicker {
     public void pickColor() {
        try {
           System.out.print("A");
           fail();
        } catch (NullPointerException | Error x) {
           System.out.print("B");
        } finally {
           System.out.print("C");
       }
    }
    public void fail() {
       throw new ArithmeticException();
    }
    public static void main(String[] args) {
       new ColorPicker().pickColor();
       System.out.print("D");
    }
}