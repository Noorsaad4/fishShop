package fishShop;

public class Aquarium {
private String brand;
private String price;
private String color;
private String length;
private String litre;
public Aquarium() {
	super();
}
public Aquarium(String brand, String price, String color, String length, String litre) {
	super();
	this.brand = brand;
	this.price = price;
	this.color = color;
	this.length = length;
	this.litre = litre;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public String getPrice() {
	return price;
}
public void setPrice(String price) {
	this.price = price;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public String getLength() {
	return length;
}
public void setLength(String length) {
	this.length = length;
}
public String getLitre() {
	return litre;
}
public void setLitre(String litre) {
	this.litre = litre;
}

}
