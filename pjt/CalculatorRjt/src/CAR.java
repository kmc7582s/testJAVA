import java.util.Scanner;

public class CAR {
// 객체 = 속성 + 기능
//	int size = 5;
//	String color = "black";
	
 
	Scanner scanner = new Scanner(System.in);
	
	public void carSize() {
		System.out.println("크기 입력 : ");
		int size = scanner.nextInt();
		System.out.println("size: "+size);
	}
	
	public void carColor() {
		System.out.println("색상 입력 : ");
		String color = scanner.next();
		System.out.println("color: "+color);
	}
	 
	public void goForward() {
		System.out.println("전진~");
	}
	
	public void goBackward() {
		System.out.println("후진~");
	}
	
	public void IF() {
		
	}
	
	public void printInfo() {
//		System.out.println("size: "+size);
//		System.out.println("color: "+color);

		carSize();
		carColor();
		
	}
	
	
}
