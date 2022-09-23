
public class AmericanPlug {
	
	Adapter adapter;
	
	public void setAdapter(Adapter adapter) {
		this.adapter = adapter;
	}
	
	public void transferCurrent(Current current) {
		adapter.adapt(current);
	}
	
	public static void main(String[] args) {
		AmericanPlug plug = new AmericanPlug();
		Current blender = new Current(120,30,false);
		Current microwave = new Current(90,60,true);
		
		plug.setAdapter(new UKAdapter());

		plug.transferCurrent(microwave);
		plug.transferCurrent(blender);
	}
}
