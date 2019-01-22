package paint;

public class Paint {

	private String name;
	private int volume;
	private float price;
	private int areaPerLitre;
	
	public Paint(String name, int volume, float price, int areaPerLitre) {
		super();
		this.name = name;
		this.volume = volume;
		this.price = price;
		this.areaPerLitre = areaPerLitre;
	}

	public String getName() {
		return name;
	}

	public float getPrice() {
		return price;
	}

	public int getAreaPerLitre() {
		return areaPerLitre;
	}
	
	public int getAreaCovered() {
		return volume * areaPerLitre; 
	}
	
	@Override
	public String toString() {
		return name;
	}

}
