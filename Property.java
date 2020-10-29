public class Property {
	private String PropertyName;
	private String city;
	private double rentAmount;
	private String owner;
	private Plot plot;


public Property() {
	this.PropertyName = "";
	this.city = "";
	this.rentAmount = 0;
	this.owner = "";
	this.plot = new Plot();
}

public Property (Property p) {
	this.PropertyName = p.PropertyName;
	this.city = p.city;
	this.rentAmount = p.rentAmount;
	this.owner = p.owner;
	this.plot = new Plot(p.plot);
}

public Property(String PropertyName, String city, double rentAmount, String owner) {
	this.PropertyName = PropertyName;
	this.city = city;
	this.rentAmount = rentAmount;
	this.owner = owner;
}
public Property(String PropertyName, String city, double rentAmount, String owner, int x, int y, int width, int depth) {
	this.PropertyName = PropertyName;
	this.city = city;
	this.rentAmount = rentAmount;
	this.owner = owner;
	this.plot = new Plot(x, y, width, depth);
}

public String getPropertyName() {
	return this.PropertyName;
}
public void setProperty(String PropertyName) {
	this.PropertyName = PropertyName;
}

public String getCity() {
	return this.city;
}
public void setCity(String city) {
	this.city = city;
}

public double getRentAmount() {
	return this.rentAmount;
}
public void setRentAmount(double rentAmount) {
	this.rentAmount = rentAmount;
}
public String getOwner() {
	return this.owner;
}
public void setOwner(String owner) {
	this.owner = owner;
}
public String toString() {
	return "Property Name: " + this.PropertyName + "\n Located in: " + this.city + "\n Belonging to: " + 
			this.owner + "\n Rent Amount: " + this.rentAmount ;
}

public Plot getPlot() {
	return this.plot;
}



}

