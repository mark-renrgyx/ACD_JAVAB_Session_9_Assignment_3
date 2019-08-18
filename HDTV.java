package week1.day9.assignment3;

public class HDTV {
	private double size;
	private String brand;
	
	public HDTV(double size, String brand) {
		this.size = size;
		this.brand = brand;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String toString() {
		return "\n" + "Size: " + size + " Brand: " + brand;
	}
}
