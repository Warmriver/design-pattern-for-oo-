package decorator装饰模式.badExample;

/**
 * Created by wentian.wang on 02/04/2018
 */
public class PlainAssetVendor implements AssetVendor{
    @Override
    public String showBill() {
        return "  bill showed in plain  ";
    }

    @Override
    public void delete() {
        throw new RuntimeException("no auth in pain");
    }

    @Override
    public void ping() {
        System.out.println("PONG in plain");
    }


}
