// 一个atm类，有权限查询账户
public class ATMMachine implements getBalanceData{
    //实际查询了余额
    @Override
    public Float getCashLeft(){
        return 1000.00f;
    }
}