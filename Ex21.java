class Car1{

    private double qua;
    private double rep;
    private double dis;
    private double rest;

    Car1(double quantity){
         qua = quantity;
    }
    
    double replenish(double quantity){
        rep = qua + quantity;
        return rep;
    }
    
    double run(double distance){
        dis=distance;
        rest =  rep -(dis/10);
        return dis;
    }
    void print(){
        System.out.println("残り" + rest +"リットル");

    }
}



class Ex21 {
    public static void main(String[] args) {
        double q = 10, d = 20;
        if (args.length == 2) { // 引数で給油量と走行距離を指定する
            q = Double.parseDouble(args[0]);
            d = Double.parseDouble(args[1]);
        }

        Car1 myCar;
        myCar = new Car1(1.0);
        // 10 リットル給油
        myCar.replenish(q);
        // 20 km 走行
        myCar.run(d);
        // ガソリンの残りを表示．「残り8.0 リットル」など
        myCar.print();
    }
}
