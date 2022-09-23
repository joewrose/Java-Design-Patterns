
public class CoffeeFactoryStandard implements CreateCoffee{

	@Override
	public Coffee orderCoffee(CoffeeType coffeeType) {
		Coffee coffee = null;
		
		switch(coffeeType){
			case LATTE:
				coffee = new Latte();
				break;
			case ESPRESSO:
				coffee = new Espresso();
				break;
			case AMERICANO:
				coffee = new Americano();
				break;
		}
		return coffee;
	}

}
