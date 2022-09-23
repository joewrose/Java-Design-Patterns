
public class Current {
	private int amplitude;
	private int phase;
	private boolean AC;
	
	Current(int amplitude, int phase, boolean ac){
		this.amplitude = amplitude;
		this.phase = phase;
		this.AC = ac;
	}

	public int getAmplitude() {
		return amplitude;
	}

	public int getPhase() {
		return phase;
	}

	public boolean isAC() {
		return AC;
	}
}
