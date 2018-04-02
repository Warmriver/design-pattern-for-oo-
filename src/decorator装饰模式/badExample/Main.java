package decorator装饰模式.badExample;

/**
 * Created by wentian.wang on 02/04/2018
 */
public class Main {
    public static void main(String[] args) {
//        AssetVendor assetVendor = new ZhangjianggaokeAssetVendor(new EbeiAsseVendor(new PlainAssetVendor()));
        AssetVendor assetVendor = new EbeiAsseVendor(new ZhangjianggaokeAssetVendor(new PlainAssetVendor()));
//        assetVendor.delete();
        assetVendor.ping();
        System.out.println(assetVendor.showBill());
    }
}
