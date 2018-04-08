package decorator装饰模式.pizzaExample;

/**
 * Created by wentian.wang on 02/04/2018
 */

// pizza 基础类
public interface Pizza {
    public String getDes();
    public long getCost();
    int count = 0;
}
