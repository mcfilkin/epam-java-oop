package gift;

public abstract class Sweet {
	protected double weight;
	protected String name;
	
	public Sweet(String name, double weight) {
		this.name = name;
		this.weight = weight;
	}
}
