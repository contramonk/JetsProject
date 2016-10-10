package week2;

import java.util.Scanner;

public class Hanger {
	private Jets[] jets;

	// constructor
	public Hanger() {
		jets = new Jets[5];
		jets[0] = new Jets("F16", 10000, 200, 2, 2005400);
		jets[1] = new Jets("F21", 11000, 300, 3, 4006040);
		jets[2] = new Jets("F22", 12000, 400, 4, 5005060);
		jets[3] = new Jets("F23", 13000, 500, 5, 2010500);
		jets[4] = new Jets("F24", 1000, 500, 6, 1000600);
		
		setJets(jets);
	}

	// get and set
	public Jets getJets(int pick) {
		return jets[pick];
	}

	public void setJets(Jets[] j) {
		this.jets = j;
	}

	public void addJet(String model, double speed, double range, int capacity, double price) {
		Jets[] addJets = new Jets[jets.length + 1];
		for (int i = 0; i < addJets.length - 1; i++) {
			addJets[i] = jets[i];
		}
		addJets[jets.length] = new Jets(model, speed, range, capacity, price);
		jets = addJets;

		printJets();
	}

	public void highLowSpeed() {
		for (int j = 0; j < jets.length; j++) {
			for (int i = 0; i < jets.length; i++) {

				try {
					if (jets[i].getSpeed() < jets[i + 1].getSpeed()) {
						Jets jetStore2 = jets[i + 1];
						jets[i + 1] = jets[i];
						jets[i] = jetStore2;
					}
				} catch (ArrayIndexOutOfBoundsException e) {
					if (jets[i].getSpeed() < jets[i].getSpeed()) {
						Jets jetStore2 = jets[i];
						jets[i] = jets[i];
						jets[i] = jetStore2;
					}
				}
			}
		}
		printJets();
	}
	public void lowHighSpeed() {
		for (int j = 0; j < jets.length; j++) {
			for (int i = 0; i < jets.length; i++) {

				try {
					if (jets[i].getSpeed() > jets[i + 1].getSpeed()) {
						Jets jetStore2 = jets[i + 1];
						jets[i + 1] = jets[i];
						jets[i] = jetStore2;
					}
				} catch (ArrayIndexOutOfBoundsException e) {
					if (jets[i].getSpeed() > jets[i].getSpeed()) {
						Jets jetStore2 = jets[i];
						jets[i] = jets[i];
						jets[i] = jetStore2;
					}
				}
			}
		}
		printJets();
	}
	public void lowHighRange() {
		for (int j = 0; j < jets.length; j++) {
			for (int i = 0; i < jets.length; i++) {

				try {
					if (jets[i].getRange() > jets[i + 1].getRange()) {
						Jets jetStore2 = jets[i + 1];
						jets[i + 1] = jets[i];
						jets[i] = jetStore2;
					}
				} catch (ArrayIndexOutOfBoundsException e) {
					if (jets[i].getRange() > jets[i].getRange()) {
						Jets jetStore2 = jets[i];
						jets[i] = jets[i];
						jets[i] = jetStore2;
					}
				}
			}
		}
		printJets();
	}

	public void highLowRange() {
		for (int j = 0; j < jets.length; j++) {
			for (int i = 0; i < jets.length; i++) {

				try {
					if (jets[i].getRange() < jets[i + 1].getRange()) {
						Jets jetStore2 = jets[i + 1];
						jets[i + 1] = jets[i];
						jets[i] = jetStore2;
					}
				} catch (ArrayIndexOutOfBoundsException e) {
					if (jets[i].getRange() < jets[i].getRange()) {
						Jets jetStore2 = jets[i];
						jets[i] = jets[i];
						jets[i] = jetStore2;
					}
				}
			}
		}
		printJets();
	}

	public void printJets() {
		int listNum = 1;
		System.out.println("---------------------------");
		System.out.println("   model\t\tspeed\t\trange\t\tcapacity\t\tprice\t\tnumPilots");
		for (Jets jet : jets) {
			System.out.println(listNum++ + ") " + jet);
		}
		System.out.println("----------------------------");
	}

	public void enterJets(Scanner kb, Hanger hanger) {
		String model;
		double speed;
		double range;
		int capacity;
		double price;

		System.out.print("Enter model:");
		model = kb.next();
		System.out.print("Enter speed:");
		speed = kb.nextDouble();
		System.out.print("Enter range:");
		range = kb.nextDouble();
		System.out.print("Enter capacity:");
		capacity = kb.nextInt();
		System.out.print("Enter price: ");
		price = kb.nextDouble();
		hanger.addJet(model, speed, range, capacity, price);

	}
}
