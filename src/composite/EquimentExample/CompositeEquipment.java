package composite.EquimentExample;

import tools.JsonHelper;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by wentian.wang on 25/03/2018
 */
public class CompositeEquipment extends Equipment {
    private String name;
    private Float price;
    private Float power;

    private List<Equipment> equipments = new ArrayList<>();

    public CompositeEquipment(String name, Float price, Float power) {
        this.name = name;
        this.price = price;
        this.power = power;
    }

    public CompositeEquipment() {
    }

    public void add(Equipment equipment){
        equipments.add(equipment);
    }
    public void remove(Equipment equipment){
        equipments.remove(equipment);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Float getPower() {
        return power;
    }

    public void setPower(Float power) {
        this.power = power;
    }

    public void showHisEquipments(){
        System.out.println(getName()+"'s equipments are below");
        for(Equipment e : equipments){
            System.out.println(e.getName()+", powered by"+e.getPower()+" at a price of"+e.getPrice());
        }
    }

    @Override
    public String toString() {
        return JsonHelper.toJson(this);
    }
}
