package decorator装饰模式.pizzaExample;

/**
 * Created by wentian.wang on 02/04/2018
 */
public class Main {
    public static void main(String[] args) {
        Pizza stillMakingPizza = new MeatTopPizza(new CheeseTopPizza(new PlainPizza()));
        Pizza finalPizza = new CheeseAroundPizza(stillMakingPizza);
        System.out.println(finalPizza.getDes());
        System.out.println(finalPizza.getCost() + "元");
    }
}
