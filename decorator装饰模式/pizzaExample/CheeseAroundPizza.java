package decorator装饰模式.pizzaExample;

/**
 * Created by wentian.wang on 02/04/2018
 */
public class CheeseAroundPizza extends AroundPizzaDecorator {
    public CheeseAroundPizza(Pizza makingPizza) {
        super(makingPizza);
    }

    @Override
    public String getDes() {
        return makingPizza.getDes() + "\n周边加芝士边，多2元";
    }

    @Override
    public long getCost() {
        return makingPizza.getCost() + 2l;
    }
}
