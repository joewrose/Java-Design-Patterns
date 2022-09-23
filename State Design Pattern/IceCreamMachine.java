
public class IceCreamMachine {
	public IceCreamState machineState;
	
	public IceCreamState getState() {
		return this.machineState;
	}
	
	public void setState(IceCreamState state) {
		this.machineState = state;
        this.machineState.getState();
        try {
            Thread.sleep(300);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        this.machineState.setState();

	}
	
	private void startMachine() {
		setState(new StartState(this));
	}
	
	public static void main(String[] args) {
		IceCreamMachine machine = new IceCreamMachine();
		machine.startMachine();
	}
}
