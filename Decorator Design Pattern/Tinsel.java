
public class Tinsel extends ChristmasTreeDecorator{

	public Tinsel(ChristmasTree inputTree) {
		tree = inputTree;
	}
	
	@Override
	public String decorate() {
		return tree.decorate() + "\n    Tinsel";
	}
}
