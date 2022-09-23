
public class Baubles extends ChristmasTreeDecorator{

	public Baubles(ChristmasTree inputTree) {
		tree = inputTree;
	}
	
	@Override
	public String decorate() {
		return tree.decorate() + "\n    Baubles";
	}
}


public class Product {
	
	public int setNo(int currentStock) {
		int numberOfBatches;
		
		if (currentStock <= 50) {
			numberOfBatches = ((100 - currentStock)/ 10);
		}
		return numberOfBatches;
	}
	
}