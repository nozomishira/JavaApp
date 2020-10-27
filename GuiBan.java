import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/** Ban の派生クラス．Ban と同様に 3x3 の盤面の管理する．盤面を JPanel に表示する．マスの状態は
    GUI と int 型配列の両方に入っているので，両者が一致するように注意して作る． */
class GuiBan extends Ban {
    private GuiMasu[][] masu;
    private JPanel panel;

    /** 盤面を表示する JPanel オブジェクトを用意し，各マスに GuiMasu を並べる．
        @param player マスボタン（ GuiMasu ）が押されたイベントのリスナー */
    GuiBan(ActionListener player) {
        //
        // 課題7 （9 つの GuiMasu オブジェクトを生成し，それらを GuiMasu 配列に格納する．
        //        3x3 のグリッドレイアウトの panel を生成し，GuiMasu オブジェクトを panel に配置する．
        //        GuiMasu の ActionListener を player にする）
        int x, y;
         masu = new GuiMasu[N][N];

        for(x=0;x<3;x++){
            for(y=0;y<3;y++){
                masu[x][y] = new GuiMasu(x,y);  
            }
        }

        panel = new JPanel();
        panel.setLayout(new GridLayout(3,3));

        for(x=0;x<3;x++){
            for(y=0;y<3;y++){
                panel.add(masu[x][y]);
                masu[x][y].addActionListener(player);
            }
        }

        
        //for(int i=0;i<9;i++){
               // JButton btn = (new JButton(Integer.toString(i)));
               // panel.add(btn);
               // addActionListner(player);
            //
       // }

      /*  p.setLayout(new GridLayout(3,3));
        p.add(new JButton(" "));
        p.add(new JButton(" "));
        p.add(new JButton(" "));
        p.add(new JButton(" "));
        p.add(new JButton(" "));
        p.add(new JButton(" "));*/
    }
    
    /** Ban.put() と同様．JPanel 内の (x,y) ボタンの表示を更新する
        @return Ban.put() と同様 */
    boolean put(int x, int y, int maruBatsu) {
        //
        // 課題7 （親クラスの Ban.put を呼び出し，正常にマス (x,y) に置けたか確かめる．
        // 正常にマス (x,y) に置ければ，GUI のマス (x,y) の表示も更新する）
        

        //super.put(x,y,maruBatsu);
        if(super.put(x,y,maruBatsu)==true){
            if(maruBatsu==1)
            masu[x][y].setText("O");
            else if(maruBatsu==-1)
            masu[x][y].setText("x");
            return true;
        }else{
            return false;
        }


      
    }

    /** 盤面を表示している JPanel オブジェクトを返す
        @return GUI パネル */
    JPanel getPanel() {
        return panel;
    }

    /** 盤面を表示する．表示先は内包する JPanel オブジェクト（すでに put() で表示を更新しているので何もしないでよい） */
    void display() {
    }
}
