package gift;

public abstract class Sweet implements Eatable {
	protected double weight;
	protected String name;
	protected int energyValue;
	/* SHOULD FIX DATATYPE*/
	protected String packMaterial;
	protected String components;
	protected String producer;
	
	public Sweet(String name, double weight) {
		this.name = name;
		this.weight = weight;
	}

	@Override
	public void tryTaste() {
		// TODO Auto-generated method stub
		
	}
}
