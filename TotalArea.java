public class TotalArea {
	/** Main method */
	public static void main(String[] args) {
		// Declare circleArray
		Circle5[] circleArray;

		// Create circleArray
		circleArray = createCircleArray(); // returning an array of objects

		// Print circleArray and total areas of the circles
		printCircleArray(circleArray); // passing an array of objects to a
										// method
	}

	/** Create an array of Circle objects */
	public static Circle5[] createCircleArray() {
		Circle5[] array = new Circle5[10];

		for (int i = 0; i < array.length; i++) {
			array[i] = new Circle5(Math.random() * 100);
		}

		// Return Circle array
		return array;
	}

	/** Print an array of circles and their total area */
	public static void printCircleArray(Circle5[] array) {
		System.out.printf("%s\t\t\t\t%s\n", "Radius", "Area");
		for (int i = 0; i < array.length; i++) {
			System.out.printf("%4.2f\t\t\t\t%10.2f\n", array[i].getRadius()

			, array[i].getArea());
		}

		System.out.println("-----------------------------------------");

		// Compute and display the result
		System.out.printf("%s\t%10.2f\n", "The total areas of circles is ",
				sum(array));
	}

	/** Add circle areas */
	public static double sum(Circle5[] array) {
		// Initialize sum
		double sum = 0;

		// Add areas to sum
		for (int i = 0; i < array.length; i++)
			sum += array[i].getArea();

		return sum;
	}
}