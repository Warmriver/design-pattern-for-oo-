package decorator装饰模式.badExample;

/**
 * Created by wentian.wang on 02/04/2018
 */
public class ZhangjianggaokeAssetVendor extends AssetVendorDecorator {
    public ZhangjianggaokeAssetVendor(AssetVendor assetVendor) {
        super(assetVendor);
        System.out.println("this is zhangjianggaoke assetvendor");
    }

    @Override
    public String showBill() {
        return "bill: 20 in zjgk";
    }

//    @Override
//    public void ping() {
//        System.out.println("pong in zjgk");
//    }

}
