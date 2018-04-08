package decorator装饰模式.badExample;

/**
 * Created by wentian.wang on 02/04/2018
 */
public class EbeiAsseVendor extends AssetVendorDecorator {
    public EbeiAsseVendor(AssetVendor assetVendor) {
        super(assetVendor);
        System.out.println("this is in ebei asset vendor");
    }

    @Override
    public String showBill() {
        return "bill plus 10 for e bei" + assetVendor.showBill();
    }

    @Override
    public void delete() {
        System.out.println("ebei allowed delete");
    }

    @Override
    public void ping() {
        assetVendor.ping();
    }
}
