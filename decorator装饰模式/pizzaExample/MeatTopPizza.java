package decorator装饰模式.pizzaExample;

/**
 * Created by wentian.wang on 02/04/2018
 */
public class MeatTopPizza extends ToppingPizzaDecorator{
    public MeatTopPizza(Pizza makingPizza) {
        super(makingPizza);
    }


    @Override
    public String getDes() {
        return makingPizza.getDes() +"\ntop再加一些肉丸子";
    }

    @Override
    public long getCost() {
        return makingPizza.getCost() + 5l;
    }
}
