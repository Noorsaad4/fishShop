package fishShop;

public class Fish {
private String name;
private String price;
private String color;
private String length;
public Fish() {
	super();
}
public Fish(String name, String price, String color, String length) {
	super();
	this.name = name;
	this.price = price;
	this.color = color;
	this.length = length;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
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

}
