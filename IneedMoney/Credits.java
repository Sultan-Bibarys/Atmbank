package IneedMoney;
import com.sun.scenario.effect.impl.state.AccessHelper;

import java.util.*;
public class Credits {
    static Scanner input = new Scanner(System.in);
    public static double money = 100;
    static int month;
    static double salary;
    public static void main(String[]args){
        System.out.println("Добро пожаловать!!!!! \nДля того чтобы получить кредит вы должны зарегистрироваться");

        System.out.println("Ваше имя и фамилия");
        String fullName = input.nextLine();

        System.out.println("Сколько вы получаете в месяц" + fullName + " ?");
        salary = input.nextDouble();

        System.out.println("Сколько вы хотите получить?");
        money = input.nextDouble();

        System.out.println("За сколько месяцев вы можете закрыть кредить?\n 12\t24\t36");
        month = input.nextInt();
        call();
        /*System.out.println("Хотите посмотреть другие банки?");
        System.out.println("Да---1\t Нет---0");
        int answer = input.nextInt();
        if(answer==1){
            call();
        }
        else{
            System.out.println("Пока");
        }*/
    }
    public static void call(){
        System.out.println("Какой банк хотите выбрать?");
        System.out.println("HalykBank(15%)--1 \t KaspiBank(20%)--2\t JusanBank(30%)--3\t Sberbank(25%)--4");

        int banks = input.nextInt();
        switch (banks){
            case 1: halykCall(); break;
            case 2: kaspiCall(); break;
            case 3: jusanCall(); break;
            case 4: sberbankCall(); break;
        }
    }
    public static void halykCall(){

        Halyk halyk = new Halyk(month, Halyk.persent,money);
        halyk.check(salary);
    }
    public static void kaspiCall(){

        Kaspi kaspi = new Kaspi(month, Kaspi.persent,money);
        kaspi.check(salary);
    }
    public static void jusanCall(){

        Jusan jusan = new Jusan(month, Jusan.persent,money);
        jusan.check(salary);
    }
    public static void sberbankCall(){

        Sberbank sber = new Sberbank(month, Sberbank.persent,money);
        sber.check(salary);
    }
}
