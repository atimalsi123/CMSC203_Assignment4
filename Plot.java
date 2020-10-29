public class Plot {
	private int x;
	private int y;
	private int width;
	private int depth;
	
	public Plot() {
		this.x = 0;
		this.y = 0;
		this.width = 1;
		this.depth = 1;
	}
	
	public Plot(Plot p) {
		this.x = p.x;
		this.y = p.y;
		this.width = p.width;
		this.depth = p.depth;
	}
	
	public Plot(int x, int y, int width, int depth) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.depth = depth;
	}
	
	public int getX() {
		return this.x;
	}
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return this.y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public int getWidth() {
		return this.width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	
	public int getDepth() {
		return this.depth;
	}
	public void setDepth(int depth) {
		this.depth = depth;
	}
		    
	public boolean overlaps(Plot p) {
		boolean overlap = false;
		if (p.getX() <= this.x + this.width && this.x <= p.getX() + p.getWidth()) {
			overlap = true;
		}
		if (p.getY() <= this.y + this.depth && this.y <= p.getY() + p.getDepth()) {
			if (this.x <= p.getX() + p.getWidth()) {
				overlap = true;
			}
		}
		else {
			overlap = false;
		}
		return overlap;
	}
	
	public boolean encompasses(Plot p) {
		boolean encompass = false;
		if (this.getX() + this.getWidth() > p.getX()) {
			encompass = true;
		}
		if (this.getY() + this.getDepth() > p.getY()){
			encompass = true;
		}
		if ((this.getX() >= p.getX()) || (this.getX() + this.getWidth() >= p.getX())) {
			encompass = true;
		}
		if ((this.getY() >= p.getY()) || (this.getY() + this.getDepth() >= p.getY())) {
			encompass = true;
		}

		return encompass;
	}
	
	public String toString() {
		return "Upper left: (" + this.x + "," + this.y + "); Width: " + this.width + 
				" Depth: " + this.depth;
	}
	
	
	
}



