
public class ManagementCompany {
	private final int MAX_PROPERTY = 5;
	private double mgmFeePer;
	private String name;
	private Property[] properties;
	private String taxID;
	private final int MGMT_WIDTH = 10;
	private final int MGMT_DEPTH = 10;
	private Plot plot;
	
public ManagementCompany() {
	this.name = "";
	this.taxID = "";
	this.mgmFeePer = 0;
	this.plot = new Plot();
	this.properties = new Property[MAX_PROPERTY];
}
public ManagementCompany(String name, String taxID, double mgmFee) {
	this.name = name;
	this.taxID = taxID;
	this.mgmFeePer = mgmFee;
	int x= 0, y = 0, width = MGMT_WIDTH, depth = MGMT_DEPTH;
	this.plot = new Plot(x, y, width, depth);
	this.properties = new Property[MAX_PROPERTY];
}
public ManagementCompany(String name, String taxID, double mgmFee, int x, int y, int width, int depth) {
	this.name = name;
	this.taxID = taxID;
	this.mgmFeePer = mgmFee;
	this.plot = new Plot(x, y, width, depth);
	this.properties = new Property[MAX_PROPERTY];
}

public int getMAX_PROPERTY() {
	return this.MAX_PROPERTY;
}

public int addProperty(Property property) {
	if (property == null) {
		return -2;
	}
	if (!(this.plot.encompasses(property.getPlot()))) {
		return -3;
	}
	for (int a = 0; a < properties.length; a++) {
		if(properties[a] != null) {
			if(property.getPlot().overlaps(property.getPlot())) {
				return -4;
			}
		}
		else {
			properties[a] = property;
			return a;
		}
	}
		return -1;
}
public int addProperty(String name, String city, double rent, String owner) {
	
	Property prop = new Property();
	int a = 0;
	properties[a] = prop;
	if(properties[a] != null) {
		prop = properties[a];
	}
	if (a >= MAX_PROPERTY) {
		return -1;
	}
	if (properties == null) {
		return -2;
	}
	if (!(this.plot.encompasses(plot))) {
		return -3;
	}
	if(this.plot.overlaps(plot)) {
		return -4;
	}
	properties[a] = new Property(name, city, rent, owner);
	
	return a;
}
public int addProperty(String name, String city, double rent, String owner, int x, int y, int width, int depth) {
	
	Property prop = new Property();
	int a = 0;
	properties[a] = prop;
	if(properties[a] != null) {
		prop = properties[a];
	}
	if (a >= MAX_PROPERTY) {
		return -1;
	}
	if (properties == null) {
		return -2;
	}
	if (!(this.plot.encompasses(plot))) {
		return -3;
	}
	if(this.plot.overlaps(plot)) {
		return -4;
	}
	properties[a] = new Property(name, city, rent, owner, x, y, width, depth);
	
	return a;
	}
public double totalRent() {
	double rent = 0;
	double rentTotal = 0;
	for (int a = 0; a < properties.length; a++) {
		if(properties[a] != null) {
			rent = rent + properties[a].getRentAmount();
			rentTotal = rentTotal + rent;
	}
	}
	return rentTotal;
}

public int maxRentPropertyIndex() {
	int indexProp = 0;
	double max = 0;
	for (int a = 0; a < properties.length; a++) {
		if(properties[a] != null) {
		if (properties[a].getRentAmount() > max) {
			max = properties[a].getRentAmount();
			indexProp = a;
		}
	}
	}
		return indexProp;
		
}
public double maxRentProp() {
	double max = 0;
	for (int a = 0; a < properties.length; a++) {
		if(properties[a] != null) {
		if(properties[a].getRentAmount() > max) {
		max = properties[a].getRentAmount();
		}}
	}
	return max;
}

public String displayPropertyAtIndex(int indexProp) {
	String index = "";
	if (properties[indexProp] != null) {
		index = properties[indexProp].toString();
	}
	return index;

}
public String toString() {
	return "The property with the highest rent: " + displayPropertyAtIndex(maxRentPropertyIndex())
			+ "List of the the properties for " +  this.name + ", taxID: " + this.taxID + 
			"\n --------------------------------------------------------------\n" 
			+ properties[0] + "\n" + properties[1] + "\n" + properties[2] + "\n"+
			properties[3] + "\n" + properties[4] + "\n --------------------------------------------------------------" + 
			"\nTotal Management Fee: " + String.format("%.2f ", totalRent() * (mgmFeePer / 100));
			

}
public String getName() {
	return this.name;
}
public Plot getPlot() {
	return this.plot;

}
}




