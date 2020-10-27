import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Random;

import java.awt.event.*;

class Ex51 extends JFrame implements ActionListener{
    private JLabel label;
    
    MyListenerFrame(){
        super("sample");
        setBounds(100, 150, 200, 160);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label = new JLabel("North");
        add(label, BorderLayout.NORTH);

        JButton btnCenter = new JButton("Center");
        add(btnCenter, BorderLayout.CENTER);
        btnCenter.addActionListener(this);

        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        JButton btn=(JButton) e.getSource();
        String s;
        s="ボタン"+btn.getText()+"が押されました";
        //label.setText("ボタン"+btn.getText()+"が押されました");
        Random rand = new Random();
        int n = 1+ rand.nextInt(6);
        s=s+"1~6の数値:"+n;
        //label.setText("1~6の数値:"+n);
        label.setText(s);
    }
public static void main(String args[]){
    new MyListenerFrame();
    }
}