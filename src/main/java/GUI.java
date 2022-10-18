import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI {
    void window() {
        JFrame f;
        f = new JFrame();
        f.setSize(550, 600);

        QiwiChanger QiwiChanger = new QiwiChanger();
        MarketChanger MarketChanger = new MarketChanger();
        Reader Reader = new Reader();
        Color ColorLightLightGray = new Color(215,215,215);


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

        JPanel p1 = new JPanel();
        p1.setBounds(295,100,200,30);
        p1.setBackground(ColorLightLightGray);
        f.add(p1);

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

        JPanel p2 = new JPanel();
        p2.setBounds(295,300,200,30);
        p2.setBackground(ColorLightLightGray);
        f.add(p2);

        JLabel l8 = new JLabel("КДП данного оборота:");
        l8.setBounds(300, 350, 200, 30);
        f.add(l8);

        JLabel l9 = new JLabel("Ожидание ввода данных...");
        l9.setBounds(300, 400, 200, 30);
        f.add(l9);

        JPanel p3 = new JPanel();
        p3.setBounds(295,400,200,30);
        p3.setBackground(ColorLightLightGray);
        f.add(p3);

        JButton b2 = new JButton("Рассчитать");
        b2.setBounds(225, 475, 100, 30);
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String SteamResoult = MarketChanger.MarketCacl(t3.getText());
                String KPDResoult = MarketChanger.MarketKPD(t2.getText(), t3.getText());
                l7.setText(SteamResoult);
                l9.setText(KPDResoult);
            }
        });
        f.add(b2);


        //Справка
        JFrame f2;
        f2 = new JFrame();
        f2.setSize(800, 350);

        JButton b3 = new JButton("Справка");
        b3.setBounds(425, 525, 90, 25);
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f2.setVisible(true);
            }
        });
        f.add(b3);

        JLabel l10 = new JLabel(Reader.read("reference.txt"));
        l10.setBounds(35, -40, 4000, 300);
        f2.add(l10);

        JLabel l11 = new JLabel();
        l11.setBounds(550, 220, 1000, 30);
        l11.setText("Обратная связь tg: @K1rush444");
        f2.add(l11);

        JButton b4 = new JButton("Закрыть");
        b4.setBounds(350, 250, 100, 30);
        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f2.setVisible(false);
            }
        });
        f2.add(b4);


        f.setLayout(null);
        f2.setLayout(null);
        f.setVisible(true);
    }

}