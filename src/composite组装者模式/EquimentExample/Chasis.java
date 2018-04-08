package composite.EquimentExample;

import tools.JsonHelper;

/**
 * Created by wentian.wang on 25/03/2018
 */
public class Chasis extends CompositeEquipment {
    private String aliasName;

    public Chasis(String aliasName) {
        this.aliasName = aliasName;
    }

    public String getAliasName() {
        return aliasName;
    }

    public void setAliasName(String aliasName) {
        this.aliasName = aliasName;
    }



    @Override
    public String toString() {
        return JsonHelper.toJson(this);
    }
}
