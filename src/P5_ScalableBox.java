

/*
	ISYS 320
	Name(s): Anthony Quehl
	Date: 
*/

public class P5_ScalableBox {
	
	public static int WINDOW_HEIGHT = 5;
	public static int WINDOW_WIDTH = 10;

	public static void main(String[] args) {
		drawBoxCap();
		drawBoxInsides();
		drawBoxCap();
	}
	
	public static void drawBoxCap() {
		System.out.print("+");
		
		for( int capDashIndex = 1; capDashIndex <= WINDOW_HEIGHT - 2; capDashIndex++ ) {
			System.out.print("-");
		}
		
		System.out.println("+");
	}
	
	public static void drawBoxInsides() {
		for( int insideRowIndex = 1; insideRowIndex <= WINDOW_WIDTH - 2; insideRowIndex++ ) {
			drawBoxInsideLine();
		}
	}
	
	public static void drawBoxInsideLine() {
		System.out.print("|");
		
		for( int insideRowIndex = 1; insideRowIndex <= WINDOW_HEIGHT - 2; insideRowIndex++ ) {
			System.out.print(".");
		}
		
		System.out.println("|");
	}

}
