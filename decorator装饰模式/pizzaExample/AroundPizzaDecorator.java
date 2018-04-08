package decorator装饰模式.pizzaExample;

/**
 * Created by wentian.wang on 02/04/2018
 */
public class AroundPizzaDecorator implements Pizza {
    protected  Pizza makingPizza;

    public AroundPizzaDecorator(Pizza makingPizza) {
        this.makingPizza = makingPizza;
    }

    @Override
    public String getDes() {
        return makingPizza.getDes();
    }

    @Override
    public long getCost() {
        return makingPizza.getCost();
    }
}
