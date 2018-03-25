package composite.EquimentExample;

import tools.JsonHelper;

/**
 * Created by wentian.wang on 25/03/2018
 */
public class Floppy extends Equipment {
    private String name;

    public Floppy(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return JsonHelper.toJson(this);
    }
}
