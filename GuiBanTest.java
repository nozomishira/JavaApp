import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/** GuiBan クラスをテストするクラス */
class GuiBanTest extends JFrame implements ActionListener {
    /** GUI バージョンの盤 */
    GuiBan gBan;
    /** メッセージラベル */
    JLabel label;
    /** 次がマルかバツか */
    int maruBatsu;

    GuiBanTest() {
        gBan = new GuiBan(this);
        label = new JLabel("GUI の三目並べまであと少し");
        maruBatsu = Ban.MARU;
        
        setTitle("GuiBanTest");
        setBounds(100, 150, 200, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(label, BorderLayout.NORTH);
        add(gBan.getPanel(), BorderLayout.CENTER);
        setVisible(true);
    }

    /** ボタンが押された時のアクション */
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() instanceof GuiMasu) {
            GuiMasu m = (GuiMasu)e.getSource();
            int x = m.getZahyo().getX();
            int y = m.getZahyo().getY();
            if (gBan.put(x, y, maruBatsu)) {
                label.setText(String.format("(%d,%d) に %s", x, y, maruBatsu==Ban.MARU ? "マル" : "バツ"));
                maruBatsu = maruBatsu==Ban.MARU ? Ban.BATSU : Ban.MARU;
            }
        }
    }

    public static void main(String[] args) {
        new GuiBanTest();
    }
}

