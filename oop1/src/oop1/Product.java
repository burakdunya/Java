package oop1;

//PascalCase
public class Product {
	private String name;
	// camelCase
	private double unitPrince;
	private double discount;
	private String imageUrl;
	private int unitsInstock;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrince() {
		return unitPrince;
	}

	public void setUnitPrince(double unitPrince) {
		this.unitPrince = unitPrince;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public int getUnitsInstock() {
		return unitsInstock;
	}

	public void setUnitsInstock(int unitsInstock) {
		this.unitsInstock = unitsInstock;
	}

}
