package array;

public class ArrayCars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] cars = {"morning","sonata","sportage","k7" };
        cars[2] = "bmw";

        for (int i = 0; i< cars.length;i++){
            System.out.print(cars[i]+",");
        }
	}

}
