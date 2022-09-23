
public class DispenseState implements IceCreamState{
	
	private IceCreamMachine machine;
	
	public DispenseState(IceCreamMachine machine) {
		this.machine = machine;
	}

	@Override
	public void setState() {
		System.out.println("END");
		
	}

	@Override
	public void getState() {
		System.out.println("Dispense");
		
	}
}
