package IneedMoney;

public abstract class Banks {
    private double persent;
    private double maxcash;
    private double fDeposit; //esli klient kupit tovar v kredit
    private double mPayment;
    private int month;
    private double salary;// salary of clients
    public abstract double pay(double money,int month, double persnet);
    public abstract void check(double salary);

}
