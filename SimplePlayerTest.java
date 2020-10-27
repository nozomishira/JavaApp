/** SimplePlayer をテストするクラス */
class SimplePlayerTest {
    public static void main(String[] args) {
        Ban ban = new Ban();

        // SimplePlayer に手を選択させる前に，盤を埋める
        if (args.length == 0) {
            ban.put(0, 0, Ban.MARU);
            ban.put(0, 1, Ban.MARU);
            ban.put(0, 2, Ban.MARU);
            ban.put(1, 0, Ban.MARU);
            ban.put(1, 1, Ban.MARU);
            ban.put(1, 2, Ban.MARU);
            ban.put(2, 0, Ban.MARU);
            ban.put(2, 1, Ban.MARU);
        } else {
            int x, y, maruBatsu;
            for (int i = 0; i < args.length - 2; i += 3) {
                x = Integer.parseInt(args[i]);
                y = Integer.parseInt(args[i + 1]);
                maruBatsu = Integer.parseInt(args[i + 2]);
                ban.put(x, y, maruBatsu);
            }
        }
        ban.display();

        // 「バツ」という名前のバツを置く SimplePlayer を作成する
        AbstractPlayer player1 = new SimplePlayer("バツ", Ban.BATSU);
        System.out.println("プレーヤー「" + player1.getName() + "」は" + (player1.getMaruBatsu()==Ban.MARU ? "O" : "X") + "を置く");
        // SimplePlayer に次の手を選ばせる
        Zahyo z = player1.next(ban);
        System.out.println("X:" + z.getX() + " Y:" + z.getY());
        ban.put(z.getX(), z.getY(), Ban.BATSU);
        ban.display();
    }
}
