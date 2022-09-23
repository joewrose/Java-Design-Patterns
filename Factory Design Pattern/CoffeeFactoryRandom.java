import java.util.Random;
public class CoffeeFactoryRandom implements CreateCoffee{

	@Override
	public Coffee orderCoffee(CoffeeType coffeeType) {
		Coffee coffee = null;
		Random rand = new Random();
		
		int n = rand.nextInt(2);
		
		switch(n){
			case 0:
				coffee = new Latte();
				break;
			case 1:
				coffee = new Espresso();
				break;
			case 2:
				coffee = new Americano();
				break;
		}
		return coffee;
	}

}

