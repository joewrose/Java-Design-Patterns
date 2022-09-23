
public class UKAdapter implements Adapter{
	
	UKPlug plug = new UKPlug();

	@Override
	public void adapt(Current current) {
		plug.recieveCurrent(current.getAmplitude()*2,current.getPhase()/2,current.isAC());
	}

}
