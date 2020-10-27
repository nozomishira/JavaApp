/** GameField クラスをテストするクラス */
class GameFieldTest {
    public static void main(String[] args) {
        SimplePlayer p1 = new SimplePlayer("田中", Ban.MARU);
        SimplePlayer p2 = new SimplePlayer("菊池", Ban.BATSU);
        Ban ban = new Ban();
        GameField gf = new GameField(p1, p2, ban);
        gf.play();
    }
}
