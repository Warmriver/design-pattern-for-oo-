package composite.EquimentExample;

import java.util.Iterator;

/**
 * Created by wentian.wang on 25/03/2018
 */
public abstract class Equipment {
    public void add(Equipment equipment){
        throw new UnsupportedOperationException();
    }
    public void remove(Equipment equipment){
        throw new UnsupportedOperationException();
    }

    public String getName(){
        throw new UnsupportedOperationException();
    };
    public Float getPrice(){
        throw new UnsupportedOperationException();
    };
    public Float getPower(){
        throw new UnsupportedOperationException();
    };


}
