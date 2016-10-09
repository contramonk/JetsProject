package week2;

public class Hanger {
	private Jets[] jets;
	
	// constructor
	public Hanger() {
		jets = new Jets[5];
		jets[0] = new Jets("F16", 10000, 200, 2);
		jets[1] = new Jets("F20", 11000, 300, 3);
		jets[2] = new Jets("F20", 12000, 400, 4);
		jets[3] = new Jets("F20", 13000, 500, 5);
		jets[4] = new Jets("F20", 14000, 600, 6);
	}
	
	//get and set
	public Jets[] getJets() {
		return jets;
	}
	public void setJets(Jets[] j) {
		this.jets = j;
	}
	
	public void addJet(String model, double speed, double range, int capacity) {
		Jets[] addJets = new Jets[jets.length + 1];
		for (int i = 0; i < addJets.length -1; i++) {
			addJets[i] = jets[i];
		}
		addJets[jets.length] = new Jets(model, speed, range, capacity);
		jets = addJets;
		
		printJets(jets);
	}
	public void printJets(Jets[] jet) {
		for (Jets jets : jet) {
			System.out.println(jets);
		}
	}
}
