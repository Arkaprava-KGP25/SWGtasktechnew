public class Car {
	@SuppressWarnings("unused")
	private int speed;
	private double regularPrice;
	@SuppressWarnings("unused")
	private String colour;
	
	public Car (int speed, double regularPrice, String colour) {
		this.speed = speed;
		this.regularPrice = regularPrice;
		this.colour = colour;
		}
	public double getSalePrice() {
		return regularPrice;
	}		
}

public class Truck extends Car {
	private int weight;
	public Truck (int speed, double regularPrice, String colour, int weight) {
		super (speed, regularPrice, colour);
		this.weight = weight;
	}
	public double getSalePrice() {
		return super.getSalePrice() * (weight > 2300 ? 0.9 : 0.8);
	}
	
}
