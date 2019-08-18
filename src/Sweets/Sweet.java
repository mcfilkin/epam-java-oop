package Sweets;

public abstract class Sweet implements Eatable {
	protected String name;
	protected double weight;
	protected int energyValue;
	protected PackMaterial packMaterial;
	protected String factory;

	public Sweet(String name, double weight, int energyValue, PackMaterial packMaterial, String factory) {
		this.name = name;
		this.weight = weight;
		this.energyValue = energyValue;
		this.packMaterial = packMaterial;
		this.factory = factory;
	}

	public String getName() {
		return this.name;
	}

	public double getWeight() {
		return this.weight;
	}

	@Override
	public void tryTaste() {
		// TODO Auto-generated method stub

	}
}
