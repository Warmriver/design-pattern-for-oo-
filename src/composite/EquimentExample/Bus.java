package composite.EquimentExample;


import tools.JsonHelper;

/**
 * Created by wentian.wang on 25/03/2018
 */
public class Bus extends CompositeEquipment {
    private String cabiNo;


    public Bus(String cabiNo, Float power) {
        this.cabiNo = cabiNo;

    }

    public String getCabiNo() {
        return cabiNo;
    }

    public void setCabiNo(String cabiNo) {
        this.cabiNo = cabiNo;
    }



    @Override
    public String toString() {
        return JsonHelper.toJson(this);
    }
}
