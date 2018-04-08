package decorator装饰模式.pizzaExample;

/**
 * Created by wentian.wang on 02/04/2018
 */
// 基础pizza
public class PlainPizza implements Pizza{

    @Override
    public String getDes() {
        return "\n做一个面饼";
    }

    @Override
    public long getCost() {
        return 1l;
    }
}
