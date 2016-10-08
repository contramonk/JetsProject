package week2;

public class Jets {
	private String model;
	private double speed;
	private double range;
	private int capacity;
	//pilot?
	
	//constructor
	public Jets(String mod, double sp, double rng, int cap) {
		setModel(mod);
		setSpeed(sp);
		setRange(rng);
		setCapacity(cap);
	}
	
	// get and set
	public String getModel() {
		return model;
	}
	public void setModel(String mod) {
		this.model = mod;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double sp) {
		this.speed = convertToMach(sp);
	}
	public double getRange() {
		return range;
	}
	public void setRange(double rng) {
		this.range = rng;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int cap) {
		this.capacity = cap;
	}
	//toString
	public String toString() {
		String print = "model: " + model + " speed: " + speed + " range: " + range + " capacity: " + capacity;
		return print;
	}
	//methods
	public double convertToMach(double sp) {
		double mach = sp / 761.2;
		
		return mach;
	}
}

