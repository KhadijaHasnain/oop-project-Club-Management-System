package clubmanagementsyslem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Home extends JFrame implements ActionListener{

    JButton view, add, update, remove , bill;
    
    Home() {
        
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1120, 630, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1120, 630);
        add(image);
        
        JLabel heading = new JLabel("Cricket Club");
        heading.setBounds(520, 20, 400, 40);
        heading.setFont(new Font("Raleway", Font.BOLD, 45));
        image.add(heading);
        
        add = new JButton("Add Player");
        add.setBounds(650, 80, 150, 40);
        add.addActionListener(this);
        image.add(add);
        
        view = new JButton("View Player");
        view.setBounds(820, 80, 150, 40);
        view.addActionListener(this);
        image.add(view);
        
        update = new JButton("Update Player");
        update.setBounds(650, 140, 150, 40);
        update.addActionListener(this);
        image.add(update);
        
        remove = new JButton("Remove Player");
        remove.setBounds(820, 140, 150, 40);
        remove.addActionListener(this);
        image.add(remove);
        
        bill = new JButton("Billing");
        bill.setBounds(650, 200, 150, 40);
        bill.addActionListener(this);
        image.add(bill);
        
        setSize(1120, 630);
        setLocation(200, 90);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == add) {
            setVisible(false);
            new Add();
        } else if (ae.getSource() == view) {
            setVisible(false);
            new View();
        } else if (ae.getSource() == update) {
            setVisible(false);
            new Update("");
        }else if (ae.getSource() == bill) {
            setVisible(false);
            new Bill();
        } else {
            setVisible(false);
            new Remove();
        }
    }

    public static void main(String[] args) {
        new Home();
    }
}