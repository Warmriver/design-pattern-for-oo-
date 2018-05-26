
package chainOfResponsibility责任链;
public class MultiChain implements Chain{
    private Chain nextChain;
    public Chain setNextChain(Chain chain){
        this.nextChain = chain;
        return nextChain;
    }
    public Integer cal(Numbers req){
        if(req.getAct().equals("multi")){
            return req.getNum1() * req.getNum2();
        } else {

            nextChain.cal(req);
        }
        return null;
    }
}