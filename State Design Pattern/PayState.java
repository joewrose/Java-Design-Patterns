
public class PayState implements IceCreamState{
	
	private IceCreamMachine machine;
	
	public PayState(IceCreamMachine machine) {
		this.machine = machine;
	}

	@Override
	public void setState() {
		this.machine.setState(new DispenseState(this.machine));
		
	}
	
	@Override
	public void getState() {
		System.out.println("Pay");
		
	}
}
