package week2;

public class Jets {
	
	private String model;
	private double speed;
	private double range;
	private int capacity;
	private double price;
	//pilot?
	private Pilot[] pilots;
	
	//constructor
	public Jets() {
		pilots = new Pilot[0];
	}
	public Jets(String mod, double sp, double rng, int cap, double pr) {
		setModel(mod);
		setSpeed(sp);
		setRange(rng);
		setCapacity(cap);
		setPrice(pr);
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double pr) {
		this.price = pr;
	}
	public Pilot[] getPilots() {
		return pilots;
	}
	public void setPilots(Pilot[] pil) {
		this.pilots = pil;
	}
	//toString
	public String toString() {
		String print = String.format("model: " + model + " speed: Mach: %.2f " + "range: %.2f  capacity: " + capacity + " price: $%.2f", speed, range, price);
		return print;
	}
	//methods
	public double convertToMach(double sp) {
		double mach = sp / 761.2;
		
		return mach;
	}
	public void addPilot(String name, int age, String xp) {
		Pilot[] addPilot = new Pilot[pilots.length + 1];
		for (int i = 0; i < addPilot.length - 1; i++) {
			addPilot[i] = pilots[i];
		}
		addPilot[pilots.length] = new Pilot(name, age, xp);
		pilots = addPilot;
	}
	
}

