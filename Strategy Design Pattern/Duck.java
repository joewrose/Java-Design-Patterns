
public class Duck {
	int size;
	String name;
	QuackBehaviour behaviour;
	
	Duck (int size, String name){
		this.size = size;
		this.name = name;
	}
	
	public QuackBehaviour getBehaviour() {
		return behaviour;
	}

	public void setBehaviour(QuackBehaviour behaviour) {
		this.behaviour = behaviour;
	}

	public void quack() {
		behaviour.quack();
	}
	
	public static void main(String[] args) {
		Duck steve = new Duck(100,"Steve");
		steve.setBehaviour(new memeQuack());
		steve.quack();
	}
}
