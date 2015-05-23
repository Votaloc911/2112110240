
public class Program {

	public static void main(String[] args) {
		Rectangle rect=new Rectangle();
		Triangle trgl=new Triangle();
		rect.setValues(4, 5);
		trgl.setValues(4, 5);
		System.out.println(rect.area());
		System.out.println(trgl.area());
	}

}
