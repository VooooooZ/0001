import java.util.Scanner;
import javax.swing.JOptionPane;

public class bender {
    public static void main(String[] args) {
        String credit = JOptionPane.showInputDialog("Ââĺäč ńóěěó ęđĺäčňŕ (đóá.):");
        String procents = JOptionPane.showInputDialog("Ââĺäč ďđîöĺíňíóţ ńňŕâęó:");
        String srokcredit = JOptionPane.showInputDialog("Ââĺäč íŕ ęŕęîé ńđîę áĺđĺňń˙ ęđĺäčň (ěĺń.):");
        double proc = 0;
        double vkl = Double.parseDouble(credit);
        //ńóěěŕ ęđĺäčňŕ
        double procent = Double.parseDouble(procents);
        //ăîäîâŕ˙ ńňŕâęŕ
        double curc = procent / 12;
        //ďđîöĺíňíŕ˙ ńňŕâęŕ â ěĺń˙ö
        double a = Double.parseDouble(srokcredit);
        //ęîë-âî ěĺń˙öĺâ
        int b = 1;
        //íŕ÷ŕëî îň÷ĺňŕ (1 ěĺń˙ö)

        double ss = (1 + curc);
        double result = Math.pow(ss, a);
        //ďđĺäńňŕâëĺíčĺ ôîđěóëű âîçâĺäĺíč˙ â ńňĺďĺíü (1+curc)^a
        double vznoz = vkl * curc / (1 - 1 / result);
        //ńóěěŕ âçíîńŕ â ěĺń˙ö
        double vznz = 0;
        double vzx = vznoz * a - vkl;
        for (b = 1; b <= a; b++) {
            proc = vkl * curc;
            //ďđîöĺíň ďî ęđĺäčňó â ěĺń˙ö
            vznz = vznoz - proc;
            //÷ŕńňü ęđĺäčňíî ńóěěű äë˙ ďîăŕřĺíč˙
            vkl = vkl - vznz;
            //îńňŕňî÷íŕ˙ ÷ŕńňü ęđĺäčňŕ íŕ ęîíĺö ěĺń˙öŕ
            System.out.println(b + " ěĺń˙ö" + "\t" + vznoz + "\t" + proc +"\t" + vznz + "\t" + vkl);
        }
        {
            System.out.println("Čňîăî ďĺđĺďëŕňŕ çŕ  " + a/12 + " ëĺň (ăîäŕ) ńîńňŕâčëŕ:   " + vzx);
        }
    }
}
