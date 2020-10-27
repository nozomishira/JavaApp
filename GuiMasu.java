import javax.swing.*;

/** 盤面の一マス．座標とそのマスのマル・バツの表示情報を持つ．JButton の派生クラス */
class GuiMasu extends JButton {
    /** ボタンの座標 */
    private final Zahyo zahyo;

    /** 座標が zahyo のマスを表すボタン．2018年版
        @param zahyo マスの座標 */
    GuiMasu(Zahyo zahyo) {
        this.zahyo = zahyo;
    }

    /** 座標が x, y のマスを表すボタン．2019年版
        @param zahyo マスの座標 */
    GuiMasu(int x, int y) {
        this.zahyo = new Zahyo(x, y);
    }

    /** ボタンの座標（Zahyoオブジェクト）を返す
        @return ボタンの座標 */
    Zahyo getZahyo() {
        return zahyo;
    }
}
