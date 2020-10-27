class Car2{

    private int  numb;
    private double qua;
    private double rep;
    private double dis;
    private double nenp;

    int  regNumber(int number){
        numb=number;
        return numb;
    }

    Car2(double quantity, double mm){
         qua = quantity;
         nenp = mm;
    }
    
    double replenish(double quantity){
        rep = qua + quantity;
        return rep;
    }
    
    double run(double distance){
        dis=distance;
        rep =  rep -(dis/nenp);
    return dis;
    }
    void print(){
        System.out.println("ナンバー"+ numb +":" + "残り" + rep +"リットル");

    }
}


class Ex22 {
    public static void main ( String[] args ) {
        int num = 1234; // ナンバー
        double m = 12.0; // 燃費
        if (args.length == 2) { // 引数で燃費とナンバーを指定する
            num = Integer.parseInt(args[0]);
            m = Double.parseDouble(args[1]);
        }

        Car2 myCar;
        // 初期のガソリン量は10.0 リットル
        // 燃費は12.0 km/l
        myCar = new Car2(10.0, m);
        // ナンバー（int 型．4 桁の整数部分のみ）を登録
        myCar.regNumber(num);
        // 10 リットル給油
        myCar.replenish(10);
        // 24 km 走行
        myCar.run(24);
        // ナンバーとガソリンの残りを表示．「ナンバー1234: 残り18.0 リットル」など
        myCar.print();
    }
}
