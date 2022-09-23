
public class OrderCoffee {
	public static void main(String[] args) {
		CreateCoffee coffeeOrder = new CoffeeFactoryStandard();
		CreateCoffee coffeeOrderRandom = new CoffeeFactoryRandom();
		
		Coffee coffee = coffeeOrder.orderCoffee(CoffeeType.AMERICANO);
		Coffee secondCoffee = coffeeOrderRandom.orderCoffee(CoffeeType.AMERICANO);
		
		coffee.getCoffee();
		secondCoffee.getCoffee();
	}
}
