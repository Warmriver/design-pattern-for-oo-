
package chainOfResponsibility责任链;
public interface Chain{
    Chain setNextChain(Chain chain);
    Integer cal(Numbers req);

}