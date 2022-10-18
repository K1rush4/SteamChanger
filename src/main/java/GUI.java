import java.awt.event.*;
import javax.swing.*;
public class GUI {
    void window() {
        JFrame f;
        f = new JFrame();
        f.setSize(550, 600);

        QiwiChanger QiwiChanger = new QiwiChanger();
        MarketChanger MarketChanger = new MarketChanger();


        //Qiwi
        JLabel l1 = new JLabel("Баланс счета Qiwi, руб");
        l1.setBounds(50, 50, 200, 30);
        f.add(l1);

        JLabel l2 = new JLabel("Баланс счета Steam, руб");
        l2.setBounds(300, 50, 200, 30);
        f.add(l2);

        JTextField t1 = new JTextField();
        t1.setBounds(50, 100, 200, 30);
        f.add(t1);

        JLabel l3 = new JLabel("Ожидание ввода данных...");
        l3.setBounds(300, 100, 200, 30);
        f.add(l3);

        JButton b1 = new JButton("Рассчитать");
        b1.setBounds(225, 175, 100, 30);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String QiwiResoult = QiwiChanger.main(t1.getText());
                l3.setText(QiwiResoult);
            }
        });
        f.add(b1);


        //Market
        //1 column
        JLabel l4 = new JLabel("Цена вещи на Market");
        l4.setBounds(50, 250, 200, 30);
        f.add(l4);

        JTextField t2 = new JTextField();
        t2.setBounds(50, 300, 200, 30);
        f.add(t2);

        JLabel l5 = new JLabel("Цена вещи в Steam");
        l5.setBounds(50, 350, 200, 30);
        f.add(l5);

        JTextField t3 = new JTextField();
        t3.setBounds(50, 400, 200, 30);
        f.add(t3);

        //2 column
        JLabel l6 = new JLabel("На баланс Steam Вы получите:");
        l6.setBounds(300, 250, 200, 30);
        f.add(l6);

        JLabel l7 = new JLabel("Ожидание ввода данных...");
        l7.setBounds(300, 300, 200, 30);
        f.add(l7);

        JLabel l8 = new JLabel("КДП данного оборота");
        l8.setBounds(300, 350, 200, 30);
        f.add(l8);

        JLabel l9 = new JLabel("Ожидание ввода данных...");
        l9.setBounds(300, 400, 200, 30);
        f.add(l9);

        JButton b2 = new JButton("Рассчитать");
        b2.setBounds(225, 475, 100, 30);
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String SteamResoult = MarketChanger.MarketCacl(t2.getText());
                String KPDResoult = MarketChanger.MarketKPD(t2.getText(), t3.getText());
                l7.setText(SteamResoult);
                l9.setText(KPDResoult);
            }
        });
        f.add(b2);

        f.setLayout(null);
        f.setVisible(true);
    }

}
