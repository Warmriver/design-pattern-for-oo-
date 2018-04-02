package decorator装饰模式.pizzaExample;

/**
 * Created by wentian.wang on 02/04/2018
 */
public class CheeseTopPizza extends ToppingPizzaDecorator {
    public CheeseTopPizza(Pizza makingPizza) {
        super(makingPizza);
    }

    @Override
    public String getDes() {
        return makingPizza.getDes() + "\ntop加一些cheese";
    }

    @Override
    public long getCost() {
        return makingPizza.getCost() + 2l;
    }
}
