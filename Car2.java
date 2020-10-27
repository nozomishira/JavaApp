class Car2{

     int  numb;
     double rep;
     double dis;
    double nenp;

    int  regNumber(int number){
        numb=number;//ナンバー
        return numb;
    }

    Car2(double quantity, double mm){
         rep = quantity;//初期値　どのくらいガソリン入っているか
         nenp = mm;//燃費　１㎞どのくらい減るか
    }
    
    double replenish(double quantity){
        rep = rep + quantity;////給油量
        return rep;
    }
    
    double run(double distance){
        dis=distance; //走行距離
        rep =  rep -(dis/nenp);//残り
    return dis;
    }
    void print(){
        System.out.println("ナンバー"+ numb +":" + "残り" + rep +"リットル");

    }
}
