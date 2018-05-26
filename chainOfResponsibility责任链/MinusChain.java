
package chainOfResponsibility责任链;
public class MinusChain implements Chain{
    private Chain nextChain;
    public Chain setNextChain(Chain chain){
        this.nextChain = chain;
        return nextChain;
    }
    public Integer cal(Numbers req){
        if(req.getAct().equals("minus")){
            return req.getNum1() - req.getNum2();
        } else {

            nextChain.cal(req);
        }
        return null;
    }
}