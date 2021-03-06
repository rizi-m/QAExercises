package paint;

import java.util.ArrayList;
import java.util.Comparator;

public class PaintWizard {

	private ArrayList<Paint> paints = new ArrayList<>();
	
	public void add(Paint paint) {
		paints.add(paint);
	}
	
	private int waste(Paint paint, int area) {
		return (int) (paint.getAreaCovered() * Math.ceil((double) area / paint.getAreaCovered()) ) - area;
	}
	
	public Paint getMostEfficientPaint(int roomArea) {
		return paints.stream()
			.min(Comparator.comparing(paint -> waste(paint, roomArea)))
			.get();
	}

	public Paint getCheapestPaintInStock() {
		return paints.stream()
				.min(Comparator.comparing(Paint::getPrice))
				.get();
	}
	
	public Paint getCheapestPaintFor(int roomArea) {
		Paint cheapestInStock = getCheapestPaintInStock();
		Paint mostEfficient = getMostEfficientPaint(roomArea);
		if (mostEfficient.getPrice() == cheapestInStock.getPrice()) {
			return mostEfficient;
		}
		int amountToBuyForMostEfficient = (int) Math.ceil((double) roomArea / mostEfficient.getAreaCovered());
		int amountToBuyForCheapest = (int) Math.ceil((double) roomArea / cheapestInStock.getAreaCovered());
		
		if (amountToBuyForCheapest * cheapestInStock.getPrice() > amountToBuyForMostEfficient * mostEfficient.getPrice()) {
			return mostEfficient;
		} else {
			return cheapestInStock;
		}
	}
	
	public static void main(String[] args) {
		PaintWizard wizard = new PaintWizard();
		
		wizard.add(new Paint("CheapoMax", 20, 19.99f, 10));
		wizard.add(new Paint("AverageJoes", 15, 17.99f, 11));
		wizard.add(new Paint("DuluxourousPaints", 10, 25.00f, 20));
		

	}
}
