
package chainOfResponsibility责任链;
public class JavaTest{
    public static void main(String[] args){
        Numbers req = new Numbers(3, 2, "minus");
        Chain handler = new AddChain()
        .setNextChain(new MultiChain())
        .setNextChain(new MinusChain());
        System.out.println(handler.cal(req));
    }
}