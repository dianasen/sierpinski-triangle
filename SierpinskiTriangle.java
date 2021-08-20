/*
 * written by Diana Sen 
 * Sierpinski triangle by caling method
 */
package sierpinski_triangle;

class SierpinskiTriangle {
	static void sierpinski(int num) {
		for (int y = num - 1; y >= 0; y--) {
			for (int i = 0; i < y; i++) {
				System.out.print(" ");
			}

			for (int x = 0; x + y < num; x++) {
				if ((x & y) != 0)
					System.out.print(" " + " ");
					else
						System.out.print("- ");
				}
			System.out.print("\n");
		}
	}
	
	public static void main(String args[]) {
		int num = 16;
		sierpinski(num);
	}
}


