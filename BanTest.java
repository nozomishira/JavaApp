/** Ban クラスをテストするクラス */
class BanTest {
    public static void main(String[] args) {
        Ban ban = new Ban();

        if (args.length == 0) {
            System.out.println(ban.isBlank(0, 0));
            ban.put(0, 0, Ban.MARU);
            System.out.println(ban.isBlank(0, 0));
            ban.display();

            ban.put(0, 1, Ban.BATSU);
            System.out.println(ban.isBlank(0, 1));
            ban.display();
        
            displayWonMessage(ban.checkWon());

            ban.put(1, 0, Ban.MARU);
            ban.display();
            ban.put(2, 0, Ban.MARU);
            ban.display();
        
            System.out.println(ban.isFull());
            displayWonMessage(ban.checkWon());
        } else { // 引数は 3 つ組で，x 座標，y 座標，マルかバツ（ 1 か -1 ）
            int x, y, maruBatsu;
            for (int i = 0; i < args.length - 2; i += 3) {
                x = Integer.parseInt(args[i]);
                y = Integer.parseInt(args[i + 1]);
                maruBatsu = Integer.parseInt(args[i + 2]);
                System.out.println(String.format("blank[%d][%d]: %b", x, y, ban.isBlank(x, y)));
                ban.put(x, y, maruBatsu);
                ban.display();
                System.out.println("full: " + ban.isFull());
                displayWonMessage(ban.checkWon());
            }
        }
    }

    static void displayWonMessage(int checkWon) {
        switch (checkWon) {
        case Ban.MARU:
            System.out.println("マルの勝ち");
            break;
        case Ban.BATSU:
            System.out.println("バツの勝ち");
            break;
        case Ban.AKI:
            System.out.println("勝敗はわからない");
            break;
        default:
            System.out.println("checkWon(masu)が想定外の値を返しました");
            break;
        }
    }
}

/*
$ javac BanTest.java
$ java BanTest
false
+---+
|O  |
|   |
|   |
+---+
false
+---+
|OX |
|   |
|   |
+---+
勝敗はわからない
+---+
|OX |
|O  |
|   |
+---+
+---+
|OX |
|O  |
|O  |
+---+
false
マルの勝ち
$ java BanTest 0 0 1 2 0 -1 1 1 1 2 1 -1 2 2 1
blank[0][0]: true
+---+
|O  |
|   |
|   |
+---+
full: false
勝敗はわからない
blank[2][0]: true
+---+
|O  |
|   |
|X  |
+---+
full: false
勝敗はわからない
blank[1][1]: true
+---+
|O  |
| O |
|X  |
+---+
full: false
勝敗はわからない
blank[2][1]: true
+---+
|O  |
| O |
|XX |
+---+
full: false
勝敗はわからない
blank[2][2]: true
+---+
|O  |
| O |
|XXO|
+---+
full: false
マルの勝ち
$ java BanTest 0 0 1 0 2 -1 1 1 1 2 2 -1 2 0 1 1 2 -1
blank[0][0]: true
+---+
|O  |
|   |
|   |
+---+
full: false
勝敗はわからない
blank[0][2]: true
+---+
|O X|
|   |
|   |
+---+
full: false
勝敗はわからない
blank[1][1]: true
+---+
|O X|
| O |
|   |
+---+
full: false
勝敗はわからない
blank[2][2]: true
+---+
|O X|
| O |
|  X|
+---+
full: false
勝敗はわからない
blank[2][0]: true
+---+
|O X|
| O |
|O X|
+---+
full: false
勝敗はわからない
blank[1][2]: true
+---+
|O X|
| OX|
|O X|
+---+
full: false
バツの勝ち
 */
