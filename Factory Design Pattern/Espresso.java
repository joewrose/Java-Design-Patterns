
public class Espresso implements Coffee{
	
	@Override
	public void getCoffee() {
		System.out.println("Preparing Americano...");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
		System.out.println("Americano Served!");
	}

}
