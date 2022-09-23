
public class Latte implements Coffee{

	@Override
	public void getCoffee() {
		System.out.println("Preparing Latte...");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
		System.out.println("Latte Served!");
	}

}
