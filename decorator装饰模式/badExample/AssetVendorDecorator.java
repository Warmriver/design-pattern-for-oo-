package decorator装饰模式.badExample;

/**
 * Created by wentian.wang on 02/04/2018
 */
abstract class AssetVendorDecorator implements AssetVendor{
    protected AssetVendor assetVendor;
    public AssetVendorDecorator(AssetVendor assetVendor){
        this.assetVendor = assetVendor;
    }

    @Override
    public String showBill() {
        return " bill showd in decorator ";
    }

    @Override
    public void delete() {
        System.out.println("delete ok in decorator");
    }

    @Override
    public void ping() {
//        System.out.println("PONG in decorator");
        assetVendor.ping();
    }
}
