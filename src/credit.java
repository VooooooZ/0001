import java.util.Scanner;
import javax.swing.JOptionPane;

public class credit {
    public static void main(String[] args) {
        String credit = JOptionPane.showInputDialog("Введи сумму кредита (руб.):");
        String procents = JOptionPane.showInputDialog("Введи процентную ставку:");
        String srokcredit = JOptionPane.showInputDialog("Введи на какой срок берется кредит (мес.):");
        double proc = 0;
        double vkl = Double.parseDouble(credit);
        //сумма кредита
        double procent = Double.parseDouble(procents);
        //годовая ставка
        double curc = procent / 12;
        //процентная ставка в месяц
        double a = Double.parseDouble(srokcredit);
        //кол-во месяцев
        int b = 1;
        //начало отчета (1 месяц)

        double ss = (1 + curc);
        double result = Math.pow(ss,a);
        //представление формулы возведения в степень (1+curc)^a
        double vznoz = vkl * curc / (1 - 1 / result);
        //сумма взноса в месяц
        double vznz = 0;
        double vzx = vznoz * a - vkl;
        for (b = 1; b <= a; b++) {
            proc = vkl * curc;
            //процент по кредиту в месяц
            vznz = vznoz - proc;
            //часть кредитно суммы для погашения
            vkl = vkl - vznz;
            //остаточная часть кредита на конец месяца
            System.out.println(b + " месяц" + "\t" + vznoz + "\t" + proc +"\t" + vznz + "\t" + vkl);
        }
        {
            System.out.println("Итого переплата за  " + a/12 + " лет (года) составила:   " + vzx);
        }
    }
}
