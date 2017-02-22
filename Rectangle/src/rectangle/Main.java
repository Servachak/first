package rectangle;

public class Main {

	public static void main(String[] args) {
		
	Rectangle rectangle = new Rectangle(80, 20);
	
    int area = rectangle.height * rectangle.width;
    int perimeter = 2 * (rectangle.height + rectangle.width);
    System.out.println("Rectanle area = " + area);
    System.out.println("Rectanle perimetr = " + perimeter);
    
    Rectangle1 rectangle1 = new Rectangle1();
    int area2 = rectangle1.height * rectangle1.width;
    int perimeter2 = 2 * (rectangle1.height + rectangle1.width);
    System.out.println("Rectanle area = " + area2);
    System.out.println("Rectanle perimetr = " + perimeter2);
	}

}
