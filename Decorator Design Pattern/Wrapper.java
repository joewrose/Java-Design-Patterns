
public class Wrapper {
	public static void main(String[] args) {
		ChristmasTree tree1 = new Baubles(new ChristmasTreePine());
		System.out.println(tree1.decorate());
		ChristmasTree tree2 = new Tinsel(tree1);
		System.out.println(tree2.decorate());
	}
}
