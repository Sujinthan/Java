
public class CreateCircleArray {
	public static Circle5 [] createArray(){
		Circle5 [] circle_Array = new Circle5[10];
		for (int x = 0; x < circle_Array.length; x ++){
			circle_Array [x] = new Circle5 (Math.random()*100.0);
		}
		return circle_Array; 
	}
}
