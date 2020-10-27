class Car1 {
    // フィールドの定義
    private double qua;
    private double rep;
    private double dis;
    private double rest;

    /** ガソリンの初期残量付きコンストラクタ */
    Car1(double quantity) {
        // コードを記述
        qua = quantity;

    }

    /** ガソリンの給油
        @return 給油後の残量を返す */
    double replenish (double quantity) {
        // コードを記述
        rep = qua + quantity;
        return rep;
    }

    /** 走行（距離）
        @return 走行距離を返す */
    double run (double distance) {
        // コードを記述
        dis=distance;
        rest =  rep -(dis/10);
        return dis;
    }

    /** ガソリンの残量を表示するメソッド */
    void print() {
        // コードを記述
        System.out.println("残り" + rest +"リットル");
    }
}
