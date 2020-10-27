import java.awt.event.*;

/** ウィンドウ上のボタンで次の手を入力する人間プレーヤー */
class GuiPlayer extends AbstractPlayer implements ActionListener {
    /** 次の手を actionPerformed から next に渡すために使う */
    private Zahyo te;

    /** 引数は AbstractPlayer と同じ
        @param name プレーヤー名
        @param maruBatsu このプレーヤーがマルかバツか（ Ban.MARU または Ban.BATSU ） */
    GuiPlayer(String name, int maruBatsu) {
        super(name, maruBatsu);
    }

    /** 次の手を返す．次の手は GuiMasu ボタンから得る．ボタンが押されるまで待つ．
        @param ban 盤
        @return 次の手（の座標） */
    synchronized Zahyo next(Ban ban) {
        // 
        // 課題8
        // 
        //super.Zahyo(Ban,ban);
        int x, y;
        while(true){
            try{
                wait();
            } catch (InterruptedException te){

            }
            x=te.getX();
            y=te.getY();
            if(ban.isBlank(x,y)==true)
               return te; 
        }
        
        //return te;
    }

    /** ActionListener のメソッド．GuiMasu ボタンが押されたときに，このボタンのマスを次の手 te に代入して，next メソッドに渡す． */
    public synchronized void actionPerformed(ActionEvent e) {
        // 
        // 課題8
        // 
       
        if (e.getSource() instanceof GuiMasu) {
            GuiMasu m = (GuiMasu)e.getSource();
            te = m.getZahyo();
            this.notify();
            //int x = m.getZahyo().getX();
            //int y = m.getZahyo().getY();
            //if (gBan.put(x, y, maruBatsu)){
               // label.setText(String.format("(%d,%d) に %s", x, y, maruBatsu==Ban.MARU ? "マル" : "バツ"));
               // maruBatsu = maruBatsu==Ban.MARU ? Ban.BATSU : Ban.MARU;
              // e = te;
               //next(e);
            }
        }
    

           //this.notify();
           //e = te;
           //next(e);
    }


