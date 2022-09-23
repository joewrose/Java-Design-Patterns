
public class ChristmasTreeDecorator implements ChristmasTree{

	public ChristmasTree tree;
	
	@Override
	public String decorate() {
		return tree.decorate();
	};

}
