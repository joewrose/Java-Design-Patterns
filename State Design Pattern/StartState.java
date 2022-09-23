
public class StartState implements IceCreamState{
	
	private IceCreamMachine machine;
	
	public StartState(IceCreamMachine machine) {
		this.machine = machine;
	}

	@Override
	public void setState() {
		this.machine.setState(new PayState(this.machine));
		
	}
	
	@Override
	public void getState() {
		System.out.println("START");
		
	}
}
