
package chainOfResponsibility责任链;
public class Numbers{
    private String act;
    private Integer num1;
    private Integer num2;
    Numbers(Integer n1, Integer n2, String act){
        this.act = act;
        this.num1 = n1;
        this.num2 = n2;
    }
    public String getAct(){
        return act;
    }
    public Integer getNum1(){
        return num1;
    }
    public Integer getNum2(){
        return num2;
    }
}