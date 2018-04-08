import composite.EquimentExample.Bus;
import composite.EquimentExample.Cabinet;
import composite.EquimentExample.Chasis;
import composite.EquimentExample.Floppy;

public class Main {

    public static void main(String[] args) {

        Cabinet  cabinet = new Cabinet("cabinet1",24.4f,180f,"wd manu");
        Cabinet  cabinet2 = new Cabinet("cabinet2",24.4f,190f,"segate manu");
        Chasis chasis = new Chasis("chas");
        cabinet.add(chasis);

        Bus bus = new Bus("AL110",180f);
        bus.add(cabinet);
        bus.add(cabinet2);
    

        Floppy floppyLeaf = new Floppy("floppy 2nd");
        // leaf不能有子类，基础构件，会报错
        floppyLeaf.add(bus);
        chasis.add(floppyLeaf);

        System.out.println(bus);

    }
}
