package gift;

import Sweets.PackMaterial;

public class SweetSearcher {
	private String name = null;
	private boolean partialMatchName;
	private double weight = -1;
	private int compareWeight = 0;
	private int energyValue;
	private int compareEnergyValue = 0;
	private PackMaterial packMaterial = null;
	private String factory = "";
	private boolean partialMatchFactory;
	
	public void addNameCriteria(String name, boolean partialMatch) {
		this.name = name;
		this.partialMatchName = partialMatch;
	}
	
	public void addWeightCriteria(double weight, int compareWeight) {
		this.weight = weight;
		this.compareWeight = compareWeight;
	}
	
	public void addEnergyValueCriteria(int energyValue, int compareEnergyValue) {
		this.energyValue = energyValue;
		this.compareEnergyValue = compareEnergyValue;
	}
	
	public void addEnergyValueCriteria(PackMaterial packMaterial) {
		this.packMaterial = packMaterial;
	}
	
	public void addFactoryCriteria(String factory, boolean partialMatchFactory) {
		this.factory = factory;
		this.partialMatchFactory = partialMatchFactory;
	}
	
	public String getName() {
		return this.name;
	}
	
	public boolean getPartialMatch() {
		return this.partialMatchName;
	}

	public double getWeight() {
		return weight;
	}

	public int getCompareWeight() {
		return compareWeight;
	}

	public int getEnergyValue() {
		return energyValue;
	}

	public int getCompareEnergyValue() {
		return compareEnergyValue;
	}

	public PackMaterial getPackMaterial() {
		return packMaterial;
	}

	public String getFactory() {
		return factory;
	}

	public boolean isPartialMatchFactory() {
		return partialMatchFactory;
	}
}
