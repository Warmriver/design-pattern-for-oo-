// 第三方代理，对atm进行代理
public class ThirdPartyProxy implements GetBankBalanceData{
    @Override
    public Float getCashLeft(){
        // new 一个atm实例
        ATMMachine atm = new ATMMachine();
        //做一些事情，例如权限校验，计数之类
        doSomething();
        // 使用atm的方法
        return atm.getCashLeft();
    }

    void doSomething(){

    }
}