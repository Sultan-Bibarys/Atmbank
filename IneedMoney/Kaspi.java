package IneedMoney;

public class Kaspi extends Banks{
    public static double persent = 20;

    public static double payM;
    public int month; //for monthly payment
    public double salary;// salary of clients
    public double money;// how much to need money for client
    public Kaspi(int month, double persent, double money){
        this.month = month;
        this.persent = persent;
        this.money = money;
    }
    @Override
    public double pay(double money,int month, double persent) {
        double resultPay = 0;
        resultPay = month;
        return resultPay;
    }
    /*public boolean oppToGetMoney(double moneys,double salary){//opportunity to get money
        boolean result = false;
        double payM = pay(moneys, month, persent);
        double halfSalary = salary / 2;
        if (halfSalary > payM){
            result = true;
            return result;
        }
        return result;
    }*/
    @Override
    public void check(double salary){
        try{
            payM = pay(money, month, persent);
            double halfSalary = salary / 3;
            if (halfSalary > payM){
                toString();
            }
            else{
                throw new Exception ("Вы не можете подать заявку для яполучение кредита");
            }

        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    @Override
    public String toString(){
        return "Вы получили" + money + "\nВаш ежемесячный должен быть: " + payM;
    }
}
