package composite.EquimentExample;

import tools.JsonHelper;

/**
 * Created by wentian.wang on 25/03/2018
 */
public class Cabinet extends CompositeEquipment {

    private String manu;



    public String getManu() {
        return manu;
    }

    public void setManu(String manu) {
        this.manu = manu;
    }

    public Cabinet(String name, Float price, Float power, String manu) {
        super(name, price, power);
        this.manu = manu;
    }

    @Override
    public String toString() {
        return JsonHelper.toJson(this);
    }
}
